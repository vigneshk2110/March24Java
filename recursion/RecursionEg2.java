package march.recursion;

public class RecursionEg2 {
	public static void main(String[] args) {
		printHelloNTimes(5);
		
	}

	private static void printHelloNTimes(int n) {
		if (n == 0) {
			return ;
		}
		
		System.out.println("Hello");
		printHelloNTimes(n-1);
		
	}

}
