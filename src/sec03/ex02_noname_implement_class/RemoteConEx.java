package sec03.ex02_noname_implement_class;

public class RemoteConEx {

	public static void main(String[] args) {
		
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
			}

			@Override
			public void turnOff() {
			}

			@Override
			public void setVolume(int volume) {
			}
			
		};
		
		RemoteControl rc2 = new RemoteControl() {

			@Override
			public void turnOn() {
			}

			@Override
			public void turnOff() {
			}

			@Override
			public void setVolume(int volume) {
			}
			
		};

	}

}
