
public class EnhancedSwitchCase{
    public static void main(String[] args) {
        int dayOfWeek = 4;

        switch (dayOfWeek) {
            case 1, 7: // Monday and Sunday
                System.out.println("Weekend!");
                break;
            case 2, 3, 4, 5: // Tuesday to Friday
                System.out.println("Weekday!");
                break;
            case 6: // Saturday
                System.out.println("Half-day!");
                break;
        }
    }
}