
public class UserRegistrationMain {
    public static void main(String[] args) {
    	UserRegistration user1 = new UserRegistration(
	            "John", 
	            "Doe", 
	            "a", 
	            "a", 
	            "a"
	        );
	        System.out.println("First Name Validation: " + user1.validateFirstName());
	        System.out.println("Last Name Validation: " + user1.validateLastName());
	        UserRegistration user2 = new UserRegistration(
	                "John", 
	                "doe", 
	                "a", 
	                "a", 
	                "a"
	            );

	         System.out.println("First Name Validation: " + user2.validateFirstName());
	         System.out.println("Last Name Validation: " + user2.validateLastName());
	         UserRegistration user3 = new UserRegistration(
		                "John", 
		                "Do", 
		                "a", 
		                "a", 
		                "a"
		            );

		     System.out.println("First Name Validation: " + user3.validateFirstName());
		     System.out.println("Last Name Validation: " + user3.validateLastName());	
	
	}
}
