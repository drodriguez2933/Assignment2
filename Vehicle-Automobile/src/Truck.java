public class Truck extends Automobile{
	
	double towCapacity;

	public Truck(int year, double weight, String licensePlate, String make, double towCapacity) {
		super(year, weight, licensePlate, make);
		this.towCapacity = towCapacity;
	}
	
	public Truck(){
		this.towCapacity = 1000;
	}

	public double getTowCapacity() {
		return towCapacity;
	}

	public void setTowCapacity(double towCapacity) {
		this.towCapacity = towCapacity;
	}
	
	public String toString(){
		return "Make: " + this.make + " Year: " + this.year + " Weight: " + this.weight + " License Plate: " + this.licensePlate + " Tow Capacity: " + this.towCapacity;
	}
	
	

}
