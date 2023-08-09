package character;

import java.security.SecureRandom;

/**
 * The PronounceableCharacterGenerator class generates pronounceable characters.
 */
public class PronounceableCharacterGenerator implements CharacterGenerator {
    public static final String SYLLABLES = "ab cd ef gh ij kl mn op qr st uv wx yz";
    private SecureRandom random = new SecureRandom();

    /**
     * Generates a pronounceable character.
     *
     * @return The generated character.
     */
    @Override
    public char generateCharacter() {
        String[] syllableArray = SYLLABLES.split(" ");
        String syllable = syllableArray[random.nextInt(syllableArray.length)];
        return syllable.charAt(random.nextInt(syllable.length()));
    }
}
