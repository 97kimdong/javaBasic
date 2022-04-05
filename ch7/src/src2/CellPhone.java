package src2;

public class CellPhone {
	String model;
	String color;
	
	CellPhone(){}
	CellPhone(String model){
		this.model = model;
	}
	CellPhone(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	public void powerOn() {
		System.out.println("전원을 켭니다");
	}
	public void powerOff() {
		System.out.println("전원을 끔니다");
	}
	public void bell() {
		System.out.println("벨이 울립니다");
	}
	public void sendVoice(String aaaa) {
		System.out.println("전달받은 메세지를 출력");
	}
	public void receiveVoice(String bbbb) {
		System.out.println("전달받은 메세지를 출력");
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다");
	}
}
