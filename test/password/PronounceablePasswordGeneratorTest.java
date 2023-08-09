package password;

import character.PronounceableCharacterGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PronounceablePasswordGeneratorTest {
    @Test
    public void testGeneratePronounceablePassword() {
        PronounceableCharacterGenerator characterGenerator = new PronounceableCharacterGenerator();
        PronounceablePasswordGenerator pronounceablePasswordGenerator = new PronounceablePasswordGenerator(characterGenerator);

        String pronounceablePassword = pronounceablePasswordGenerator.generatePassword(10);

        assertEquals(10, pronounceablePassword.length());
        for (char c : pronounceablePassword.toCharArray()) {
            assertTrue(PronounceableCharacterGenerator.SYLLABLES.indexOf(c) != -1);
        }
    }
}
