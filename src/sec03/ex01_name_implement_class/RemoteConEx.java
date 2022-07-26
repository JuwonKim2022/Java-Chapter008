package sec03.ex01_name_implement_class;

public class RemoteConEx {

	public static void main(String[] args) {
		
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
		rc.turnOn();
		rc.turnOff();

	}

}
