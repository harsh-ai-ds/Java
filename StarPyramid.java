class StarPyramid {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pyramid

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Inner loop for printing stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}