import java.util.Objects;

public class StringMethods {

	public static void main(String[] args){

		// PRACTICE PROBLEMS - We'll do these together in class
		//String str = "foo";

		// Use the length() method of the string object (str) to get the number of characters in the string
		//System.out.println(str.length()); // or
		//int len = str.length();
		//System.out.println(len);		

		// Question: Does the length() method require you to 'pass in' any parameters? 
		// ANSWER: 
		
		// Question: Does the length() return a value (or is it a void method)?
		// ANSWER: 
		
		// Question: What is the data type that is returned by the length() method)?
		// ANSWER: 

		// Loop through each character in the string object (str).
		// Inside the body of the loop, sysout each character.
		// Hint: use the charAt() method of the string object along with the counter variable


		// Question: What is the purpose of the parameter that is 'passed in' to the charAt() method?
		// ANSWER: 
		
		// Question: What is the data type of the parameter that is passed into the chartAt() method?
		// ANSWER: 
		
		// Question: What is the data type that is returned by the charAt() method
		// ANSWER: 

				

		/*
		PROBLEMS THAT YOU SHOULD DO ON YOUR OWN
		This purpose of this assignment is for you to get familiar with using methods of objects. 
		As you know, methods can work in various different ways.
		For example, some methods return a value, and some don't (void).
		And some methods have parameters that you must pass in when invoking/calling the method.
		Other methods do not have parameters.
		
		Methods are extremely important because they help you to solve problems.
		We work with strings all the time in programming, and it's important understand their methods
		so that you can solve problems.
		
		You may want to find a reference on the internet to help you understand the methods that you'll be using 
		in this assignment.
		
		If you use a reference, make sure it is for JAVA (not JavaScript).
		You may want to start searching for a good reference by using the search terms
		"Java String Methods"
		You'll get plenty of results to choose from. So if you don't like one, then look for another one.
		*/
		
		System.out.println("Problem 1");
		String str1 = "Hello World!";
		// Use the length() method of the string object (str1) to sysout the number of characters in the string
		System.out.println();
			String strl = "Hello World!";
			System.out.println(strl.length());

		
		System.out.println("Problem 2");
		// Use the charAt() method of the string object (str1) to get the character at index 0
		// then sysout the return value
		
		System.out.println();
			char ch = str1.charAt(3);
				System.out.println(ch);
		
			ch = str1.charAt(0);
				System.out.println(ch);
		
		
		


		System.out.println("Problem 3");
		// Use the indexOf() method of the string object (str1) to get the index number (position) of the exclamation mark
		
		
		System.out.println();
			System.out.println(strl.indexOf("!", 12));
		

	
		System.out.println("Problem 4");
		// Use the contains() method of the string object (str1) to see if it contains the string "World".
		// If so, sysout "Yes!". If not, sysout "No!"
		System.out.println();
			System.out.println(str1.contains("Hello World!"));
			System.out.println("Yes!");
		
		System.out.println(str1.contains("Burger"));
			System.out.println("No!");
		//
		

	
		// Question 1: What is the data type of the value that is returned by the contains() method?
		// ANSWER: 
		

		System.out.println("Problem 5");
		String str2;
		// Use the replace() method of the str1 object to replace "World" with "there" assign the return value
		// to str2
		
		System.out.println();
			System.out.println( str1.replaceFirst("World", "There"));
		


	
		// Question 2: How many parameters did you have to pass into the replace method in order to solve the previous problem? 		
		// ANSWER: 
        
        	int answer = 2;
		

		System.out.println("Problem 6");
		String str3 = "hello world!";
		// Write an IF statement that checks to see if str1 and str3 are equal. 
		// If so, sysout "Yes!", if not sysout "No!"
		
		
		System.out.println();
		if(str1.equals(str3)){
			System.out.println("Yes!");
		}else {
			System.out.println("No!");
		}

				
		// Question 3: What is the data type of the value that is returned by the equals() method?
		// ANSWER: String

		
		System.out.println("Problem 7");
		String email = "bob.smith@acme.com";
		int atSignIndex;
		// Use the indexOf() method of the string object (the email variable)
		// to get the index of the @ (aka the 'at' sign)
		System.out.println();
		System.out.println(email.indexOf('@', 10));
		

		
		System.out.println("Problem 8");
		int lastDotIndex;
		// Use the lastIndexOf() method of the string object (the email variable)
		// to get the index of the last period. Store the return value in the lastDotIndex variable
		System.out.println();
		
		System.out.println(str1.lastIndexOf('.' , 0));
		

		System.out.println("Problem 9");
		// Use the substring() method of the string object (the email variable)
		// to extract the domain name of the email address (the domain name starts after the @ and 
		// before the last period - for example  if the email address is bob@acme.com, then the domain name
		// is 'acme')
		System.out.println();
		System.out.println("The now changed email: ");
		System.out.println(email.substring(10, 14));
		
		
		
		
		// Question 4: Do you understand how the parameters work for the substring() method?
		// ANSWER:
		System.out.println();
		String Final_Answer = "yes";
		System.out.println(Final_Answer);


	}
}