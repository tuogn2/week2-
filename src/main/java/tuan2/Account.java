package tuan2;

public class Account {
	private String id;
	private String name;
	private int balance;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	//method
	public boolean  withdrawMoney(int money) {
		if(money <0 || money > balance)
			return false;
		else {
			balance -= money;
			return true;
		}
	}
	public boolean deposit(int money) {
		if(money <0)
			return false;
		else {
			balance += money;
			return true;
		}
	}
}
