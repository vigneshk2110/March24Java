public class SwitchCase{

    public static void main(String[] args) {
        
        /* 
        switch (expression) {
            case value1:
                // code to execute if expression matches value1
                break;
            case value2:
                // code to execute if expression matches value2
                break;
            default:
                // code to execute if expression doesn't match any case (optional)
        }
        */
        int day = 3;
        
        switch (day) {
            case 1:
                System.out.println("It's Monday!");
                break;
            case 2:
                System.out.println("It's Tuesday!");
                break;
            case 3:
                System.out.println("It's Wednesday!");
                break;
            default:
                System.out.println("It's another day of the week.");
        }
    }
}