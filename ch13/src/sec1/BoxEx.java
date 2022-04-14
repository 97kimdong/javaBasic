package sec1;
//제네릭 : 숫자든 문자든 타입에 관계없이 저장 및 전달이 가능하도록 한 구조
//클래스이름<T> { private T t; get; set; }
class Box<T>{
	private T t;

	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
public class BoxEx {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("avaj");
		System.out.println(box1.get());
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(1111);
		System.out.println(box2.get());
		
		Box<Float> box3 = new Box<Float>();
		box3.set(6.888f);
		System.out.println(box3.get());
		
		Box<Boolean> box4 = new Box<Boolean>();
		box4.set(true);
		System.out.println(box4.get());
		
	}
}
