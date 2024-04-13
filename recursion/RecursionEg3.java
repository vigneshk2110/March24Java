package march.recursion;

public class RecursionEg3 {
	
	public static void main(String[] args) {
		
		int result = factorialOfN(6);
		System.out.println(result);
		
	}

	private static  int factorialOfN(int num) {
		
		if (num == 1) {
			return 1;
		}
		
		return num * factorialOfN(num-1);
		
	}

}
