package march.methods;

public class Method3Eg {
	public static void main(String[] args) {
		String str = greet();
		
		System.out.println(str);
		
		int result = sumOfMarks();
		System.out.println(result);
		
	}

	private static int sumOfMarks() {
		
		int m1 = 10;
		int m2 = 20;
		
		int res = m1+m2;
		
		
		return res;
	}

	private static String greet() {
		
		String s = "Welcome";
		
		
		return s;
	}

	
}
