package sec02.ex03_abstract_method;

public interface RemoteControl {
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public abstract void turnOn();	//public abstract 생략 가
	void turnOff();
	void setVolume(int volume);

}
