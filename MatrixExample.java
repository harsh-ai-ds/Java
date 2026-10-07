public class MatrixExample {
    public static void main(String[] args) {
        // Define a 2D array (3 rows, 3 columns)
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("Displaying the 2D Array (Matrix):");

        // Outer loop controls rows
        for (int row = 0; row < matrix.length; row++) {
            // Inner loop controls columns in current row
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t"); // \t adds tab space
            }
            System.out.println(); // Move to the next line after finishing a row
        }
    }
}