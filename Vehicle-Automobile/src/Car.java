
public class Car extends Automobile {
	
	int maxPassengers;

	public Car(int year, double weight, String licensePlate, String make, int maxPassengers) {
		super(year, weight, licensePlate, make);
		this.maxPassengers = maxPassengers;
	}
	
	public Car(){
		this.maxPassengers = 4;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	public String toString(){
		return "Make: " + this.make + " Year: " + this.year + " Weight: " + this.weight + " License Plate: " + this.licensePlate + " Max Passengers: " + this.maxPassengers;
	}

}
