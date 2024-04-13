package march.java;

import java.util.Scanner;

public class InputReceive {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		
		String name = scan.nextLine();
		
		System.out.println("Enter your age");
		
		int age = scan.nextInt();
		
		if (age>18) {
			System.out.println(name + " is allowed to Vote" );
		}
		else {
			System.out.println(name + " is NOT allowed to Vote" );
		}
	}

}
