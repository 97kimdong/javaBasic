package ch14;

public class MyFncEx {

	public static void main(String[] args) {
		//람다식은 인터페이스이므로 반드시 구현체를 만들어야 함
		MyFnc1 f1;	//매개변수 x , 반환 x
		f1 = () -> {
			System.out.println("MyFnc1 실행");
		};
		f1.method1();
		
		MyFnc2 f2;
		f2 = (x) -> {
			System.out.println(x*x);
		};
		f2.method2(9);
		
		MyFnc3 f3;
		f3 = () -> {
			return 9404;
		};
		System.out.println(f3.method3()); 
		
		MyFnc4 f4;
		f4 = (x) -> {
			return x*x;
		};
		System.out.println(f4.method4(9));
	}

}
