package password;

import character.CharacterGenerator;
import character.LowercaseCharacterGenerator;
import character.SpecialCharacterGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PasswordGeneratorTest {
    @Test
    public void testGeneratePassword() {
        CharacterGenerator characterGenerator = new LowercaseCharacterGenerator();
        SpecialCharacterGenerator specialCharacterGenerator = new SpecialCharacterGenerator();
        PasswordGenerator passwordGenerator = new PasswordGenerator(characterGenerator, specialCharacterGenerator);

        String password = passwordGenerator.generatePassword(12);

        assertEquals(12, password.length());
        for (char c : password.toCharArray()) {
            assertTrue(Character.isLowerCase(c) || SpecialCharacterGenerator.SPECIAL_CHARS.indexOf(c) != -1);
        }
    }
}
