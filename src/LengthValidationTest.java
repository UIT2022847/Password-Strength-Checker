import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LengthValidationTest {
    @Test 
    void testforValidLength() {
        LengthValidation validate = new LengthValidation();
        assertTrue(validate.isValidLength("password123"));
    }
}
