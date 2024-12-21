
public class UserRegistrationMain {
    public static void main(String[] args) {
    	UserRegistration user1 = new UserRegistration(
	            "John", 
	            "Doe", 
	            "john.doe@example.com", 
	            "a", 
	            "a"
	        );
	        System.out.println("First Name Validation: " + user1.validateFirstName());
	        System.out.println("Last Name Validation: " + user1.validateLastName());
	        System.out.println("Email Validation: " + user1.validateEmail());
	        UserRegistration user2 = new UserRegistration(
	                "John", 
	                "Doe", 
	                "invalid.email", 
	                "a", 
	                "a"
	            );

	         System.out.println("First Name Validation: " + user2.validateFirstName());
	         System.out.println("Last Name Validation: " + user2.validateLastName());
	         System.out.println("Email Validation: " + user2.validateEmail());

	
	}
}
