package march.java;

import java.util.Scanner;

public class Diamond1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the number");
		
		int num = scan.nextInt();
		
		
		int rows = 2 * num - 1;

		for (int i = 0; i <= rows; i++) {
			
			
			if (i == num) {
				continue;
			}
			
//			Upper Triangle
			if (i < num) {
//				Print White Spaces
				int spaces = num - i - 1;
				for (int j = 0; j < spaces; j++) {
					System.out.print(" ");
				}
//				Print Star
				for (int j = 0; j <= i; j++) {
					System.out.print("* ");
				}
			}

//			Lower Triangle
			if (i > num) {
//				White Spaces
				int spaces = i - num;
				for (int j = 0; j < spaces; j++) {
					System.out.print(" ");
				}
//				Star
				for (int j = 0; j < 2 * num - i; j++) {
					System.out.print("* ");
				}
			}
			
			System.out.println();

		}
	}
}
