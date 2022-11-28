
public class Test2Review {

	public static void main(String[] args) {
		/*
		What is a problem with this code:
		int score = 92
		int percent = score/100;
		*/
		
		
		float score = 92;
		float percent = score/100;
		System.out.println(percent);
		
		

		/*	
		Write a single IF statement that works with the score variable:
			- If the score is less than 70 then sysout "FAIL"
			- If the score is greater than or equal to 70 then sysout "PASS"
			- If the score is greater than 100 then sysout "Extra Credit"
		*/
		
		
		
		if(score<70) {
			System.out.println("Fail");
		}
		else if(score > 100) {
			System.out.println("Extra Credit");
		}
		else {
			System.out.println("Pass");
		}
		
		
		
		
		/*
		Which of the following method calls returns a value?
		String name = person.getName();
		person.setName("Bob");		
		*/
		
		String name = person.getName();

		
		
		/*
		Which of the following method calls is static?
		float rate = Account.getRate();
		float balance = myAccount.getBalance();
		*/
		
		float Account.getRate();
					
					
		// Use a static method of the Integer class to convert(parse) the String into an int.
		// (put the int value in a variable named 'score')
		String userInputScore = "88";
		
		Integer.parseInt(userInputScore);
		
		
		// Use a static method of the Integer class to convert the variable below to a String
		// (put the String value in a variable named myScoreStr)
		int myScore = 98;
		String.valueOf(myScore);
		System.out.println(myScore);
		
		

		// Declare a constant that represents the maximum capacity of something. 
		// Initialize it to a value of 99. 
		// You can choose the identifier (the variable name), but make sure to use standard naming conventions for constants in Java.
		
		final float CAPACITY = 99;

		
		// Declare an int variable named sum and initialize it to a value of 0
		// Then write a loop that starts at one and ends at 5 (including 5). Inside the body of the loop add the counter variable to the sum.
		// After the loop, sysout the sum (it should be 15, which is (1+2+3+4+5))
		
		int sum = 0;
		
	
		for(a=1, a<=5, a++) {
			sum += a
		}
		System.out.println(sum);

			
		// Write an IF statement that checks to see if the following two strings are equal.
		// If they are equal, then sysout "SAME STRING"
		String str1 = "Applies";
		String str2 = "Apples";
		
		
		if(str1.equals(str2)){
			System.out.println("SAME STRING");
		}
		else {
			System.out.println("NADA");
		}
		
		
		
		// Make sure to review the Create a Book Class assignment
		// And the BankingApp assignment

	}

}