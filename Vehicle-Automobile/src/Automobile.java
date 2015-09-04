
public class Automobile extends Vehicle{
	
	String licensePlate;
	String make;
	
	
	public Automobile(int year, double weight, String licensePlate, String make) {
		super(year, weight);
		this.licensePlate = licensePlate;
		this.make = make;
	}
	
	public Automobile(){
		this.licensePlate = "Unkown";
		this.make = "Uknown";
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public String toString(){
		return "Make: " + this.make + " Year: " + this.year + " Weight: " + this.weight + " License Plate: " + this.licensePlate;
	}
}
