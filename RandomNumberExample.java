import java.util.Random;

public class RandomNumberExample {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();

        // 1. Generate a random integer from 0 to 99
        int randomInt = random.nextInt(100);
        System.out.println("Random integer (0 to 99): " + randomInt);

        // 2. Generate a random integer in a custom range, e.g., 1 to 6 (like rolling a die)
        int diceRoll = random.nextInt(6) + 1;
        System.out.println("Dice Roll (1 to 6): " + diceRoll);

        // 3. Generate a random double (0.0 to 1.0)
        double randomDouble = random.nextDouble();
        System.out.println("Random double (0.0 to 1.0): " + randomDouble);

        // 4. Generate a random boolean (true/false)
        boolean randomBool = random.nextBoolean();
        System.out.println("Random boolean: " + randomBool);
    }
}