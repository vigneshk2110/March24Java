package java.oops;

public class Bike {
@Override
	public String toString() {
		return brand;
	}

	//	States/fields
	String brand;
	String model;
	int fuelCapacity;
	
//	Construct
	public Bike(String bBrand, String bModel, int fuelTankCap) {
		this.brand = bBrand;
		this.model = bModel;
		this.fuelCapacity = fuelTankCap;
	}
	
	
	
//	No Args Constructor or default Constructor
	public Bike() {
		
	}
	
	
//	Behaviours
	
	public static void breaks() {
		System.out.println("This bike Breaks");
		
	}
	
	public static void ride() {
		System.out.println("This bike rides");
	}
	

}
