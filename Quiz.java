import java.util.Scanner;

public class Chapters2and3Quiz {

	public static void main(String[] args) {
		
		// You'll need to get user input from the keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// Problem 1 (2pts)
		// Declare a float variable and initialize it to a value of one million
		// You can choose the identifier (aka variable name)
		
		float z = 1000000f;
		
		
		
		// Problem 2 (2pts)
		// Declare a variable named currentAge that stores an integer
		// and initialize it to your current age
		
		
		int currentAge;
		
		
		currentAge = 19;
		
		
		
		// Problem 3 (2pts)
		// Declare a boolean variable named likesBeer
		// and initialize it depending on whether or not you like beer
		
		
		
		boolean likesBeer;
		
		likesBeer = false;
		
		
		
		
		
		
		// Problem 4 (2pts)
		// Write an IF statement that does the following:
		// If your currentAge is greater than or equal to 21
		// AND you like beer, then sysout "Have a beer!"
		// Otherwise, sysout "Have some juice!"
		
		
		
		if(currentAge >= 21 && likesBeer){
			System.out.println(" Have a beer! ");
		}else{
			System.out.println(" Have some juice ");
		}
		
		
		
		// Problem 5 (2pts)
		// Fix the problem with this code
		/*Im assuming this meant to be commented out? 
		 * float twoThirds = 2/3;*/
		
		
		
		float twoThirds = 2f/3f;
		
		
		
		// Problem 6 (3pts)
		// Make the following changes to the variable named totalPoints (below)
		// Increase totalPoints by 5 (use the short-cut addition operator - the book calls these 'specialized assignment operators')
		// Use the increment operator to increase totalPoints by one
		// Use the short-cut subtraction operator to decrease totalPoints by three
		int totalPoints = 0;
		
		
		totalPoints += 5;
		
		
		totalPoints ++;
		
		
		totalPoints -= 3;
		
		
		
		
		// Problem 7 (3pts)
		// Declare a constant that stores the fuel capacity of a car
		// The data type should be int
		// Initalize the constant to a value of 15
		// You choose the identifier, but make sure it follows the proper best-practice
		// for naming constants in Java
		
		final int FUEL_CAPACITY = 15;
		
		
		
		// Problem 8 (4pts)
		// Ask the user to enter his/her name
		// Then write an IF statement that checks to see if the user's name is Bob
		// If the user's name is Bob, then sysout "My name is Bob too!"
		// If the user's name is not Bob, then do nothing
		
		
		
		System.out.println(" Please enter name here ");
		
		String answer = keyboard.next();
		
		if(answer.equals(" Bob ")){
			System.out.println(" My name is Bob too! ");
			
		}
		
		// Problem 9 (4pts)
		// Ask the user to enter his/her age.
		// Then write an IF statement that does the following:
		// If the user is younger than 21, then sysout "Let's have some juice!"
		// If the user is 21, then sysout, then sysout "Let's have a beer, I'll Buy!"
		// If the user is older than 21, then sysout "You buy the first beer!"
		
		
		
		System.out.println(" Please enter your age ");
		
		
		int age = keyboard.nextInt();
		
		
		if (age < 21) {
			System.out.println(" Let's have some juice! ");
		
		}else if(age == 21) {
	
			System.out.println(" Let's have a beer, I'll Buy! ");
		
		
		}else {
			System.out.println(" You buy the first beer! ");
		
		}
	
		
		
		
		/*
		Problem 10 (6pts)
		Write code that does the following:
		Ask the user to answer this question: What is 2 + 2?
		If the user enters the correct answer, 
		then ask them to answer this question: What is 4 + 4?
		If the user answers both questions correctly, then sysout "You win"
		If the user answers either question wrong then sysout "You lose"
		If the user answers the first question wrong, 
		then don't ask the second question, instead sysout "You lose"
		*/
		
		
		
		System.out.println("What is 2 + 2?");
		
		
		int solved = keyboard.nextInt();
		
		
		if (solved == 4) {
			System.out.println("What is 4 + 4?");
			solved = keyboard.nextInt();
		
		}else {
			System.out.println("You lose");
		}
		
		
		if (solved == 8) {
			System.out.println("you win");
		
		}else {
			System.out.println("You lose");
		}
		
		
		

	}

}