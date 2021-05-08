package dataaccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {

	void add(User user);
	void delete(User user);
	void update(User user);
	public User get(int id);
	public List<User> getAll();
	public boolean isExist(String email);
}
