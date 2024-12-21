import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	@Test
    public void testFirstName() {
        // Happy Test Case
        UserRegistration user = new UserRegistration("John", "Doe", "", "", "");
        assertTrue(user.validateFirstName(), "Valid first name should return true");

        // Sad Test Case
        user.setFirstName("jo");
        assertFalse(user.validateFirstName(), "Invalid first name should return false");
    }

    @Test
    public void testLastName() {
        // Happy Test Case
        UserRegistration user = new UserRegistration("", "Doe", "", "", "");
        assertTrue(user.validateLastName(), "Valid last name should return true");

        // Sad Test Case
        user.setLastName("do");
        assertFalse(user.validateLastName(), "Invalid last name should return false");
    }

    @Test
    public void testEmail() {
        // Happy Test Case
        UserRegistration user = new UserRegistration("", "", "abc@yahoo.com", "", "");
        assertTrue(user.validateEmail(), "Valid email should return true");

        // Sad Test Case
        user.setEmail("abc@.com.my");
        assertFalse(user.validateEmail(), "Invalid email should return false");
    }

    @Test
    public void testMobileNumber() {
        // Happy Test Case
        UserRegistration user = new UserRegistration("", "", "", "91 9919819801", "");
        assertTrue(user.validateMobileNumber(), "Valid mobile number should return true");

        // Sad Test Case
        user.setMobileNumber("919919819801");
        assertFalse(user.validateMobileNumber(), "Invalid mobile number should return false");
    }

    @Test
    public void testPassword() {
        // Happy Test Case
        UserRegistration user = new UserRegistration("", "", "", "", "Abc@1234");
        assertTrue(user.validatePassword(), "Valid password should return true");

        // Sad Test Case
        user.setPassword("abc1234");
        assertFalse(user.validatePassword(), "Invalid password should return false");
    }

}
