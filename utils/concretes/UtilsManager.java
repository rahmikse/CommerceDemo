package utils.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utils.abstracts.UtilsService;

public class UtilsManager implements UtilsService {

	@Override
	public boolean validateFirstName(String firstName) {
		if(firstName.length()>=2) {
			return true;
		}
		System.out.println("Geçersiz İsim:" + firstName);
		return false;
	}

	@Override
	public boolean validateLastName(String lastName) {
		if(lastName.length()>=2) {
			return true;
		}
		System.out.println("Geçersiz Soyad:" + lastName);
		return false;
	}

	@Override
	public boolean validateEmail(String email) {
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(regex);
	
		Matcher matcher = pattern.matcher(email);
		System.out.println(email +" : "+ matcher.matches());
		
		boolean isValidated = matcher.matches();
		
		if(isValidated == false)
			System.out.println("Geçersiz: "+ email);
		
		return isValidated;
	}

	@Override
	public boolean validatePassword(String password) {
		if(password.length()>=6) {
			return true;
		}
		System.out.println("Geçersiz Şifre:" +password);
		return false;
	}
	
	

}
