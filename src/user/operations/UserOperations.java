package user.operations;

import java.util.HashSet;
import java.util.Set;

import user.model.Role;
import user.model.User;

public class UserOperations {
//	User user;
	
	public User addRole(User user, Role role) {
		try {
			user.getUserRoles().add(role);
			return user;
		}
		catch(Exception e) {
			System.out.println("Unable to add "+user.getUserName()+" to "+role.label);
		}
		return null;
	}

	public User removeRole(User user, Role role) {
		Set<Role> roles = new HashSet<>();
		try {
			for(Role tempRole : user.getUserRoles()) {
				if(!role.equals(tempRole)) 
					roles.add(tempRole);
			}
			user.setUserRoles(roles);
		}
		catch(Exception e) {
			System.out.println("Unable to remove the "+role.label+" from "+user.getUserName());
		}
		return user;
		
	}

	public String userValuesAsString(User user) {
		String roles = user.getUserRoles().toString();
		roles = roles.replace("[","");
		roles = roles.replace("]","");
		return roles;
	}
	
	public User addUser(String name) {
		return new User(name);
	}
	
	public String userToString(User user) {
		if(user.getUserRoles().size() <= 0) {
			return "UserName = "+user.getUserName() + " Role = NONE";
		}
		else {
			return "UserName = "+user.getUserName() + " Role = "+userValuesAsString(user);
		}
	}
}
