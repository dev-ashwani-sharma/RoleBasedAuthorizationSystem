package user.model;

public enum Role {
	ADMIN("Admin"),
	USER("User"),
	OTHER("Other");

	public final String label;

	private Role(String label) {
		this.label = label;
	}

}
