package character;

import java.security.SecureRandom;

/**
 * The LowercaseCharacterGenerator class generates random lowercase alphabetic characters.
 */
public class LowercaseCharacterGenerator implements CharacterGenerator {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private SecureRandom random = new SecureRandom();

    /**
     * Generates a random lowercase alphabetic character.
     *
     * @return The generated character.
     */
    @Override
    public char generateCharacter() {
        int randomIndex = random.nextInt(LOWERCASE.length());
        return LOWERCASE.charAt(randomIndex);
    }
}
