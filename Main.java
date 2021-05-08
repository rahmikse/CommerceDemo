import java.util.List;

import business.abstracts.UserService;
import business.concretes.UserManager;
import core.abstracts.UserAuthenticationService;
import core.abstracts.UserVerificationNotification;
import core.concretes.UserAuthenticatinManager;
import core.concretes.UserSmsVerificationNotification;
import dataaccess.concretes.HibernateUserManager;
import entities.concretes.User;
import utils.concretes.UtilsManager;

public class Main {

	public static void main(String[] args) {

		UserService userService = new UserManager(new UtilsManager(), new HibernateUserManager(),new UserAuthenticatinManager(),new UserSmsVerificationNotification());

		User user = new User(1, "Rahmi", "Köse", "rahmikse@gmail.com", "rk1234");
		User user2 = new User(2, "Serhat", "Köse", "serhatkse@gmail.com", "sk5678");


		userService.add(user);
		userService.add(user2);
		

	}

}
