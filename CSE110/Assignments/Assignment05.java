package CSE110;

//CSE 110     : 76375
//Assignment  : Assignment 05
//Author      : Jeffrey Harrison, 1218599902
//Description : Using static methods for various funttions

import java.util.Scanner;

public class Assignment05 {

	
	
 public static void main(String[] args) {
     // Write any code here that you may wish to test your methods defined below.
	 Scanner in = new Scanner(System.in);
	 
	 String userInput = null;
	 
	 int i = -1;
	 
	 while(i < 0) {
		 
	 System.out.println("\nPlease choose from the following options...");
	 System.out.println("[1] Greeting");
	 System.out.println("[2] Text");
	 System.out.println("[3] Print Total");
	 System.out.println("[4] Get Total");
	 System.out.println("[5] Get Average");
	 System.out.println("[6] Average Length");
	 System.out.println("[7] Length of the Shortest");
	 System.out.println("[8] String of Stars");
	 System.out.println("[9] Max String of Stars");
	 System.out.println("[10] Mid String of Stars");
	 System.out.println("[q] Quit");
	 
	 userInput = in.nextLine();
	 
	 if(userInput.equals("1")) {
		 displayGreeting();
	 }
	 
	 if(userInput.equals("2")) {
		 displayText();
	 }
	 
	 if(userInput.equals("3")) {
		 printTotal();
	 }
	 
	 if(userInput.equals("4")) {
		 getTotal();
	 }
	 
	 if(userInput.equals("5")) {
		 getAverage();
	 }
	 
	 if(userInput.equals("6")) {
		 averageLength();
	 }
	 
	 if(userInput.equals("7")) {
		 lengthOfShortest();
	 }
	 
	 if(userInput.equals("8")) {
		 stringOfStars();
	 }
	 
	 if(userInput.equals("9")) {
		 maxStringOfStars();
	 }
	 
	 if(userInput.equals("10")) {
		 midStringOfStars();
	 }
	 
	 if(userInput.equals("q")) {
		 System.out.println("Goodbye");
		 i = 1;
	 }
	 }
	 
 }
 
 
 // 1) Write (define) a static method named displayGreeting, 
 //  that takes no arguments and returns no value. 
 //  When this function is called, it should print the text "Hello, and welcome!".
static void displayGreeting() {
	
	 System.out.println("Hello, and welcome!");
 }
 

 //2) Write (define) a static method named displayText, 
 //  that takes a single String argument and returns no value. 
 //  When this function is called, it should print the value of the argument that was passed to it.
static void displayText() {
	 
	 System.out.println("Please enter a text");
	 Scanner in = new Scanner(System.in);
	 String text = in.nextLine();
	 System.out.println(text);
	 
 }
 

