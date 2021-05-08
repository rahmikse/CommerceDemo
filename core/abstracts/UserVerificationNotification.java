package core.abstracts;

import entities.concretes.User;

public interface UserVerificationNotification {

	public boolean sendUserVerification(User user) ;
}
