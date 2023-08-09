package character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LowercaseCharacterGeneratorTest {
    @Test
    public void testGenerateCharacter() {
        LowercaseCharacterGenerator generator = new LowercaseCharacterGenerator();
        char generatedChar = generator.generateCharacter();

        assertTrue(Character.isLowerCase(generatedChar));
    }
}
