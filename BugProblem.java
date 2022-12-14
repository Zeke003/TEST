import java.util.Scanner;
public class BugProblem {
public static final double GROWTH_RATE = 0.95;
public static final double ONE_BUG_VOLUME = 0.002;
	public static void main(String[] args) 
	{
		System.out.println("Enter total number volume of your house ");
		System.out.println("In cubic feet: ");
		Scanner keyboard = new Scanner(System.in);
		double houseVolume = keyboard.nextDouble();
		
		System.out.println("Enter the estimated number of ");
		System.out.println("roaches in your house ");
		int startPopulation = keyboard.nextInt();
		int countWeeks = 0;
		double population = startPopulation;
		double totalBugVolume = population * ONE_BUG_VOLUME;
		double newBugs, newBugVolume;
		
		while(totalBugVolume < houseVolume){
			newBugs = population * GROWTH_RATE;
			newBugVolume = newBugs * ONE_BUG_VOLUME;
			population = population + newBugs;
			totalBugVolume = totalBugVolume + newBugVolume;
			countWeeks++;
		}
		
		System.out.println("Starting with a roach population of " + startPopulation);
		System.out.println("and a house with a volume of " + houseVolume + " cubic feet,");
		System.out.println("after " + countWeeks + " weeks,");
		System.out.println("the house will be filled with " + (int)population + " roaches ");
		System.out.println("They wil fill a volume of " + (int)totalBugVolume + " cubic feet,");
		System.out.println("Better call Debugging Experts inc. ");

	}

}
