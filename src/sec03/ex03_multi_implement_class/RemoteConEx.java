package sec03.ex03_multi_implement_class;

public class RemoteConEx {

	public static void main(String[] args) {
		
		SmartTv tv = new SmartTv();
		
		RemoteControl rc = (RemoteControl) tv;
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		Searchable searchable = tv;
		searchable.search(null);

	}

}
