import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        
        /*
         * Looping control structures (also known as 'iteration') allows you to repeat a block of
         * code until a certain condition is met. 
         */
        
        Scanner keyboard = new Scanner(System.in);
        String input; // we'll use this variable to store user input

        /*
         *  WHILE LOOP - keeps looping until a boolean expression becomes false
         *  
         *      while(boolean expression){
         *          // keep running this code block until the the boolean expression is false
         *      }
         *  
         * Question: How does the condition (boolean expression) get changed to false?
         * Answer: It's usually something inside the body of the loop that changes the condition
         */
                
        System.out.println("I will keep asking you for a cookie until you say 'yes'...");
        
        // STEP 1
        boolean keepLooping = true;
        
        while (keepLooping) {
        	
			System.out.println("Can I have a cookie?");
			input = keyboard.next();
			
			if (input.equals("yes")) {
				System.out.println("Thank you for the cookie");
				keepLooping = false;
			}
		}
                
        
        /*
         * DO WHILE LOOP - The do/while loop will run the code in the block of the loop
         * before checking the condition of the loop
         * 
         *         do{
         *          // code to run
         *         }while(boolean expression);
         */
        
        // STEP 2
        keepLooping = false;
        
        do {
        	System.out.println("Can I have some cake");
        	input = keyboard.next();
        	if(input.equals("yes")== false) {
        		keepLooping = true;
        	}
        }while(keepLooping);
                    
        

        /*
         * FOR LOOPS - for loops are not controlled by a boolean expression, 
         * instead there is some sort of counter
         * 
         *         for(counter start value;  boolean expression;  counter incrementer){
         *             // this code runs for each loop (iteration)
         *         }
         * 
         *  NOTE THAT THE BOOK USES FOR LOOPS W/O CURLY BRACES!!!!!!!!
         *  ALSO NOTE THAT COUNTERS USE THE INCREMENT/DECREMENT OPERATORS
         */
        
        // STEP 3
        for(int x=1; x<3; x++) {
        	System.out.println(x);
        }
        
        
        // STEP 4
        // you can also loop down from a number
                
        
        /*
         *  Watch out for INFINITE LOOPS!
         */
        
        /*
        while(true){
            System.out.println("This is an infinite loop!");
        }
        */
        
        
        // STEP 5
        // You could use a 'counter' variable to control a WHILE loop
        
        
                
        /*
         * Watch out for this common beginner mistake:
         * 
         *     for(int counter = 0; counter < endIndex; counter++);{
         *         System.out.println("Counter: " + counter);
         *     }
         * 
         * Do you see the problem? Check out page 222
         */
                
        
        // STEP 6
        // The 'break' statement
        // You can terminate a loop before it completes all of its iterations by using the break statement
        // Ask the user to enter a number from 1 to 10
        // Then write a loop that will start at 1 an add all numbers up until input number has been reached.
        System.out.println("Enter a number between 1 and 10");
        int number = keyboard.nextInt();
        for(int x=1; x<=10; x++) {
        	System.out.println(x);
        	if(x == number) {
        		break;
        	}
        }
        
               
        
        // STEP 7
        // The 'continue' statement allows you to skip an iteration of a loop
        // Write a program that asks the user to enter a number from 1 - 10
        // Assign the number to an int variable called 'input'
        // Then write a loop that will output each number from 1-10
        // EXCEPT the number that was entered by the user
        System.out.println("Enter another number between 1 and 10");
        number = keyboard.nextInt();
        for(int x=1; x<=10; x++) {
        	if(x == number) {
        		continue;
        	}
        	System.out.println(x);
        }
        
                        
        
        // VARIABLE SCOPE - if you declare a variable inside a loop, then you won't be
        // able to use it anywhere after the loop completes (actually you wont be able to use it
        // any where except for the body of the loop.
        // In the example below, we say that the myStr variable is 'local' to the body of the loop
        
        /*
        for(counter = 0; counter < endIndex; counter++){
            String myStr = "hello";
        }
        
        System.out.println(myStr);
        */
        
        
        // Note: After this example, if we have talked about chapter 5 section 1
        // We should revisit the Dog class and notice that the scope of instance variables
        // Is different than the scope of local variables
        
        //keyboard.close();

    }

}