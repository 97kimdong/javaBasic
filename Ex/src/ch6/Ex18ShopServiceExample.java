package ch6;

public class Ex18ShopServiceExample {
	public static void main(String[] args) {
		Ex18ShopService obj1 = Ex18ShopService.getInstance();
		Ex18ShopService obj2 = Ex18ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Ex18ShopService 객체 입니다.");
		}else {
			System.out.println("다른 Ex18ShopService 객체 입니다.");
		}
	}
}
