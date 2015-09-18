public class Vehicle {
	
	int year;
	double weight;
	
	
	public Vehicle(int year, double weight) {
		super();
		this.year = year;
		this.weight = weight;
	}
	
	public Vehicle(){
		this.year = 1990;
		this.weight = 2000;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String toString(){
		return "Year: " + this.year + " Weight: " + this.weight;
	}
	
	
	
	

}
