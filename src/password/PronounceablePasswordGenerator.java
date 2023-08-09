package password;

import character.PronounceableCharacterGenerator;

/**
 * The PronounceablePasswordGenerator class generates pronounceable passwords.
 */
public class PronounceablePasswordGenerator {
    private PronounceableCharacterGenerator characterGenerator;

    public PronounceablePasswordGenerator(PronounceableCharacterGenerator characterGenerator) {
        this.characterGenerator = characterGenerator;
    }

    /**
     * Generates a pronounceable password of the specified length.
     *
     * @param length The length of the password.
     * @return The generated pronounceable password.
     */
    public String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char generatedChar = characterGenerator.generateCharacter();
            password.append(generatedChar);
        }
        return password.toString();
    }
}

