package march.java;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {

		int[][] twoDarray = { 
							{1}, 
							{4,5,6},
							{7,8,9,2,3},
							{12,13,14,15,16,17},
							{20}
							};
		
		for (int i = 0; i < twoDarray.length; i++) {  // Rows
			for (int j = 0; j < twoDarray[i].length; j++) {  // Columns
				System.out.println(twoDarray[i][j]);
			}
			
		}
		
		Arrays.sort(twoDarray[2]);
		
		System.out.println("**********************************************");
		
		for (int i = 0; i < twoDarray.length; i++) {  // Rows
			for (int j = 0; j < twoDarray[i].length; j++) {  // Columns
				System.out.println(twoDarray[i][j]);
			}
			
		}
		
		
	}

}
