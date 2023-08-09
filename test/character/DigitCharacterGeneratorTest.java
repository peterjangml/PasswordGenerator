package character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DigitCharacterGeneratorTest {
    @Test
    public void testGenerateCharacter() {
        DigitCharacterGenerator generator = new DigitCharacterGenerator();
        char generatedChar = generator.generateCharacter();

        assertTrue(Character.isDigit(generatedChar));
    }
}
