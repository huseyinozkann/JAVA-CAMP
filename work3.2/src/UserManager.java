
public class UserManager {
	
	public void addUser(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " added.");
	}
	
	public void deleteUser(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " deleted.");
	}
	

}
