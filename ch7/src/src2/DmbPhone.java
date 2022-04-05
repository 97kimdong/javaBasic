package src2;

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
	public void turnOnDmb() {
		System.out.printf("현재 XX번 채널의 방송을 시작합니다.");
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
