package src2;

public class DmbPhoneEx {
	public static void main(String[] args) {
		DmbPhone dmb1 = new DmbPhone("아이폰","로즈골드",24);
		
		//dmb1 = new DmbPhone();
		System.out.println("모델 : "+dmb1.model);
		System.out.println("색상 : "+dmb1.color);
		System.out.println("채널 : "+dmb1.channel);
		dmb1.powerOn();
		dmb1.bell();
	}
}
