package CSE110;
/*-------------------------------------------------------------
// AUTHOR: Jeffrey Harrison
// FILENAME: cse110-lab3
// SPECIFICATION: Allow the user to calculate if they have passed or failed a class, based off three grades.
// FOR: CSE 110- Lab #3
// TIME SPENT: 60 mins
//-----------------------------------------------------------*/

//import Scanner
import java.util.Scanner;

//Initiate class
public class Lab3 {
	
	//Initiate main
    public static void main(String[] args) {
    	
        // Declare scanner for inputs
        Scanner scanner = new Scanner(System.in);
        
        // Declare three variables for hw, midterm, and finalexam grades
        // -->
        double hw = 0, midterm = 0, finalexam = 0;
        
        // Declare a loop control variable i
        // -->
        int i = 0;
        
        //Prompt user to input grades for HOMEWORK, MIDTERM, and FINAL EXAM.
        while (i < 3) {
            
        	if (i == 0) {
        		
        		System.out.println("Enter your HOMEWORK grade:");
        		
        		hw = scanner.nextDouble();
        		
        		if ( hw < 0 || hw > 100) {
        			
        			System.out.println("[ERR Invalid input. A HOMEWORK grade should be in [0, 100].");
        			System.out.println();
        		} else {
        			//Update the loop variable
        			// ---->
        			//i = i + 1;
        			i++;
        		}
        	}
        	
        	if (i == 1) {
        		
        		System.out.println("Enter your MIDTERM grade:");
        		
        		midterm = scanner.nextDouble();
        		
        		if ( midterm < 0 || midterm > 100) {
        			
        			System.out.println("[ERR Invalid input. A MIDTERM grade should be in [0, 100].");
        			System.out.println();
        		} else {
        			//Update the loop variable
        			// ---->
        			//i = i + 1;
        			i++;
        		}
        	}
        	
        	if (i == 2) {
        		
        		System.out.println("Enter your FINAL EXAM grade:");
        		
        		finalexam = scanner.nextDouble();
        		
        		if ( finalexam < 0 || finalexam > 200) {
        			
        			System.out.println("[ERR Invalid input. A FINAL EXAM grade should be in [0, 200].");
        			System.out.println();
        		} else {
        			//Update the loop variable
        			// ---->
        			//i = i + 1;
        			i++;
        		}
        	}

         }

        // Calculate the weighted total by the formula showed in the PDF
        // -->
        double weighted_total = (double)(finalexam / 200 * 50) + (midterm * 0.25) + (hw * 0.25);

        // Show the weighted total and tell the user s/he passed or not
        // -->
        System.out.println("[INFO] Student's Weighted Total is " + weighted_total);
       
        if (weighted_total >= 50) {
            System.out.println("[INFO] Student PASSED the class.");
        } else {
            System.out.println("[INFO] Student FAILED the class.");
        }

        scanner.close();

    }  // End of main
}  // End of class

