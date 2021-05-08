package core.concretes;

import core.abstracts.UserVerificationNotification;
import entities.concretes.User;

public class UserSmsVerificationNotification implements UserVerificationNotification {

	
		


	@Override
	public boolean sendUserVerification(User user) {
		if(user.getEmail().length() > 8 && user.getEmail().contains("@")) {
			System.out.println("Doğrulanan kullancı email :" + user.getEmail());
			return true;
		}else 
			System.out.println("Kullanıcı doğrulama Başarısız");
		
		return false;
	}
}