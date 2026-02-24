package src;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CharacterValidationTest {

   @Test
    public void test1forCharVal() {
        CharacterValidation charValObj = new CharacterValidation();

        assertEquals(false, charValObj.hasUpperLower("hi"));
        assertEquals(true, charValObj.hasUpperLower("Hello"));
        assertEquals(true, charValObj.hasUpperLower("bYe"));
    }

}


