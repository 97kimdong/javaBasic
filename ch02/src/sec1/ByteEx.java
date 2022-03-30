package sec1;

public class ByteEx {

	public static void main(String[] args) {
		// byte 타입 (1byte)
		byte b1 = -128;
		//byte b2 = -129; // 언더플로우
		byte b3 = 0;
		byte b4 = 127;
		//byte b5 = 128; //오버플로우
		short s1 = b3; //2byte 
		//byte b6 = s1; //2byte => 1byte : 오버플로우 - short 데이터를 더작은 byte에 담을 수 없다.
		long k1 =104;

	}

}
