package sec1;

public class RemoteEx {
	public static void main(String[] args) {
		//1. 인터페이스타입으로 선언이 되었을 경우
		RemoteControl rc1;
		rc1 = new TvRemote();
		rc1.turnOn();
		rc1.setVolume(10);
		//인터페이스에서 선언되었으므로 getVolume()이나 setVolume()으로 접근
		System.out.println("TV볼륨 : "+rc1.getVolume());
		rc1.turnOff();
		
		rc1 = new AudioRemote();
		rc1.turnOn();
		//rc1은 객체 생성을 새로 하였으므로 봄륨값은 다시 0으로 초기화됨
		System.out.println("오디오 볼륨 : "+rc1.getVolume());
		rc1.turnOff();
		
		//2. 클래스 타입으로 선언이 되었을 경우
		TvRemote rc2 = new TvRemote();
		rc2.volume = 20;
		rc2.channel = 24;
		
		//형제끼리의 형변환은 허용안됨 - 크기가 다르므로 허용안됨
		
		RemoteControl rc4 = rc2; //자동 형변환
		
		//3. 내부 메서드에 의한 참조/값에 의한 전달
		//메서드를 호출하여 값을 전달 할 때 클래스로 묶어서 전달하는 것이 효율적임
		RemoteEx.play(rc2); //call by reference
		RemoteEx.play(rc2.volume, rc2.channel); // call by value
		System.out.println(rc2);
		
	}
	private static void play(TvRemote tv1) { //참조(객체)의 의한 전달을 하는 메서드
		System.out.println("TV의 볼륨 : "+tv1.volume);
		System.out.println("TV의 채널 : "+tv1.channel);
		System.out.println("플레이를 합니다.");
	}
	private static void play(int volume, int channel) { //값에 의한 전달을 하는 메서드
		System.out.println("TV의 볼륨 : "+volume);
		System.out.println("TV의 채널 : "+channel);
		System.out.println("플레이를 합니다.");
	}
}
