
public class UserRegistration {
	private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String password;
    public UserRegistration(String firstName, String lastName, String email, 
            String mobileNumber, String password) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.mobileNumber = mobileNumber;
       this.password = password;
    }
    public UserRegistration() {
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean validateFirstName() {
        return firstName != null && 
               firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }
    public boolean validateLastName() {
        return lastName != null && 
               lastName.matches("^[A-Z][a-zA-Z]{2,}$");
    }
    public boolean validateEmail() {
    	String emailRegex = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        return email.matches(emailRegex) &&
               !email.startsWith(".") &&
               !email.contains("..") &&
               !email.endsWith(".") &&
               email.chars().filter(ch -> ch == '@').count() == 1;
    }
    public boolean validateMobileNumber() {
        return mobileNumber != null && 
               mobileNumber.matches("^91 [6-9]\\d{9}$");
    }
    public boolean validatePassword() {
        return password != null &&  password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+\\-])(?=^[^!@#$%^&*()_+\\-]*[!@#$%^&*()_+\\-][^!@#$%^&*()_+\\-]*$).{8,}$");
    }
}
