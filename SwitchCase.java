package march1.java;

public class SwitchCase {
	
	public static void main(String[] args) {
//		int n = 10;
//		
//		switch (n) {
//		case 5:
//			System.out.println("N == 5");
//			break;
//		
//		case 10:
//			System.out.println("N == 10");
//			break;
//
//		default:
//			System.out.println("No Case Matched");
//			break;
//		}
		
//		int dayOfTheWeek = 2;
//		
//		switch (dayOfTheWeek) {
//		case 1:
//			System.out.println("Its a Weekday");
//			break;
//		case 2:
//			System.out.println("Its a Weekday");
//			
//		case 3:
//			System.out.println("Its a Weekday");
//			
//		case 4:
//			System.out.println("Its a Weekday");
//			break;			
//		case 5:
//			System.out.println("Its a Weekday");
//			break;
//			
//		case 6:
//			System.out.println("Its a Weekend");
//			break;			
//		case 7:
//			System.out.println("Its a Weekend");
//			break;
//
//		default:
//			System.out.println("Does not match any case");
//		}
//		
		
		
		
//		
//		
		
		String day = "Monday";
//		
		switch (day.toLowerCase()) {
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
			System.out.println("Its a Week day");
			break;
			
		case "saturday":
		case "sunday":
			System.out.println("Its a Weekend");
			break;

		default:
			System.out.println("Does not any case");
			break;
		}
	}

}
