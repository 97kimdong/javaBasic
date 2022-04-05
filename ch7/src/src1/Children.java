package src1;
//class 클래스명 extends 부모클래스명 { }
//부모 클래스 = 슈퍼 클래스
//자식 클래스 = 서브 클래스
// @override : 부모 클래스를 가져와서 쓸 때
public class Children extends Parent {
	double field3;
	Children() {}
	Children(int field1, String field2, double field3){
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}
	
	@Override
	public void method1() {
		super.method1();
	}
	public void method2() {
		System.out.println("자식메서드2 입니다.");
	}
	public void method3() { }
}
