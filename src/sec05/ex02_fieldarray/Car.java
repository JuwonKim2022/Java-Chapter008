package sec05.ex02_fieldarray;

public class Car {
	
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}

}
