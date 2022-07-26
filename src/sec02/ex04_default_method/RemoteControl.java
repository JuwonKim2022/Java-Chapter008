package sec02.ex04_default_method;

public interface RemoteControl {
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public abstract void turnOn();	//public abstract 생략 가
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리를 합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}

}
