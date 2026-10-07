/*Write a Java program to initialize and display 
the elements of a 2D array using nested for loops. */
public class array {
    public static void main(String[] args) {
        int[][] numbers = new int[3][4];

        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                numbers[row][column] = row * numbers[row].length + column + 1;
            }
        }

        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                System.out.print(numbers[row][column] + " ");
            }
            System.out.println();
        }
    }
}
