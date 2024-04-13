package march.java;

public class StringExample {
	
	public static void main(String[] args) {
//		String s1 = "Besant";  // SCP
//		
//		String s2 = "Besant"; // SCP
//		
//		String s3 = new String("Besant");  // HEAP
//		
//		System.out.println(s1);
//		System.out.println(s3);
//		
//		System.out.println(s1 == s3); // Only Checks Memory Reference
//		System.out.println(s1.equals(s3)); // Checks for the equality of each Char of String
		
		String s4 = "Besant Technology"; 
		
//		System.out.println(s4.length());
		
//		System.out.println(s4.charAt(5)); // t
		
		for (int i = 0; i < s4.length(); i++) {
			
			System.out.println(s4.charAt(i)); 
			
		}
		
		
		
		
	}

}
