# RoleBasedAuthorizationSystem<br/>
This is a role based authorization system which is used to check whether a certain user has access to certain rights or not.
<br/><br/>
<br/>
Assumptions Made <br/><br/>
	- There are only 3 predefined users in the system.<br/>
	- There are only 3 Access Types READ, WRITE and DELETE.<br/>
 	- There are 3 types of User Roles i.e. ADMIN, USER and OTHER<br/>
 	- ADMIN role has all privileges(READ, WRITE and DELETE)<br/>
 	- USER has only read privileges<br/>
 	- OTHER has no privileges<br/>
 <br/>
 Tools used <br/>
 	- JDK 8 <br/>
 	- Eclipse<br/>
<br/>
 Prerequisites<br/>
 	- JDK 8 or higher<br/>
<br/>
 How to run the application<br/>
 	1. import the directory into Eclipse and then after right clicking the project select "Run As Java Application"<br/>
 	2. Navigate to the RBAC/src/ folder and then open terminal and run command "java Application"<br/>
<br/>
File to look at <br/>
	- Application.java<br/>
		contains the initialization and startup of the application<br/><br/>
	- UserOperation.java<br/>
		contains the code for all the operations that needs to be performed over the User<br/><br/>
	- User.java<br/>
		Entity which has the attributes related to user<br/><br/>
	- Database<br/>
		class implementing Resource interface used for checking whether user has access or not<br/><br/>
