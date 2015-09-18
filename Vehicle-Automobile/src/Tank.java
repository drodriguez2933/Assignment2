public class Tank extends Vehicle{
	
	double armorWidth;

	public Tank(int year, double weight, double armorWidth) {
		super(year, weight);
		this.armorWidth = armorWidth;
	}
	
	public Tank(){
		this.armorWidth = 2000;
	}

	public double getArmorWidth() {
		return armorWidth;
	}

	public void setArmorWidth(double armorWidth) {
		this.armorWidth = armorWidth;
	}
	
	public String toString(){
		return "Tank: Year: " + this.year + " Weight: " + this.weight + " Armor Width: " + this.armorWidth;
	}

}
