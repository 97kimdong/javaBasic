package ch6;

public class Ex19Account {
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance<=Ex19Account.MIN_BALANCE ||
				balance>=Ex19Account.MAX_BALANCE) {
			return;
		} this.balance = balance;
	}
	
}
