package sec1;

public class Ex1 {

	public static void main(String[] args) {
		// 변수명 : 기억장소의 이름 
		// 변수선언 : 어던 데이터를 저장할 지 정하여 기억장소의 이름을 선언
		// 초기화 :선언된 변수에 가장 처음 값을 저장ㅇ하는 것
		// 변수타입 변수명 = 리터럴
		// 리터럴이 문자열인 경우는 해당 값의 앞뒤에 ""로 묶어야 함
		// 리터럴이 숫자 정수인 경우는 해당 값만 기재
		// 리터럴이 문자인 경우는 해당 값이 앞뒤에 ''로 묶어야 함
		// 리터럴이 실수인 경우는 해당 값의 뒤에 f를 븉임
		// 리터럴이 논리형이 경우는 true 아니면 flase만 값을 지정할 수 있음
		
		String name;   //name이라는 기억장소에 문자열을 저장할 것을 선언
		name = "김민경"; //name이라는 기억장소에 "김민경" 데이터를 저장 (대입)
		// String name = "김민경";
		int age = 28; // age라는 정수를 저장할 수 있는 기억장소에 28를 저장
		char pass = 'y';
		float height = 172f;
		boolean k = true;
		System.out.println("너의 이름은?" + name);
		
		

	}

}
