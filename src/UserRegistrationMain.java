
public class UserRegistrationMain {
    public static void main(String[] args) {
    	UserRegistration user1 = new UserRegistration(
	            "John", 
	            "Doe", 
	            "john.doe@example.com", 
	            "91 9919819801", 
	            "shortpassword"
	        );
	        System.out.println("First Name Validation: " + user1.validateFirstName());
	        System.out.println("Last Name Validation: " + user1.validateLastName());
	        System.out.println("Email Validation: " + user1.validateEmail());
	        System.out.println("Mobile Number Validation: " + user1.validateMobileNumber());
	        System.out.println("Password Validation: "+user1.validatePassword());
	        UserRegistration user2 = new UserRegistration(
	                "John", 
	                "Doe", 
	                "john.doe@example.com", 
	                "91 9919819801", 
	                "short"
	            );

	         System.out.println("First Name Validation: " + user2.validateFirstName());
	         System.out.println("Last Name Validation: " + user2.validateLastName());
	         System.out.println("Email Validation: " + user2.validateEmail());
	         System.out.println("Mobile Number Validation: " + user2.validateMobileNumber());
	         System.out.println("Password Validation: "+user2.validatePassword());

	}
}
