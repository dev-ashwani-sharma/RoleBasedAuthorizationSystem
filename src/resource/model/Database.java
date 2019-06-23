package resource.model;

import user.model.Role;
import user.model.User;

public class Database implements Resource {

	@Override
	public Boolean canRead(User user) {
		return (user.getUserRoles().contains(Role.ADMIN) || (user.getUserRoles().contains(Role.USER)));
	}

	@Override
	public Boolean canWrite(User user) {
		return user.getUserRoles().contains(Role.ADMIN);
	}

	@Override
	public Boolean canDelete(User user) {
		return user.getUserRoles().contains(Role.ADMIN);
	}

}
