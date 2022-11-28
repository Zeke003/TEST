package bankingApp;






public class BankingApp {

		
		public static void main(String[] args) {
			Account a = new Account("Isaac", "Fenty", 78445, (int) 750.54);
			Account b = new Account("Donald", "Trump", 64355, (int) 980.67);
			
			a.deposit(1000);
			System.out.println("Isaac, you deposited $500.0");
			
			a.withdraw(400);
			System.out.println("Isaac, you withdrew $200.0");
			
			
			b.deposit(10000);
			System.out.println("Donald, you deposited $40,000.00");
			
			
			b.withdraw(5000);
			System.out.println("Donald, you withdrew $10,000.00");
			
			
			System.out.println(a.getDetails());
			System.out.println(b.getDetails());
			
			if(a.equals(b)) {
				System.out.println("Same account!");
			}else {
				System.out.println("Different accounts!");
			}
			
		

		
		
		
	}

	private static void deposit(double d) {
		// TODO Auto-generated method stub
		
	}

	private static void withdraw(double d) {
		// TODO Auto-generated method stub
		
	}

	private static void getDetails() {
		// TODO Auto-generated method stub
		
	}

	private static void Account() {
		// TODO Auto-generated method stub
		
	}
	
}
