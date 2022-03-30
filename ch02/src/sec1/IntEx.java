package sec1;

public class IntEx {

	public static void main(String[] args) {
		int i1 =32;
		int i2 =0b010111; // 0b로 시작하면 2진수 -> 10111 => 23
		int i3 =0342;     // 0으로 시작하면 8진수 -> 3421 => 226
		int i4 =0x3f;     // 0x로 시작하면 16진수 -> 3f => 63
		System.out.println("2진수 10111:" +i2);
		System.out.println("8진수 342 : " + i3);
		System.out.println("16진수 3f : " + i4);
		
		//short s1 = i1; //불가능
		//long I1 = i1; //가능
		//byte b1 i1; // 불가능
		//8진수를 활용하는 분야 -권한부여
		//2진수 -시스템 제어
		//16진수 -메모리의 주소

	}

}
