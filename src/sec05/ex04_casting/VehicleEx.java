package sec05.ex04_casting;

public class VehicleEx {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicele.checkFare();
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();

	}

}
