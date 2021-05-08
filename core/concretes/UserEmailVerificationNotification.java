package core.concretes;

import core.abstracts.UserVerificationNotification;
import entities.concretes.User;

public class UserEmailVerificationNotification implements UserVerificationNotification {

	@Override
	public boolean sendUserVerification(User user) {
		if(user.getEmail().length() > 8 && user.getEmail().contains("@")) {
			System.out.println("Kullanıcı email doğrulandı :" + user.getEmail());
			return true;
		}else 
			System.out.println("Kullanıcı email doğrulanamadı");
		return false;
	}

}
