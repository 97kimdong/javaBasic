package src1;

import java.util.Scanner;

public class DmbPhone extends CellPhone {
	int channel;
	Scanner sc = new Scanner(System.in);
	
	DmbPhone() { }
	DmbPhone(String model, String color, int channel) { 
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		super.powerOn();
	}
	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		super.powerOff();
	}
	@Override
	public void bell() {
		// TODO Auto-generated method stub
		super.bell();
	}
	@Override
	public void sendVoice(String aaaa) {
		// TODO Auto-generated method stub
		super.sendVoice(aaaa);
	}
	@Override
	public void receiveVoice(String bbbb) {
		// TODO Auto-generated method stub
		super.receiveVoice(bbbb);
	}
	@Override
	public void hangUp() {
		// TODO Auto-generated method stub
		super.hangUp();
	}
	public void turnOnDmb() {
		System.out.printf("현재 "+this.channel+"채널의 방송을 시작합니다.");
	}
	public void changeChannelDmb(int channel) {
		System.out.print("채널 입력 : ");
		channel = sc.nextInt();
		System.out.printf("\n현재 %d번 채널의 방송을 시작합니다.",channel);
	}
	public void turnOffDmb() {
		System.out.println("DMB 방송을 종료합니다.");
	}
}
