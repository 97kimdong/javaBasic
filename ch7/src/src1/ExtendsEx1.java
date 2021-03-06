package src1;
//메인 클래스 : 실행 클래스라고도 하며, main() 함수가 있어 실행이 가능하며,
//반드시 public 접근 제한자를 갖는다.
public class ExtendsEx1 {
	public static void main(String[] args) {
		
		//선언만 하고, 객체 생성을 하지 않으면 실행되지 않음
		Parent p1;
		p1 = new Parent();
		
		//부모 클래스로 유도된 인스턴스는 자식 클래스간의 캐스팅이 가능하다.
		//물론, 같은 부모 클래스로 부터 유도된 것은 형제자매 끼리도 서로 캐스팅할 수 있다.
		p1.method1();
		p1.method2();
		//p1.method3();
		
		p1 = new Children();
		p1.method1();
		p1.method2();
		
		p1 = new Sister();
		p1.method1();
		p1.method2();
		
		p1 = new Brother();
		p1.method1();
		p1.method2();
		
		p1 = new Parent();
		p1.method1();
		p1.method2();
		
	}
}
