package sec1;
//인터페이스로 부터 다중상속을 받는 SmartTv는 반드시 두 개의 인터페이스선언내용이 모두 구현되어야함
public class SmartTv implements RemoteControl, Searchable {
	private int volume;
	private int channel;
	@Override
	public void search(String url) {
		
	}
	@Override
	public void turnOn() {
		
	}
	@Override
	public void turnOff() {
		
	}
	@Override
	public void setVolume(int volume) {
		
	}
	@Override
	public int getVolume() {
		return 0;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
}
