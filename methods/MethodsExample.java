package java.methods;

public class MethodsExample {
	public static void main(String[] args) {
		
		greetStudent("Deena");
		
		greet();
		
		calculateSquareOfN(45);
		
		calculatePowers(5, 7, "Java Class");
		
		
	}

	public static void calculatePowers(int i, int j, String string) {
		System.out.println(string + " is happening in the room num C08");
		System.out.println(Math.pow(i, j));
		
	}

	public static void calculateSquareOfN(int i) {
		System.out.println(Math.pow(i, 2));
		
	}

	public static void greetStudent(String studentName) {
		
		System.out.println("Hi, " + studentName + "...");
		System.out.println("Welcome to java Class");
		
	}

	public static void greet() {
		System.out.println("Welcome to the Class");
	}

}
