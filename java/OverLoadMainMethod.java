package march.java;

public class OverLoadMainMethod {

    // Overloaded main method with no parameters
    public static void main() {
        System.out.println("Inside main method with no parameters");
    }

    // Overloaded main method with an array of Strings as a parameter
    public static void main(String[] args) {
        System.out.println("Inside main method with String array parameter");
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    // Overloaded main method with an integer parameter
    public static void main(int num) {
        System.out.println("Inside main method with int parameter: " + num);
    }

    public static void main(String args) {
        System.out.println("Inside main method with String parameter: " + args);
    }

    public static void main(double num) {
        System.out.println("Inside main method with double parameter: " + num);
    }

    // You can have more overloaded main methods with different parameter types if needed

    public static void main(String args, int num) {
        System.out.println("Inside main method with String and int parameters: " + args + ", " + num);
    }

    public static void main(int num, String args) {
        System.out.println("Inside main method with int and String parameters: " + num + ", " + args);
    }

    public static void main(String[] args, int num) {
        System.out.println("Inside main method with String array and int parameters");
        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println("Additional int parameter: " + num);
    }

    public static void main(int num, String[] args) {
        System.out.println("Inside main method with int and String array parameters");
        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println("Additional int parameter: " + num);
    }

    // Main method to demonstrate calling other overloaded main methods
    public static void main(String args, String[] arr, int num) {
        main();
        main(args);
        main(arr);
        main(num);
        main(args, num);
        main(num, args);
        main(arr, num);
        main(num, arr);
    }
}
