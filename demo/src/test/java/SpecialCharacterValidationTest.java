import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpecialCharacterValidationTest {
    SpecialCharacterValidation sp= new SpecialCharacterValidation();

    @Test
    void testPasswordWithSpecialCharacter() {
        assertTrue(sp.hasSpecialCharacter("Password@123"));
    }

    @Test
    void testPasswordWithoutSpecialCharacter() {
        assertFalse(sp.hasSpecialCharacter("Password123"));
    }

    @Test
    void testPasswordWithOnlyLetters() {
        assertFalse(sp.hasSpecialCharacter("Password"));
    }

    @Test
    void testPasswordWithOnlyDigits() {
        assertFalse(sp.hasSpecialCharacter("123456"));
    }

    @Test
    void testPasswordWithMultipleSpecialCharacters() {
        assertTrue(sp.hasSpecialCharacter("Pass@#123!"));
    }

    @Test
    void testEmptyPassword() {
        assertFalse(sp.hasSpecialCharacter(""));
    }
}