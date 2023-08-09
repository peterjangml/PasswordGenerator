package character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PronounceableCharacterGeneratorTest {
    @Test
    public void testGenerateCharacter() {
        PronounceableCharacterGenerator generator = new PronounceableCharacterGenerator();
        char generatedChar = generator.generateCharacter();

        assertTrue(PronounceableCharacterGenerator.SYLLABLES.indexOf(generatedChar) != -1);
    }
}
