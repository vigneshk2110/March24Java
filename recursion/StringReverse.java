package march.recursion;

public class StringReverse {
	
	public static void main(String[] args) {
		String s = reverseString("Monday");
		System.out.println(s);
	}
	

	private static String reverseString(String str) {
		
		if (str.isEmpty()) {
			return "";
		}
		
		return reverseString(str.substring(1)) + str.charAt(0);
	}

}
