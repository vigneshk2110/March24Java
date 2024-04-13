package march.java;

public class Diamond {

    public static void main(String[] args) {
        int number = 7;
        
//        Upper Triangle
        for (int rows = 1; rows <= number; rows++) {

            for (int columns = 1; columns <= number - rows; columns++) {
                System.out.print(" ");
            }

            for (int columns = 1; columns <= rows * 2 - 1; columns++) {
                System.out.print("*");
            }

            System.out.println();
        }
        

//      Upper Triangle

        for (int rows = number - 1; rows > 0; rows--) {

            for (int columns = 1; columns <= number - rows; columns++) {
                System.out.print(" ");
            }

            for (int columns = 1; columns <= rows * 2 - 1; columns++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


