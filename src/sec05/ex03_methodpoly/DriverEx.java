package sec05.ex03_methodpoly;

public class DriverEx {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
	}

}
