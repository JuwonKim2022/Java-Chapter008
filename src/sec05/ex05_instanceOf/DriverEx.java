package sec05.ex05_instanceOf;

public class DriverEx {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		System.out.println("===============");
		driver.drive(taxi);
		
	}

}
