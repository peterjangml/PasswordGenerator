package character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UppercaseCharacterGeneratorTest {
    @Test
    public void testGenerateCharacter() {
        UppercaseCharacterGenerator generator = new UppercaseCharacterGenerator();
        char generatedChar = generator.generateCharacter();

        assertTrue(Character.isUpperCase(generatedChar));
    }
}
