package application;

import character.*;
import password.*;

/**
 * The Main class is the entry point of the password generator application.
 */
public class Main {
    public static void main(String[] args) {
        CharacterGenerator lowercaseCharacterGenerator = new LowercaseCharacterGenerator();
        CharacterGenerator uppercaseCharacterGenerator = new UppercaseCharacterGenerator();
        CharacterGenerator digitCharacterGenerator = new DigitCharacterGenerator();
        character.SpecialCharacterGenerator specialCharacterGenerator = new character.SpecialCharacterGenerator();
        PronounceableCharacterGenerator pronounceableCharacterGenerator = new PronounceableCharacterGenerator();

        PasswordGenerator passwordGenerator = new PasswordGenerator(lowercaseCharacterGenerator, specialCharacterGenerator);
        PronounceablePasswordGenerator pronounceablePasswordGenerator = new PronounceablePasswordGenerator(pronounceableCharacterGenerator);

        int passwordLength = 10;
        String password = passwordGenerator.generatePassword(passwordLength);
        String pronounceablePassword = pronounceablePasswordGenerator.generatePassword(passwordLength);

        System.out.println("Generated Password (Lowercase + Special): " + password);
        System.out.println("Generated Pronounceable Password: " + pronounceablePassword);

        // Generate a password with a mix of character types
        PasswordGenerator mixedPasswordGenerator = new PasswordGenerator(
                lowercaseCharacterGenerator,
                uppercaseCharacterGenerator,
                digitCharacterGenerator,
                specialCharacterGenerator
        );

        String mixedPassword = mixedPasswordGenerator.generatePassword(passwordLength);
        System.out.println("Generated Mixed Password (Lowercase + Uppercase + Digit + Special): " + mixedPassword);
    }
}
