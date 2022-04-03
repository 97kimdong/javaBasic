package ch6;

public class Ex19AccountExample {
	public static void main(String[] args) {
		Ex19Account account = new Ex19Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고 : "+account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고 : "+account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고 : "+account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고 : "+account.getBalance());
	}
}
