package java.methods;

public class MethodsExample2 {
	public static void main(String[] args) {
//		w/o Argument 	
//		String message = greet();
//		System.out.println(greet());
		
//		with arguments passed
		
//		String result = greetStudent("Gokul");
//		
//		System.out.println(result);
		
//		int squareRoot = calculateSqroot(225);
		System.out.println(calculateSqroot(2250));
		
		boolean result1 = isEligibleToVote("Karthik", 106);
		
		if (result1) {
			System.out.println("Eligible to Vote");
		}
		else {
			System.out.println("Not Eligible to Vote");
		}
		
		
		
		
		
	}
	
	private static double calculateSqroot(int i) {
		double result = Math.pow(i, 0.5);
		return result;
	}

	private static boolean isEligibleToVote(String voterName, int voterAge) {
		
		System.out.println(voterName + " is the Voter");
		
		if (voterAge<18) {
			return false;
		}
		
		return true;
	}

	public static String greetStudent(String studentName) {
		
		String message = "Hi, " + studentName + "...";
		message+="\rWelcome to java Classes";
		
		return message;
		
	}

	private static String greet() {
		
		String message = "Welcome to java Classes";
		// TODO Auto-generated method stub
		return message;
	}

	

}
