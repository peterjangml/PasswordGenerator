package character;

import java.security.SecureRandom;

/**
 * The UppercaseCharacterGenerator class generates random uppercase alphabetic characters.
 */
public class UppercaseCharacterGenerator implements CharacterGenerator {
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private SecureRandom random = new SecureRandom();

    /**
     * Generates a random uppercase alphabetic character.
     *
     * @return The generated character.
     */
    @Override
    public char generateCharacter() {
        int randomIndex = random.nextInt(UPPERCASE.length());
        return UPPERCASE.charAt(randomIndex);
    }
}
