import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    @Test
    void testFirstName() {
        // Happy Test Case
        UserRegistration user = new UserRegistration("John", "", "", "", "");
        assertDoesNotThrow(() -> user.validateFirstName(), "Valid first name should not throw exception");

        // Sad Test Case
        user.setFirstName("jo");
        UserRegistrationException exception = assertThrows(
            UserRegistrationException.class,
            () -> user.validateFirstName(),
            "Invalid first name should throw exception"
        );
        assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, exception.type);
    }

    @Test
    void testLastName() {
        // Happy Test Case
        UserRegistration user = new UserRegistration("", "Doe", "", "", "");
        assertDoesNotThrow(() -> user.validateLastName(), "Valid last name should not throw exception");

        // Sad Test Case
        user.setLastName("do");
        UserRegistrationException exception = assertThrows(
            UserRegistrationException.class,
            () -> user.validateLastName(),
            "Invalid last name should throw exception"
        );
        assertEquals(UserRegistrationException.ExceptionType.INVALID_LAST_NAME, exception.type);
    }

    @Test
    void testEmail() {
        // Happy Test Case
        UserRegistration user = new UserRegistration("", "", "abc@yahoo.com", "", "");
        assertDoesNotThrow(() -> user.validateEmail(), "Valid email should not throw exception");

        // Sad Test Case
        user.setEmail("abc@.com.my");
        UserRegistrationException exception = assertThrows(
            UserRegistrationException.class,
            () -> user.validateEmail(),
            "Invalid email should throw exception"
        );
        assertEquals(UserRegistrationException.ExceptionType.INVALID_EMAIL, exception.type);
    }

    @Test
    void testMobileNumber() {
        // Happy Test Case
        UserRegistration user = new UserRegistration("", "", "", "91 9919819801", "");
        assertDoesNotThrow(() -> user.validateMobileNumber(), "Valid mobile number should not throw exception");

        // Sad Test Case
        user.setMobileNumber("919919819801");
        UserRegistrationException exception = assertThrows(
            UserRegistrationException.class,
            () -> user.validateMobileNumber(),
            "Invalid mobile number should throw exception"
        );
        assertEquals(UserRegistrationException.ExceptionType.INVALID_MOBILE, exception.type);
    }

    @Test
    void testPassword() {
        // Happy Test Case
        UserRegistration user = new UserRegistration("", "", "", "", "Abc@1234");
        assertDoesNotThrow(() -> user.validatePassword(), "Valid password should not throw exception");

        // Sad Test Case
        user.setPassword("abc1234");
        UserRegistrationException exception = assertThrows(
            UserRegistrationException.class,
            () -> user.validatePassword(),
            "Invalid password should throw exception"
        );
        assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, exception.type);
    }
}