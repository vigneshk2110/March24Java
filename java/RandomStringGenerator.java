package march.java;

import java.security.SecureRandom;

public class RandomStringGenerator {
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final SecureRandom secureRandom = new SecureRandom();

    public static String generateRandomString(int length) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = secureRandom.nextInt(ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(randomIndex));
        }
        return builder.toString().toLowerCase();
    }

    public static void main(String[] args) {
        int length = 25;
        String randomString = generateRandomString(length);
        System.out.println("Random string: " + randomString);
        
        System.out.println(System.currentTimeMillis());
    }
}
