
public class TestVehicle {
	
	public static void main (String Args[]){

		
		Car car1 = new Car(2006, 2100.56, "1RT245", "Honda", 5);
		Truck truck1 = new Truck(2009, 2500.45, "2tu123", "Dodge", 1200.0);
		Tank tank1 = new Tank(2011, 7000.56, 4.56);

		System.out.println(car1.toString());
		System.out.println(truck1.toString());
		System.out.println(tank1.toString());
	}

}
