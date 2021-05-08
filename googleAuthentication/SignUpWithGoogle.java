package googleAuthentication;

import java.util.ArrayList;
import java.util.List;

public class SignUpWithGoogle {

public List<String> signUp(String email, String password) {
		
		List<String> userData = new ArrayList<String>();
		// suppose that email and password are true
		if(true) {
			System.out.println("Kullanıcı gmail uygundu: ");
			System.out.println(email +" "+ password);
			userData.add(email);
			userData.add(password);
			return userData;
		}
		
		return userData;
	}
}
