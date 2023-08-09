package character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpecialCharacterGeneratorTest {
    @Test
    public void testGenerateCharacter() {
        SpecialCharacterGenerator generator = new SpecialCharacterGenerator();
        char generatedChar = generator.generateCharacter();

        assertTrue(SpecialCharacterGenerator.SPECIAL_CHARS.indexOf(generatedChar) != -1);
    }
}
