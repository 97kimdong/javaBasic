package sec2;

public class SingletonEx1 {

	public static void main(String[] args) {
		//싱글톤은 객체를 한 번에 한 개만 생성가능
		//아무리 객체를 계속 다른 이름으로 생성해도 어차피 같은 객체가 됨
		//또한, static은 정적 데이터가 되므로, 객체가 달라도 같은 저장소를 공유하고 있어
		//공유메모리며, 정적 필드의 값은 객체가 달라도 같다.
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		obj1.num = 1004;
		if(obj1 == obj2) {
			System.out.println("obj1 == obj2");
		} else {
			System.out.println("obj1 != obj2");
		}
		System.out.println(obj2.num);

	}

}
