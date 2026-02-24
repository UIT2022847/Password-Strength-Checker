import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpecialCharacterValidationTest {

    SpecialCharacterValidation sp = new SpecialCharacterValidation();

    @Test
    void testPasswordWithSpecialCharacter() {
        assertTrue(sp.hasSpecialCharacter("Password@123"));
    }

    @Test
    void testPasswordWithoutSpecialCharacter() {
        assertFalse(sp.hasSpecialCharacter("Password123"));
    }

    @Test
    void testOnlySpecialCharacter() {
        assertTrue(sp.hasSpecialCharacter("@"));
    }

    @Test
    void testEmptyPassword() {
        assertFalse(sp.hasSpecialCharacter(""));
    }
}