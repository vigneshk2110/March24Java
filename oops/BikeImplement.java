package java.oops;

public class BikeImplement {
	
	public static void main(String[] args) {
		Bike myBike = new Bike();
		myBike.brand = "Honda";
		myBike.model = "Shine";
		myBike.fuelCapacity = 10;
		
		Bike.breaks();
		Bike.ride();
		
		String s = "Java";
		
		System.out.println(s);
		
		System.out.println(myBike);
		
		
		
		Bike myBike1 = new Bike("Yamaha", "RX100", 12);
		System.out.println(myBike1);
	}

}
