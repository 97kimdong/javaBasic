package sec1;

public class Ex3 {

	public static void main(String[] args) {
		// 기본 자료 타입
		boolean pass = true; //true 또는 flase만 저장
		byte a = 127; // byte = 8bit (-218 ~ 127)
		//byte a =128; --> 오버플로우로 인해 저장 안됨
		//byte b = -129; --> 언더플로우로 인해 저장 안됨
		
		short b = 32767; //2byte (545536가지) -> -32768 ~ 32767
		int c =-2147483648; // 4byte (-2147483648 ~2147483648)
		long d = 473343434; // 8byte (2의 64승 가지수)
		
		//실수 
		float f = 32434e-3f; //4byte -> 32.434
		double e = 0.0000345;  ///8byte
		//32434e-3 = 0.32434 * 1/1000 = 32.434
		//부동소수점수 = 실수 = 부호부+지수부+가수부
		
		System.out.println("f=" + f);
		
		//문자
		char g = 'k' ; //2byte - 유니코드로 저장되므로
		char h = '강';

	}

}
