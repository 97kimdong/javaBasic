package sec1;

public class CarEx1 {

	public static void main(String[] args) {
		Car Car1 = new Car();
		Car Car2 = new Car();
		Car Car3 = new Car();
		System.out.println(Car1.getName());
		Car1.computeMoney();
		int i =	Car2.computeMoney(24);
		System.out.println("요금 : "+i);
		int j = Car3.computeMoney(10,5000);
		System.out.println("요금 : "+j);
		
		Car1.computeFue();
		int a =	Car2.computeFue(3);
		System.out.println("요금 : "+a);
		int b = Car3.computeFue(5,1930);
		System.out.println("요금 : "+b);
		
		
		

	}

}
