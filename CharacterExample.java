public class CharacterExample {
    public static void main(String[] args) {
        char ch1 = '7';
        char ch2 = 'a';

        // Check character types
        System.out.println("Is '7' a digit? " + Character.isDigit(ch1));     // true
        System.out.println("Is 'a' a letter? " + Character.isLetter(ch2));   // true

        // Case conversion
        char upper = Character.toUpperCase(ch2);
        System.out.println("Uppercase of 'a': " + upper);                    // 'A'
        System.out.println("Is 'A' uppercase? " + Character.isUpperCase(upper)); // true
    }
}