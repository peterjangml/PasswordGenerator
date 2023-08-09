package password;

import character.CharacterGenerator;

/**
 * The PasswordGenerator class generates passwords with a mix of characters based on provided generators.
 */
public class PasswordGenerator {
    private CharacterGenerator[] characterGenerators;

    public PasswordGenerator(CharacterGenerator... characterGenerators) {
        this.characterGenerators = characterGenerators;
    }

    /**
     * Generates a password of the specified length with a mix of characters.
     *
     * @param length The length of the password.
     * @return The generated password.
     */
    public String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        int numGenerators = characterGenerators.length;

        for (int i = 0; i < length; i++) {
            CharacterGenerator generator = characterGenerators[i % numGenerators];
            char generatedChar = generator.generateCharacter();
            password.append(generatedChar);
        }

        return password.toString();
    }
}
