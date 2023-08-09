package character;

import java.security.SecureRandom;

/**
 * The DigitCharacterGenerator class generates random digit characters (0-9).
 */
public class DigitCharacterGenerator implements CharacterGenerator {
    private static final String DIGITS = "0123456789";
    private SecureRandom random = new SecureRandom();

    /**
     * Generates a random digit character.
     *
     * @return The generated character.
     */
    @Override
    public char generateCharacter() {
        int randomIndex = random.nextInt(DIGITS.length());
        return DIGITS.charAt(randomIndex);
    }
}
