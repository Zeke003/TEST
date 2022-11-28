public class SavingsAccountDemo
{
 public static void main(String[] args)
 { ;
 SavingsAccountDemo.setInterestRate(0.01);
 SavingsAccountDemo mySavings = new SavingsAccountDemo( );
 SavingsAccountDemo yourSavings = new SavingsAccountDemo( );
 System.out.println("I deposited $10.75.");
 mySavings.deposit(10.75);
 System.out.println("You deposited $75.");
 yourSavings.deposit(75.00);
 System.out.println("You deposited $55.");
 yourSavings.deposit(55.00);
 double cash = yourSavings.withdraw(15.75);
 System.out.println("You withdrew $" + cash + ".");
 if (yourSavings.getBalance() > 100.00)
 {
 System.out.println("You received interest.");
 yourSavings.addInterest();
 }
 System.out.println("Your savings is $" +
 yourSavings.getBalance());
 System.out.print("My savings is $");
 SavingsAccountDemo.showBalance(mySavings);
 System.out.println();
 int count = SavingsAccountDemo.getNumberOfAccounts();
 System.out.println("We opened " + count +
 " savings accounts today.");
 }

private static void showBalance(SavingsAccountDemo mySavings) {
	// TODO Auto-generated method stub
	
}

private static void setInterestRate(double d) {
	// TODO Auto-generated method stub
	
}

private void deposit(double d) {
	// TODO Auto-generated method stub
	
}

private void addInterest() {
	// TODO Auto-generated method stub
	
}

private static int getNumberOfAccounts() {
	// TODO Auto-generated method stub
	return 0;
}

private double withdraw(double d) {
	// TODO Auto-generated method stub
	return 0;
}

private double getBalance() {
	// TODO Auto-generated method stub
	return 0;
}
}