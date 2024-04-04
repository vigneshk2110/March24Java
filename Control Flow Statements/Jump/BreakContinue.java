public class BreakContinue{

    public static void main(String[] args) {
        // Print numbers from 1 to 10, but skip 5
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Inside 1st If Block, where i = 5");
                continue; // Skip 5
            }
            System.out.println(i);
            if (i == 8) {
                System.out.println("Inside 2nd If Block, where i = 8");
                break; // Exit loop after 8
            }
        }
    }
}