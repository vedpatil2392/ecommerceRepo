package ecommerceSystemProj;

import java.util.ArrayList;
import java.util.List;

public class Authentication {
	
	    private List<User> users;

	    public Authentication() {
	        users = new ArrayList<>();
	    }

	    public void register(User user) {
	        users.add(user);
	        System.out.println(user.getUsername() + " registered successfully.");
	    }

	    public User login(String username, String password) {
	        for (User user : users) {
	            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
	                user.login(username, password);
	                return user;
	            }
	        }
	        System.out.println("Login failed.");
	        return null;
	    }

	    public void logout(User user) {
	        user.logout();
	    }
	}



