package sec1;

public class ByteEx {

	public static void main(String[] args) {
		//byte 타입의 변수 활용
		byte b1 = -128;
		// byte b2 = 128;   //표현범위에 속하지않음( -128~127)
		byte b3 = 0;
		//byte b4 = 0b10010110; //127보다 크므로 표현범위를 벗어남
		//byte b5 = 0300;  //192이므로 표현범위를 벗어남
		//byte b6 = 0x3f4; //127보다 크므로 표현범위를 벗어남
		byte b7 = 0b101101; //2진수
		byte b8 = 0132; 	//8진수
		byte b9 = 0x3e;		//16진수
		System.out.println("b1 = "+b1);
		System.out.println("b3 = "+b3);
		System.out.println("b7 = "+b7);
		System.out.println("b8 = "+b8);
		System.out.println("b9 = "+b9);

		//진법 변환
		//2진수 101101 -> 10진수 45 = 4*10+5*1, 457 => 4*10의2승+5*10의1승+7*10의0승
		//101101 => 1*2의5승 + 0*2의4승 + 1*2의3승 + 1*2의2승 + 0*2의1승 + 1*2의0승
		
		//64	8		1
		//1		3		2
		//64+24+2
		
		//256		16		1
		//0			3		e
		//0			48		14
		//48+14 62
		
		//45
		//32	16		8	4	2	1
		//1 	0		1	1	0	1
		
		//62
		//256 16 1
		//0   3  14 = e
		
		//2진수 -> 컴퓨터가 알 수 있도록 하려면 기계어 코드는 2진수로 바뀌어져야 하므로 그 것을 검토하려면
		//8진수 -> 권한설정(읽기/쓰기/실행)
		//owner(파일작성자) -> cont(그룹이름)
		//Administrators
		//Users
		// r:4, w:2, x:1
		//		7		4		1		
		//		소유자	그룹		기타
		//chmod kkt.hwp 741
		//4(100), 2(010), 1(001)
		//653(8진수) -> 110, 101, 011
		//2진수 - > 8진수 -> 2진수
		//3자리 = 1자리 = 3자리
		//6		5		3(8진수) : 8진수 1자리를 2진수 3자리로 쪼갠다.
		//110	101		011
		//110101011 = 653
		//110 101 011(2진수) => (8진수) : 2진수를 8진수로 변경시는 오른쪽 끝부터 3개씩 묶는다.
		// 6   5   3
		//16진수 -> 2진수 -> 16진수
		//16진수 -> 2진수 : 16진수 1자리로 2진수 4자리로 쪼갠다.
		//	3		e
		//0011		1110
		//2진수 -> 16진수 : 2진수 4자리를 묶어서 오른쪽 끝부터 묶어서 16진수 1자리로 만든다.
		//0011	1110
		//	3	e
		
		//	64
		//-	21 + 78 = 99(9의 보수)
		//-----
		//	43
		//21에 얼마를 더해야지 99가 나오는가? -> 보수(78)
		//64+78=142+1(10의보수)=143=>43
		
		
	}

}