 //3) Write (define) a static method named printTotal, 
 //  that takes three int arguments. 
 //  When this function is called, it should print the sum of the three arguments passed to it. 
 //  This function should return no value.
 static void printTotal() {
	 
	 System.out.println("Please enter three integer values");
	 Scanner in = new Scanner(System.in);
	 int input1 = in.nextInt();
	 int input2 = in.nextInt();
	 int input3 = in.nextInt();
	 
	 System.out.println(input1 + input2 + input3);
 }
 
 
 //4) Write (define) a static method named getTotal, 
 //  that takes three int arguments. 
 //  When this function is called, it should return the sum 
 //  of the three arguments passed to it as an int.
 static int getTotal() {
	 
	 System.out.println("Please enter three integer values");
	 Scanner in = new Scanner(System.in);
	 int input1 = in.nextInt();
	 int input2 = in.nextInt();
	 int input3 = in.nextInt();
	 
	 int total = input1 + input2 + input3;
	 
	 System.out.println(total);
	 return total;
 }
 
 
 //5) Write (define) a static method named getAverage, 
 //  that takes three int arguments. 
 //  When this function is called, it should return the average 
 //  of the three arguments passed to it as a double.
 static double getAverage() {
	 
	 System.out.println("Please enter three integer values.");
	 Scanner in = new Scanner(System.in);
	 int input1 = in.nextInt();
	 int input2 = in.nextInt();
	 int input3 = in.nextInt();
	 
	 int total = input1 + input2 + input3;
	 
	 double avg = Double.valueOf(total / 3.0);
	 
	 System.out.println(avg);
	 return avg;
	 
 }
 
 
 //6) Write (define) a static method named averageLength, 
 //  that takes three String arguments. 
 //  When this function is called, it should return the average length (number of characters) 
 //  of the String arguments passed to it as a double.
 static double averageLength() {
	 
	 Scanner in = new Scanner(System.in);
	 
	 System.out.println("Please enter three words");
	 
	 String input1 = in.nextLine();
	 int length1 = input1.length();
	 
	 String input2 = in.nextLine();
	 int length2 = input2.length();
	 
	 String input3 = in.nextLine();
	 int length3 = input3.length();
	 
	 double avgLength = (length1 + length2 + length3)/ 3;
	 
	 System.out.println(avgLength);
	 return avgLength;
	 
	 
 }
 
 
 //7) Write (define) a static method named lengthOfShortest, 
 //  that takes two String arguments. When this function is called, 
 //  it should return the length (number of characters) 
 //  of the shortest String argument passed to it as an int.
 static void lengthOfShortest() {
	 
	 Scanner in = new Scanner(System.in);
	 
	 System.out.println("Please enter two words");

	 String input1 = in.nextLine();
	 int length1 = input1.length();
	 
	 String input2 = in.nextLine();
	 int length2 = input2.length();
	 
	 if(length1 > length2) {
		 System.out.println(length2);
	 }
	 
	 if(length1 < length2) {
		 System.out.println(length1);
	 }
 }
 
 
 //8) Write (define) a static method named stringOfStars, 
 //  that takes one String argument.
 //  When this function is called, it should return a String of asterisks (*) 
 //  that is the same length as the string argument passed to it.
 static void stringOfStars() {
	 
	 Scanner in = new Scanner(System.in);
	 
	 System.out.println("Please enter a word");

	 
	 String input1 = in.nextLine();
	 int length1 = input1.length();
	 
	 int i = 0;
	 while(i <= length1) {
		 
		 System.out.print("*");
		 i++;
	 }
	 return;
 }
 
 
 //9) Write (define) a static method named maxStringOfStars, 
 //  that takes two String arguments. 
 //  When this function is called, it should return a String of asterisks (*) 
 //  that is the same length as the longest string argument passed to it.
 static void maxStringOfStars() {
	 
	 Scanner in = new Scanner(System.in);
	 
	 System.out.println("Please enter two words");

	 String input1 = in.nextLine();
	 int length1 = input1.length();
	 
	 String input2 = in.nextLine();
	 
	 int i = 0;
	 int length2 = input2.length();
	 if(length1 > length2) {
		 while(i <= length1) {
			 
			 System.out.print("*");
			 i++;
		 }
	 }
	 
	 if(length1 < length2) {
		 while(i <= length1) {
			 
			 System.out.print("*");
			 i++;
		 }
	}
	 return;
	 
 }
 
 
 //10) Write (define) a static method named midStringOfStars, 
 //   that takes three String arguments. 
 //   When this function is called, it should return a String of asterisks (*) 
 //   that is the same length as the string argument with the length 
 //   that would be in the middle if the lengths of the arguments were arranged in ascending order.
static void midStringOfStars() {
	
	Scanner in = new Scanner(System.in);
	 
	System.out.println("Please enter three words");

	 String input1 = in.nextLine();
	 int length1 = input1.length();
	 
	 String input2 = in.nextLine();
	 int length2 = input2.length();
	 
	 String input3 = in.nextLine();
	 int length3 = input3.length();
	 
	 int i = 0;
	 if(length1 > length3 && length2 > length3) {
		 while(i <= length1) {
			 
			 System.out.print("*");
			 i++;
		 }
	 }
	 
	 if(length1 > length2 && length3 > length1) {
		 while(i <= length1) {
			 
			 System.out.print("*");
			 i++;
		 }
	 }
		 
	 if(length2 > length3 && length1 > length2) {
		while(i <= length2) {
				 
				 System.out.print("*");
				 i++;
			 }
		 }
		 
	 if(length2 > length1 && length3 > length2) {
		while(i <= length2) {
				 
				 System.out.print("*");
				 i++;
			 }
	 }
			 
	if(length3 > length1 && length2 > length3) {
		while(i <= length3) {
					 
					 System.out.print("*");
					 i++;
				 }
			 }
			 
	if(length3 > length2 && length1 > length3) {
		while(i <= length3) {
					 
					 System.out.print("*");
					 i++;
				 }
	 	}
	return;
	}
}
