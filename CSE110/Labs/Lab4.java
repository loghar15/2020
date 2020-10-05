package CSE110;

	/*-------------------------------------------------------------
	// AUTHOR: Jeffrey Harrison
	// FILENAME: CSE110
	// SPECIFICATION: Utilizing the Switch and Loop variables to calculate numbers.
	// FOR: CSE 110- Lab #4
	// TIME SPENT: 60 mins
	//-----------------------------------------------------------*/


	import java.util.Scanner;
	
	public class Lab4 {

	    public static void main(String[] args) {
	    	
	    	Scanner in = new Scanner(System.in);
	    	
	    	int optionNum, userInput;
	    	
	        do {
	            // Display the menu
	            displayMenu();

	            // Ask the user for one option
	            // -->
	            optionNum = in.nextInt();
	            
	            switch (optionNum) {
	                // Define four cases for different options. Don't forget "break".
	                // -->
	            case 1:
	            	//Sum of input nums.
	            	System.out.println("Enter a number:");
	            	userInput = in.nextInt();
	            	
	            	int sum = 0;
	            	for (int i = 1; i <= userInput; i++) {
	            		sum += i; //same as sum = sum + 1;
	            	}
	            	System.out.printf("The sum of 1 to %d is %d\n", userInput, sum);
	            	
	                     	
	            	break;
	            case 2: 
	            	//Factorial of input num.
	            	System.out.println("Enter a number:");
	            	userInput = in.nextInt();
	            	
	            	int i, fact = 1;
	            	int number = userInput;
	            	
	            	for (i = 1; i <= number; i++) {
	            		fact *= i;
	            	}
	            	System.out.println("The factorial of " + userInput + " is " + fact);
	            	
	            	
	            	break;
	            case 3:
	            	//Leftmost digit of a input.
	            	System.out.println("Enter a number:");
	            	userInput = in.nextInt();
	            	
	            	int leftDigit = userInput;
	            	while (leftDigit >= 10) {
	            		leftDigit /= 10;
	            	}	
	            	System.out.println("The left most digit of " + userInput + " is " + leftDigit);
	            
	            	
	            	break;
	            case 4:
	            	//Terminating the program.
	            	System.out.println("Bye");
	            	break;
	            default:
	            	System.out.println("Invalid input. Please enter 1 - 4.");
	            	
	            	
	            }
	        } while (optionNum != 4);
	        
	        in.close();
	    }

	    /**
	     * Print the menu
	     */
	    private static void displayMenu() {
	        System.out.println("Please choose one option from the following menu:");
	        System.out.println("1) Calculate the sum of integers from 1 to m");
	        System.out.println("2) Calculate the factorial of a given number");
	        System.out.println("3) Display the leftmost digit of a given number");
	        System.out.println("4) Quit");
	    }
	}
