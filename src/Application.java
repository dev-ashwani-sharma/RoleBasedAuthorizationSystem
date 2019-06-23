import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import actiontype.model.ActionType;
import resource.model.Database;
import user.model.Role;
import user.model.User;
import user.operations.UserOperations;

public class Application {
	
	private static UserOperations userOperations;
	private static List<User> userList;
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String args[]) {
		userOperations = new UserOperations();
		User a = userOperations.addUser("A");
		User b = userOperations.addUser("B");
		User c = userOperations.addUser("C");
		
		userList = new ArrayList<>();
		userList.add(a);
		userList.add(b);
		userList.add(c);
		
		performOperations();
	}

	private static void performOperations() {

		while (true) {
			System.out.println("1 -> Assign roles to users\n2 -> View users\n3 -> Check authorization\n4 -> Exit");
			System.out.print("Operation = ");
			int userId, input = scan.nextInt();
			switch(input) {
				case 1:
					displayUsers();
					System.out.print("Select User = ");
					userId = scan.nextInt();
					assignRoles(userList.get(userId-1));
				break;
				case 2:
					displayUsers();
				break;
				case 3:
					displayUsers();
					System.out.print("Select User = ");
					userId = scan.nextInt();
					checkAuthorization(userList.get(userId-1));
					break;
				case 4:
					System.exit(1);
				break;
				default:
					System.out.println("Please select a valid option");
				break;
			}
		}		
	}
	
	private static void checkAuthorization(User user) {
		Database database = new Database();
		List<ActionType> actionTypeList = (Arrays.asList(ActionType.values()));
		int count = 1;
		for(ActionType actionType : actionTypeList) {
			System.out.println((count++)+" -> "+actionType.name());
		}
		System.out.print("Action Type = ");
		int input = scan.nextInt();
		switch(input) {
			case 1:
				if(database.canRead(user)) {
					System.out.println(user.getUserName()+" can Read");
				}
				else {
					System.out.println(user.getUserName()+" cannot perform this operation");
				}
				break;
			case 2:
				if(database.canWrite(user)) {
					System.out.println(user.getUserName()+" can Write");
				}
				else {
					System.out.println(user.getUserName()+" cannot perform this operation");
				}
				break;
			case 3: 
				if(database.canDelete(user)) {
					System.out.println(user.getUserName()+" can Delete");
				}
				else {
					System.out.println(user.getUserName()+" cannot perform this operation");
				}
				break;
			default:
				System.out.println("Invalid Choice");
				break;
		}
		System.out.println();
	}

	private static void displayUsers() {
		int count = 1;
		System.out.println("Available Users");
		for(User user : userList) {
			System.out.println((count++)+" -> "+userOperations.userToString(user));
		}
		System.out.println();
	}
	
	private static void assignRoles(User user) {
		List<Role> roleList = (Arrays.asList(Role.values()));
		int count = 1;
		System.out.println("Available Roles");
		for(Role role : roleList) {
			System.out.println((count++)+" -> "+role.label);
		}
		System.out.print("Role = ");
		int input = scan.nextInt();
		if(input > 0 && input < roleList.size()) {
			userOperations.addRole(user, roleList.get(input-1));
		}
		else {
			System.out.println("Invalid Choice");
		}
	}
}
