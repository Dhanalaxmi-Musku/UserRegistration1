
public class UserRegistrationMain {
    public static void main(String[] args) {
    	UserRegistration user1 = new UserRegistration(
	            "John", 
	            "Doe", 
	            "john.doe@example.com", 
	            "91 9919819801", 
	            "shortP@2"
	        );
	       /* System.out.println("First Name Validation: " + user1.validateFirstName());
	        System.out.println("Last Name Validation: " + user1.validateLastName());
	        System.out.println("Email Validation: " + user1.validateEmail());
	        System.out.println("Mobile Number Validation: " + user1.validateMobileNumber());
	        System.out.println("Password Validation: "+user1.validatePassword());
	        /*UserRegistration user2 = new UserRegistration(
	                "John", 
	                "Doe", 
	                "john.doe@example.com", 
	                "91 9919819801", 
	                "shortPass@33"
	            );

	         System.out.println("First Name Validation: " + user2.validateFirstName());
	         System.out.println("Last Name Validation: " + user2.validateLastName());
	         System.out.println("Email Validation: " + user2.validateEmail());
	         System.out.println("Mobile Number Validation: " + user2.validateMobileNumber());
	         System.out.println("Password Validation: "+user2.validatePassword());
	         String[] validEmails = {
	                 "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
	                 "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"
	             };

	             String[] invalidEmails = {
	                 "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com",
	                 "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com",
	                 "abc@gmail.com.1a", "abc@gmail.com.aa.au"
	             };

	             System.out.println("Valid Emails:");
	             for (String email : validEmails) {
	            	 user1.setEmail(email);
	                 System.out.println(email + ": " + user1.validateEmail());
	             }

	             System.out.println("Invalid Emails:");
	             for (String email : invalidEmails) {
	            	 user1.setEmail(email);
	                 System.out.println(email + ": " + user1.validateEmail());
	             }*/
		
	}
}
