package Confirm;

public class Child extends Parent {
	private int studentNo;
	public Child() { //name 필드를 this()를 이용하여 아래 생성자로 값 전달
		System.out.println("Child() call");
	}
	public Child(String name) { //name와 studentNo필드를 this()를 이용하여 아래 생성자로 값 전달
		this.name = name;
		System.out.println("Child(String name) call");
	}
	public Child(String name, int studentNo) { //해당 name 필드는 부모 생성자를 호출
		super(name);
		this.setStudentNo(studentNo);
		System.out.println("Child(String name, int studentNo) call");
	}
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

}