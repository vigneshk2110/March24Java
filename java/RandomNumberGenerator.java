package march.java;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Create an instance of Random class
        Random random = new Random();
        
        // Generate a random integer between 10000000 (inclusive) and 99999999 (exclusive)
        int randomNumber = random.nextInt(9000000) + 100000;
        
        System.out.println("Random 8-digit number: " + randomNumber);
        
        
    }
}
