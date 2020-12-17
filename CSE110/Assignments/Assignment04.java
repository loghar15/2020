package CSE110;

// CSE 110	   : 76375
// Assignment  : 04
// Author	   : Jeffrey Harrison
// Description : A guessing game that allows the user to guess a four-digit number, based on their input. 

//import Java Utilities
import java.util.Scanner;
import java.util.Random;

public class Assignment04 {

	public static void main(String[] args) {
		
		//initiate variables
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		String playAgain = null;
		
		//title
		System.out.println("----- MASTERMIND -----");
		
		
		//Program execution
		int i = 0;
		
		
		//While the user wants to play...
		while (i > -1 || playAgain.equals("yes")){
			
			//Establishes the upper bound and formats the random number to have four digits.
			int upperbound = 4000; 
			int randomNum = rand.nextInt(upperbound);
			String formatrandomNum = String.format("%04d", randomNum);

			System.out.println("Guess the 4 digit number!");
		
		int numCorrect = 0;
		
		
		//While the user has not guessed all 4 digits correctly...
		while (numCorrect < 4) {
				
			System.out.println("Guess " + (i + 1) + ":");
			String userInput = in.nextLine();
			
			//Compares each char (0 to 3)
			if(userInput.charAt(0) == formatrandomNum.charAt(0)) {
				
				numCorrect++;
				
			}
			
			if(userInput.charAt(1) == formatrandomNum.charAt(1)) {
				
				numCorrect++;
				
			}
				
			if(userInput.charAt(2) == formatrandomNum.charAt(2)) {
	
				numCorrect++;
	
			}
			
			if(userInput.charAt(3) == formatrandomNum.charAt(3)) {
				
				numCorrect++;
				
			}
			
			//Outputs the # of correct chars
			System.out.println("You guessed " + numCorrect);
			
			//If the user guesses all four correctly
			if(numCorrect == 4) {
				System.out.println("Congratulations! You guessed the right number in " + (i + 1) + " guesses.\n");
			}
			
			//If not, the while loop repeats
			else {
				i++;
				numCorrect = 0;	
				}
		}
				
			//Prompts the user to play again. If yes, while-loop repeats.
				System.out.println("Would you like to play again (yes/no)?");
				playAgain = in.nextLine();
				numCorrect = 0;
				i = 0;
			
			//If no, the while-loop breaks.
			if(playAgain.equals("no")) {
				
				System.out.println("Goodbye");
					break;
				
				}
			}	
		}	
	}
