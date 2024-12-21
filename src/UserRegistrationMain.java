
public class UserRegistrationMain {
    public static void main(String[] args) {
    	UserRegistration user1 = new UserRegistration(
	            "John", 
	            "a", 
	            "a", 
	            "a", 
	            "a"
	        );
	        System.out.println("First Name Validation: " + user1.validateFirstName());
	        UserRegistration user2 = new UserRegistration(
	                "jo", 
	                "a", 
	                "a", 
	                "a", 
	                "a"
	            );

	         System.out.println("First Name Validation: " + user2.validateFirstName());
	         UserRegistration user3 = new UserRegistration(
		                "john", 
		                "a", 
		                "a", 
		                "a", 
		                "a"
		            );

		     System.out.println("First Name Validation: " + user3.validateFirstName());

	
	}


}
