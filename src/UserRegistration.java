
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
     
    

    public void validateFirstName() throws UserRegistrationException {
        if (firstName == null || !firstName.matches("^[A-Z][a-zA-Z]{2,}$")) {
            throw new UserRegistrationException(
                "First name must start with capital letter and have minimum 3 characters",
                UserRegistrationException.ExceptionType.INVALID_FIRST_NAME
            );
        }
    }

    public void validateLastName() throws UserRegistrationException {
        if (lastName == null || !lastName.matches("^[A-Z][a-zA-Z]{2,}$")) {
            throw new UserRegistrationException(
                "Last name must start with capital letter and have minimum 3 characters",
                UserRegistrationException.ExceptionType.INVALID_LAST_NAME
            );
        }
    }

    public void validateEmail() throws UserRegistrationException {
        String emailRegex = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        if (email == null || !email.matches(emailRegex) ||
            email.startsWith(".") ||
            email.contains("..") ||
            email.endsWith(".") ||
            email.chars().filter(ch -> ch == '@').count() != 1) {
            throw new UserRegistrationException(
                "Invalid email format",
                UserRegistrationException.ExceptionType.INVALID_EMAIL
            );
        }
    }

    public void validateMobileNumber() throws UserRegistrationException {
        if (mobileNumber == null || !mobileNumber.matches("^91 [6-9]\\d{9}$")) {
            throw new UserRegistrationException(
                "Mobile number must start with 91 and space followed by 10 digits",
                UserRegistrationException.ExceptionType.INVALID_MOBILE
            );
        }
    }

    public void validatePassword() throws UserRegistrationException {
        if (password == null || !password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+\\-])(?=^[^!@#$%^&*()_+\\-]*[!@#$%^&*()_+\\-][^!@#$%^&*()_+\\-]*$).{8,}$")) {
            throw new UserRegistrationException(
                "Password must have minimum 8 characters, at least 1 uppercase letter, 1 numeric number and exactly 1 special character",
                UserRegistrationException.ExceptionType.INVALID_PASSWORD
            );
        }
    }
}
