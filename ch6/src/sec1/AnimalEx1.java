package sec1;

public class AnimalEx1 {

	public static void main(String[] args) {
		Animal cat1 = new Animal("고양이");
		cat1.running("고양이");
		System.out.println(cat1.getName());
		cat1.data = 10;
	}

}
