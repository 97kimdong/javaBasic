package ch6;

public class Ex18ShopService {
	private static Ex18ShopService singleton = new Ex18ShopService();
	
	private Ex18ShopService() {}
	
	public static Ex18ShopService getInstance() {
		return singleton;
	}
}
