package ecommerceSystemProj;

import java.util.HashMap;
import java.util.Map;

public abstract class User {
    private String userId;
    private String username;
    private String password;
    private String email;
    private boolean loggedIn = false;

    // Simulate a user database
    private static Map<String, String> userDatabase = new HashMap<>();

    public User(String userId2, String username, String password, String email) {
        this.userId = userId2;
        this.username = username;
        this.password = password;
        this.email = email;
        userDatabase.put(username, password);  // Adding user to the "database"
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void login(String username, String password) 
    {
        if (userDatabase.containsKey(username) && userDatabase.get(username).equals(password)) {
            this.loggedIn = true;
            System.out.println(username + " has successfully logged in.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public void logout() {
        if (this.loggedIn) {
            this.loggedIn = false;
            System.out.println(username + " has logged out.");
        } else {
            System.out.println(username + " is not logged in.");
        }
    }

    public abstract void viewProfile();

    public abstract void updateProfile();

	public void updateProfile(String email) {
		// TODO Auto-generated method stub
		
	}

	
}



