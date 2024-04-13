package march.methods;

public class Method4Eg {
	
	public static void main(String[] args) {
		String result = greetStudent("Deena");
		
		System.out.println(result);
		
		double num1 = 10.8, num2 = 23.56;
		
		double result1 = findAnswer(num2, num1);
		
		System.out.println(result1);
	}

	private static double findAnswer(double num1, double num2) {
		double result = num1/num2;
		return result;
	}

	private static String greetStudent(String string) {
		String s = "Welcome, " + string +"...";
		s+="\nGood Morning...";
		return s;
	}

}
