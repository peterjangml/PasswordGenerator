# Password Generator

The Password Generator is a Java program that allows users to generate secure and customizable passwords. It employs different character generators to create passwords of varying complexity, including lowercase and special characters. The program supports two use cases: generating standard passwords and generating pronounceable passwords.

---

**Java Version**: Java 8 or later
**Testing Framework**: JUnit 5

---

## Use Cases

1. **Generating Standard Passwords:**
   Users can generate standard passwords by specifying the desired length. The program combines lowercase alphabetic characters and special characters to create a password that meets security requirements.

2. **Generating Pronounceable Passwords:**
   For users who prefer easy-to-remember passwords, the program generates pronounceable passwords. These passwords are composed of syllables, providing a balance between security and memorability.

## User Story

As a security-conscious user, I want to be able to generate strong and secure passwords quickly and easily. Additionally, I want the option to generate pronounceable passwords for improved memorability.

## Design Patterns

The program adheres to the **Factory Method** pattern to create different types of passwords based on user preferences. This pattern allows for easy extension of password generation strategies while maintaining a modular and extensible design.

## SOLID Compliance

### Single Responsibility Principle (SRP)

Each class has a single responsibility. For instance, the `PasswordGenerator` and `PronounceablePasswordGenerator` classes are responsible for generating passwords using different strategies. The `CharacterGenerator` implementations handle generating specific types of characters. This adherence to SRP promotes maintainability and testability.

### Open/Closed Principle (OCP)

The Factory Method pattern allows the system to be open for extension (by adding new password generation strategies) while closed for modification (existing code remains unchanged). The code leverages polymorphism to accommodate new strategies without altering existing code.

## Clean Architecture Compliance

The project's structure follows the Clean Architecture principles, promoting modularity and separation of concerns:

- **Entities (Domain Models)**: The `CharacterGenerator` and `SpecialCharacterGenerator` classes represent domain entities. They encapsulate character generation logic and special character definitions.

- **Use Cases**: The `PasswordGenerator` and `PronounceablePasswordGenerator` classes serve as use cases, orchestrating the generation of passwords based on different strategies.

- **Interface Adapters**: The `Main` class acts as an interface adapter, integrating the use cases into the application layer.

- **Frameworks & Drivers**: The entire application is encapsulated within the Java language and standard libraries, with no external frameworks or drivers used.

## Avoiding Code Smells

The code demonstrates good practices in terms of minimizing code smells:

- **Duplication**: Code duplication is minimized through the use of interfaces, inheritance, and polymorphism. Character generation logic is centralized within implementations of the `CharacterGenerator` interface.

- **Long Methods**: Methods are kept concise and focused on their specific responsibilities. Code blocks are broken down into smaller functions where appropriate.

- **Large Classes**: Classes have well-defined responsibilities and are kept small. The use of interfaces and composition enables modular design and smaller, more manageable classes.

- **Inappropriate Comments**: The code is self-documenting with meaningful variable and method names, reducing the need for excessive comments.

- **Rigidity/Fragility**: The Factory Method pattern ensures that adding new password generation strategies doesn't require modifying existing code, reducing fragility and enhancing flexibility.

By applying these design principles, the project achieves maintainability, extensibility, and readability while minimizing potential code smells.

