package sec1;
class ClassSub{
	int field1;
	String field2;
	double field3;
}

public class Class1 {
	ClassSub sub1 = new ClassSub();
	public static void main(String[] args) {
		ClassSub sub1 = new ClassSub();
		System.out.println(sub1.field1);
		mainMethod1();
	}
	private static void mainMethod1() {
		System.out.println("메인 메서드 호출");
	}
}
