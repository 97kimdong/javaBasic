package sec2;

public class ClassEx2 {

	public static void main(String[] args) {
		Class2 obj1 = new Class2();
		//Class2.cnt = 1004; (X)
		obj1.cnt = 1004;
		Class2.num = 1004;
		//obj1.num = 1004; (X)
		//Class2.method1(); (X)
		obj1.method1();
		//obj1.method(); (X)
		Class2.method2();
		

	}
}
