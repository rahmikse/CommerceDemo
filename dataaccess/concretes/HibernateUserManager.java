package dataaccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataaccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserManager implements UserDao {
	
	private static List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		if(!isExist(user.getEmail())) {
			users.add(user);
			System.out.println("Kullanıcı eklendi" + user.getFirstName()+" " + user.getLastName());
			
		}
		else {
			System.out.println("Email kullanımda lütfen farklı bir email adresi seçin : " + user.getEmail());
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

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isExist(String email) {
		for(User user:users) {
			if(user.getEmail()==email) {
				return true;
			}
		}
		return false;
	}

	
}
