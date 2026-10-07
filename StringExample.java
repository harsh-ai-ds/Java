public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " World";

        // Concatenation
        String result = str1.concat(str2);
        System.out.println("Concatenated String: " + result); // Hello World

        // Substring extraction
        System.out.println("Substring (0-5): " + result.substring(0, 5)); // Hello

        // Content check
        System.out.println("Contains 'World'? " + result.contains("World")); // true
    }
}
