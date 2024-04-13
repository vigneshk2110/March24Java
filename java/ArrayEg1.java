package march.java;

import java.util.Arrays;

public class ArrayEg1 {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,12,6,3, 8};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
