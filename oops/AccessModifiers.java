package java.oops;

public class AccessModifiers {
	
	public static void main(String[] args) {
		greet();
		greetInPublic();
		AccessModifiers1.main(args);
		AccessModifiers1.name();
	}

	public static void greetInPublic() {
			System.out.println("Welcome from Public Method");
	}

	protected static void greet() {
		System.out.println("Welcome");
	}

}

class AccessModifiers1{
	public static void main(String[] args) {
		AccessModifiers.greetInPublic();
	}
	
	public static void name() {
		System.out.println("Prints Name");
	}
}


