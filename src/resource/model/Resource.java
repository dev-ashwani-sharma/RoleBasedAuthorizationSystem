package resource.model;

import user.model.User;

public interface Resource {
	public Boolean canRead(User user);
	public Boolean canWrite(User user);
	public Boolean canDelete(User user);
}
