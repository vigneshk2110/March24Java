package march.methods;

public class Method2Eg {
	public static void main(String[] args) {
		greetStudent("Gokul");
		greetStudent("Ashok");
		
		exponentialOfMandN(10,4);
		
		strConcat(true,"Tuesday", 9.30, 10, "venkat");
	}

	private static void strConcat(boolean isWorkDay, String day, double loginTime, int workingHours, String name) {
		String s ="";
		
		s+="Hi, "+name+"\n";
		
		if (isWorkDay) {
			s+="Today is Workday\n";
		}
		else {
			s+="Today is Holiday\n";
		}
		
		s+="Today is " + day + "\n";
		
		s+= "Login Time is " + loginTime;
		
		s+="\nYou Work for "+ workingHours +" hrs.\n";
		
		System.out.println(s);
	}

	private static void exponentialOfMandN(int num1, int num2) {
		System.out.println(Math.pow(num1, num2));
		
	}

	public static void greetStudent(String sName) {
		
		System.out.println("Hi, "+sName + "... \nWelcome to the class ");
		
	}
}
