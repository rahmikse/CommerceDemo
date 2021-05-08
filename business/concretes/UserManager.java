package business.concretes;



import java.util.List;

import business.abstracts.UserService;
import core.abstracts.UserAuthenticationService;
import core.abstracts.UserVerificationNotification;
import dataaccess.abstracts.UserDao;
import entities.concretes.User;
import utils.abstracts.UtilsService;

public class UserManager implements UserService {

	private UtilsService utilsService;
	private UserDao userDao;
	private UserAuthenticationService userAuthenticationService;
	private UserVerificationNotification userVerificationNotification;

	 public UserManager(UtilsService utilsService,
			UserDao userDao,
			UserAuthenticationService userAuthenticationService,
			UserVerificationNotification userVerificationNotification){
		
		this.utilsService = utilsService;
		this.userDao = userDao;
		this.userAuthenticationService = userAuthenticationService;
		this.userVerificationNotification = userVerificationNotification;
	}

	@Override
	public void add(User user) {
		List<String> userData = userAuthenticationService.signIn(user.getEmail(), user.getPassword());
		
		if(userData.size() == 2) {
			
			boolean isEmailValid = utilsService.validateEmail(user.getEmail());
			boolean isPasswordValid =utilsService.validatePassword(user.getPassword());
			boolean isFirstNameValid =utilsService.validateFirstName(user.getFirstName());
			boolean isLastNameValid =utilsService.validateLastName(user.getLastName());
			if(isEmailValid && isPasswordValid && isFirstNameValid && isLastNameValid) {
				
				if(userVerificationNotification.sendUserVerification(user))
					userDao.add(user);
				
			}else {
				System.out.println("Verileri kontrol ediniz");
			}
		}else {
			System.out.println("Geçersiz email veya şifre");
		}

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

}
