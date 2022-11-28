import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String[] args) {
		
		// set some constants that will come in handy
		//final int ROCK = 1;
		//final int PAPER = 2;
		//final int SCISSORS = 3;
		
		// ask the user to make a choice
		//Scanner keyboard = new Scanner(System.in);
		//System.out.println("Make your choice...");
		//System.out.println("1 for rock");
		//System.out.println("2 for paper");
		//System.out.println("3 for scissor");
	
		//int humanChoice = keyboard.nextInt();
		
		
		// This code generates a random number from 1 to 3
		// and stores it in the computerChoice variable
		
		
		//Random rn = new Random();
		//int computerChoice  = rn.nextInt(3) + 1;
		//System.out.println(computerChoice);
		
		
		// TODO: figure out who wins based on the values stored in
		// the computerChoice and humanChoice variables
		// If the computer wins sysout "Computer wins"
		// If the user wins, sysout "Human wins"
		// If neither wins, sysout "Tie"
		
		
		  Scanner scanner = new Scanner(System.in);
		    
		    while (true) {
		      String[] rps = {"ROCK", "PAPER", "SCISSORS"};
		      String computerChoice = rps[new Random().nextInt(rps.length)];
		      
		      String playerMove;
		      
		      while(true) {
		        System.out.println("Please enter your move (ROCK, PAPER, or SCISSORS)");
		        playerMove = scanner.nextLine();
		        if (playerMove.equals("ROCK") || playerMove.equals("PAPER") || playerMove.equals("SCISSORS")) {
		          break;
		        }
		        System.out.println(playerMove + " is not a valid move.");
		      }
		      
		      System.out.println("Computer played: " + computerChoice);
		      
		      if (playerMove.equals(computerChoice)) {
		        System.out.println("The game was a tie!");
		      }
		      else if (playerMove.equals("r")) {
		        if (computerChoice.equals("p")) {
		          System.out.println("You lose!");
		          
		        } else if (computerChoice.equals("s")) {
		          System.out.println("You win!");
		        }
		      }
		      
		      else if (playerMove.equals("p")) {
		        if (computerChoice.equals("r")) {
		          System.out.println("You win!");
		          
		        } else if (computerChoice.equals("s")) {
		          System.out.println("You lose!");
		        }
		      }
		      
		      else if (playerMove.equals("s")) {
		        if (computerChoice.equals("p")) {
		          System.out.println("You win!");
		          
		        } else if (computerChoice.equals("r")) {
		          System.out.println("You lose!");
		        }
		      }
		      
		      System.out.println("Play again? (y/n)");
		      String playAgain = scanner.nextLine();
		      
		      if (!playAgain.equals("y")) {
		        break;
		      }
		    }
		    scanner.close();
		  }
		}