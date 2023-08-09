package character;

import java.security.SecureRandom;

/**
 * The SpecialCharacterGenerator class generates random special characters.
 */
public class SpecialCharacterGenerator implements CharacterGenerator {
    public static final String SPECIAL_CHARS = "!@#$%^&*()_-+=<>?";
    private SecureRandom random = new SecureRandom();

    /**
     * Generates a random special character.
     *
     * @return The generated character.
     */
    @Override
    public char generateCharacter() {
        int randomIndex = random.nextInt(SPECIAL_CHARS.length());
        return SPECIAL_CHARS.charAt(randomIndex);
    }
}
