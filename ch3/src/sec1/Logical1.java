package sec1;

public class Logical1 {

	public static void main(String[] args) {
		//&&, ||, !, &, |, ^
		int a = 30; // 
		int b = 20;	//
		int c = 10;
		
		System.out.println("a와 b의 OR 연산 : "+(a & b));
		
		boolean d = true;
		boolean e = true;
		boolean f = false;
		//&&(AND)연산의 입력값이 모두 참일 때만 결과가 참
		//입력1		입력2		출력
		//ture		true	true
		//true		false	false
		//false		true	false
		//false		false	false
		
		System.out.println("&& => AND연산의 결과1 : "+(d && e));
		System.out.println("&& => AND연산의 결과2 : "+(d && f));
		System.out.println("&& => AND연산의 결과3 : "+(f && d));
		System.out.println("&& => AND연산의 결과4 : "+(f && f));
		//||(OR)연산 : 어느 하나라도 입력이 참이 있으면, 참(true)
		//ture		true	true
		//true		false	true
		//false		true	true
		//false		false	false
		System.out.println("|| => AND연산의 결과1 : "+(d || e));
		System.out.println("|| => AND연산의 결과2 : "+(d || f));
		System.out.println("|| => AND연산의 결과3 : "+(f || d));
		System.out.println("|| => AND연산의 결과4 : "+(f || f));
		//!(not) : 입력된 논리값을 true는 false로 false는 true로 반대로 변환
		//입력	출력	
		//true false
		//false true
		System.out.println("! => NOT연산의 결과1 : "+(!d));
		System.out.println("! => NOT연산의 결과2 : "+(!f));
		
		byte a11 =10;
		float f11 = 2.5f;
		double d11 = 2.5;
		//byte a22 = a11+a11; 오버플로우
		int i11 = 5 + a11;
		float f22 = 5 + f11;
		double d22 = 5 + d11;
	}

}
