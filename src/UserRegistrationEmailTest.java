import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationEmailTest {
    private final String email;
    private final boolean expectedValid;

    public UserRegistrationEmailTest(String email, boolean expectedValid) {
        this.email = email;
        this.expectedValid = expectedValid;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> emailTestCases() {
        return Arrays.asList(new Object[][] {
            // Valid emails
            {"abc@yahoo.com", true},
            {"abc-100@yahoo.com", true},
            {"abc.100@yahoo.com", true},
            {"abc111@abc.com", true},
            {"abc-100@abc.net", true},
            {"abc.100@abc.com.au", true},
            {"abc@1.com", true},
            {"abc@gmail.com.com", true},
            {"abc+100@gmail.com", true},
            // Invalid emails
            {"abc", false},
            {"abc@.com.my", false},
            {"abc123@gmail.a", false},
            {"abc123@.com", false},
            {"abc123@.com.com", false},
            {".abc@abc.com", false},
            {"abc()*@gmail.com", false},
            {"abc@%*.com", false},
            {"abc..2002@gmail.com", false},
            {"abc.@gmail.com", false},
            {"abc@abc@gmail.com", false},
            {"abc@gmail.com.1a", false},
            {"abc@gmail.com.aa.au", false}
        });
    }

    @Test
    public void testEmailValidation() {
        UserRegistration userRegistration = new UserRegistration(null, null, email, null, null);
        
        if (expectedValid) {
            assertDoesNotThrow(() -> userRegistration.validateEmail(),
                "Valid email " + email + " should not throw exception");
        } else {
            assertThrows(UserRegistrationException.class,
                () -> userRegistration.validateEmail(),
                "Invalid email " + email + " should throw exception");
        }
    }
}