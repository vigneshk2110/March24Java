package march.recursion;

public class CountStar {
	
	public static void main(String[] args) {
		String s = "q*w@$e**r*t*y*u2**34*/5_6*7+8";
		
		
		int count = countStar("Ab*c*d");
		System.out.println(count);
	}

	private static int countStar(String str) {
		
		if (str.isEmpty()) {
			return 0;
		}
		
		if (str.charAt(0) == '*') {
			 return 1 + countStar(str.substring(1));
		}
		
		return countStar(str.substring(1));
	}

}
