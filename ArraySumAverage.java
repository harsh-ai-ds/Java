import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get array size from user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        // Step 2: Read array elements from user input
        System.out.println("Enter " + n + " integer elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i]; // Accumulate sum during input
        }

        // Step 3: Calculate average (typecast sum to double for precise decimals)
        double average = (double) sum / n;

        // Step 4: Display results
        System.out.println("\n--- Results ---");
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    
        scanner.close();
    }
} 
    

