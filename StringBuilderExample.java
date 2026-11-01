public class StringBuilderExample {
    public static void main(String[] args) {
        // 1. Creation
        StringBuilder sb = new StringBuilder("Java");

        // 2. Appending data
        sb.append(" Programming");
        System.out.println("After append: " + sb); // Java Programming

        // 3. Inserting data at a specific index
        sb.insert(4, " Language");
        System.out.println("After insert: " + sb); // Java Language Programming

        // 4. Deleting a substring (indices 13 to 25)
        sb.delete(13, 25);
        System.out.println("After delete: " + sb); // Java Language

        // 5. Reversing the string
        sb.reverse();
        System.out.println("After reverse: " + sb); // egaugnaL avaJ

        // 6. Converting back to a regular String
        String finalResult = sb.toString();
        System.out.println("Final String: " + finalResult);
    }
}
