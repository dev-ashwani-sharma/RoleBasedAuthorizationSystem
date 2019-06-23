package user.model;

import java.util.HashSet;
import java.util.Set;

public class User {
	private String userName;
	private Set<Role> userRoles;
	
	public User(String userName) {
		this.userName = userName;
		this.userRoles = new HashSet<>();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Set<Role> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(Set<Role> userRoles) {
		this.userRoles = userRoles;
	}
	
}
