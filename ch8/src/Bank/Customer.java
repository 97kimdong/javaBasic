package Bank;

public  class Customer {
	int Id;
	String Name;
	String Address;
	int PhoneNo;
	int AcctNo;
	Customer(int Id,String Name,String Address,int PhoneNo,int AcctNo){
		this.Id = Id;
		this.Name = Name;
		this.Address = Address;
		this.PhoneNo = PhoneNo;
		this.AcctNo = AcctNo;
	}
	public void GeneralInquiry() { };
	public void DepositMoney() { };
	public void WithdrawMoney() { };
	public void OpenAccount() { };
	public void CloseAccount() { };
	public void ApplyForLoan() { };
	public void RequestCard() { };
}
	
