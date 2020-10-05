package Lab2;
/*-------------------------------------------------------------
//AUTHOR: Jeffrey Harrison
//FILENAME: Lab2.java
//SPECIFICATION: To practice using string variables.
//FOR: CSE 110 - Lab #2
//TIME SPENT: 60 mins
//-----------------------------------------------------------*/
	import java.util.Scanner;

	public class Lab2 {

		public static void main(String[] args) {

	        String firstName = "";
	        String lastName = "";
	        String fullName = "";
	        int nameLength;
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Please enter first name: ");
	        firstName = scan.nextLine();

	        System.out.print("Please enter last name: ");
	        lastName = scan.nextLine();
	        
	        fullName = firstName + " " + lastName;
	       
	        fullName = fullName.toUpperCase();

	        nameLength = fullName.length();
	        
	       System.out.println("Full name (in capitals): " +fullName);
	       System.out.println("Length of full name: " +nameLength);
	       
	       String title1 = new String("cse110");
	       String title2 = "cse110";
	       
	       if(title1 == title2) {
	    	   System.out.println("String Comparison using \"==\" works");
	       } else {
	    	   System.out.println("String Comparison using \"==\" does NOT work");
	       }
	       
	       if(title1.equals(title2)) {
	    	   System.out.println("String Comparison using \"equals\" method works");
	       } else {
	    	   System.out.println("String Comparison using \"equals\" does NOT work");
	       }
	       
	    } 
	} 
