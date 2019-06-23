# RoleBasedAuthorizationSystem
This is a role based authorization system which is used to check whether a certain user has access to certain rights or not.

Assumptions Made
	- There are only 3 predefined users in the system.
	- There are only 3 Access Types READ, WRITE and DELETE.
 	- There are 3 types of User Roles i.e. ADMIN, USER and OTHER
 	- ADMIN role has all privileges(READ, WRITE and DELETE)
 	- USER has only read privileges
 	- OTHER has no privileges
 
 Tools used 
 	- JDK 8 
 	- Eclipse

 Prerequisites
 	- JDK 8 or higher

 How to run the application
 	1. import the directory into Eclipse and then after right clicking the project select "Run As Java Application"
 	2. Navigate to the RBAC/src/ folder and then open terminal and run command "java Application"
	
File to look at 
	- Application.java
		contains the initialization and startup of the application
	- UserOperation.java
		contains the code for all the operations that needs to be performed over the User
	- User.java
		Entity which has the attributes related to user
	- Database
		class implementing Resource interface used for checking whether user has access or not
