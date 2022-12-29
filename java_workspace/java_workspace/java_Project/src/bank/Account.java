package bank;

public class Account {
	// 멤버변수 : 계좌번호, 소유주, 잔고
	private String accountNum;
	private String owner;
	private int balance;
	
	public Account() {}

	public Account(String accountNum, String owner, int balance) {
		super();
		this.accountNum = accountNum;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "계좌번호:" + accountNum + ", 예금주:" + owner + ", 잔액:" + balance + "]";
	}

	
	
	
	
}
