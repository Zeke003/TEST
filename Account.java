package bankingApp;
public class Account {

		// TODO Auto-generated constructor stub
	public static void main(String[] args) {
		Account a = new Account();
		
		System.out.println(a.getInfo());
		
		
		Account b = new Account("Isaac " , "Fenty ", 12233, 605  );
		
		
		
		}

	
	
	public String account;
	private String firstName;
	private String lastName;
	private int accountNumber;
	private float balance;
	public String getFirstName() {
		return firstName;
		
	
		
	
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public float getBalance() {
		return this.balance;
	}
	
	public void deposit(float amount) {
		this.balance += amount;
	}
	
	public void withdraw(float amount) {
		if(this.balance >= amount) {
			this.balance -= amount;
		}else {
			System.out.println("NSF-NOT SUFFICETN FUNDS");
		}
	}
	
	public String getDetails() {
		return "Name: " + firstName + " " + lastName + "ACCT: " + accountNumber;
	}
	
	public  Account(){
		this.firstName = " Bob ";
		this.lastName = " Smith ";
		this.accountNumber = 11122;
		this.balance = 204.43F;
	}
	
	public  Account(String firstName, String lastName, int accountNumber, int balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getInfo() {
		String info = "Name : " + this.firstName + "Last Name: "+ this.lastName + " ACCT: "+ this.accountNumber +" Balance: " + this.balance;
		return info;
	}
	
	
	
	
	
	
	}


