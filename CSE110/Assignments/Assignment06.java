package CSE110;

//CSE 110     : 76375
//Assignment  : 06
//Author      : Jeffrey Harrison/1218599902
//Description : <of the file contents>

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Assignment06 {
	
 public static void main(String[] args) {
     // Write any code here that you may wish to test your methods defined below.
	 
Scanner in = new Scanner(System.in);

String userInput = null;
	 
	 int i = -1;
	 
	 while(i < 0) {
		 
	 System.out.println("\nPlease choose from the following options...");
	 System.out.println("[1] printArray");
	 System.out.println("[2] getFirst");
	 System.out.println("[3] getLast");
	 System.out.println("[4] getAllButFirst");
	 System.out.println("[5] getIndexOfMin");
	 System.out.println("[6] getIndexOfMax");
	 System.out.println("[7] swapByIndex");
	 System.out.println("[8] removeAtIndex");
	 System.out.println("[9] insertAtIndex");
	 System.out.println("[10] isSorted");
	 System.out.println("[q] Quit");
	 
	 userInput = in.nextLine();
	 
	 if(userInput.equals("1")) {
		 printArray();
	 }
	 
	 if(userInput.equals("2")) {
		 getFirst();
	 }
	 
	 if(userInput.equals("3")) {
		 getLast();
	 }
	 
	 if(userInput.equals("4")) {
		 getAllButFirst();
	 }
	 
	 if(userInput.equals("5")) {
		 getIndexOfMin();
	 }
	 
	 if(userInput.equals("6")) {
		 getIndexOfMax();
	 }
	 
	 if(userInput.equals("7")) {
		 swapByIndex();
	 }
	 
	 if(userInput.equals("8")) {
		 removeAtIndex();
	 }
	 
	 if(userInput.equals("9")) {
		 insertAtIndex();
	 }
	 
	 if(userInput.equals("10")) {
		 isSorted();
	 }
	 
	 if(userInput.equals("q")) {
		 System.out.println("Goodbye");
		 i = 1;
	 }
   }
 }
 
 // 1) Write a public static method named printArray, 
 //   that takes two arguments. The first argument is an Array of int 
 //   and the second argument is a String. The method should print out 
 //   a list of the values in the array, each separated by the value of the second argument.
 	public static void printArray() {
 		
 		Scanner in = new Scanner(System.in);

 		System.out.println("How long do you want the array to be? ");
 		int numArray = in.nextInt();
 		
 		int array[] = new int[numArray];
 		
 		System.out.println("Please enter " + numArray + " values");
 		
 		for (int i = 0 ; i < array.length; i++ ) {
            array[i] = in.nextInt();
         }
 		
 		System.out.println("Input the String value to separate the array");
 		String strValue = in.nextLine();
 		
 		int n = array.length;
 		
 		for(int i = 0; i < n; i++) {
 			System.out.println(array[i] + strValue);
 		}
 		
 	}
 
 // 2) Write a public static method named getFirst, 
 //    that takes an Array of int as an argument and returns 
 //    the value of the first element of the array.
 	public static void getFirst() {
 		
 		Scanner in = new Scanner(System.in);

 		System.out.println("How long do you want the array to be? ");
 		int numArray = in.nextInt();
 		
 		int array[] = new int[numArray];
 		
 		System.out.println("Please enter " + numArray + " values");
 		
 		for (int i = 0 ; i < array.length; i++ ) {
            array[i] = in.nextInt();
         }
 		
 		int firstValue = array[0];
 		
 		System.out.println("The first value of the array is " + firstValue);
 		
 	}
 
 // 3) Write a public static method named getLast, 
 //    that takes an Array of int as an argument and returns 
 //    the value of the last element of the array.
 	public static void getLast() {
 		
 		Scanner in = new Scanner(System.in);

 		System.out.println("How long do you want the array to be? ");
 		int numArray = in.nextInt();
 		
 		int array[] = new int[numArray];
 		
 		System.out.println("Please enter " + numArray + " values");
 		
 		for (int i = 0 ; i < array.length; i++ ) {
            array[i] = in.nextInt();
         }
 		
 		int lastValue = array[numArray];
 		
 		System.out.println("The last value of the array is " + lastValue);
 		
 	}
 
 // 4) Write a public static method named getAllButFirst, 
 //    that takes an Array of int as an argument and creates and returns 
 //    a new array with all of the values in the argument array except the first value.
 	public static void getAllButFirst() {
 		
 		Scanner in = new Scanner(System.in);

 		System.out.println("How long do you want the array to be? ");
 		int numArray = in.nextInt();
 		
 		int array[] = new int[numArray];
 		
 		System.out.println("Please enter " + numArray + " values");
 		
 		for (int i = 0 ; i < array.length; i++ ) {
            array[i] = in.nextInt();
         }
 		
 		
 		for (int i = 1 ; i < array.length; i++ ) {
 			System.out.print(array[i]);
 		}
 		
 	}
 
 // 5) Write a public static method named getIndexOfMin, 
 //    that takes an Array of int as an argument and returns 
 //    the index of the least value in the array.
 	public static void getIndexOfMin() {
 		
 		Scanner in = new Scanner(System.in);

 		System.out.println("How long do you want the array to be? ");
 		int numArray = in.nextInt();
 		
 		int array[] = new int[numArray];
 		
 		System.out.println("Please enter " + numArray + " values");
 		
 		for (int i = 0 ; i < array.length; i++ ) {
            array[i] = in.nextInt();
         }
 		
 		int[] inputArray = null;
		int minValue = inputArray[0];
 		for(int i=1; i < inputArray.length; i++) {
 			if(inputArray[i] < minValue) {
 				minValue = inputArray[i];
 			}
 		}
 		
 		int i = 0;
 		while (i < array.length) {
 			
 			if(array[i] == minValue) {
 				System.out.println("The index of minimum value is " + i);
 			}
 			
 			else {
 				i += 1;
 			}
 		}
 	}

 
 // 6) Write a public static method named getIndexOfMax, 
 //    that takes an Array of int as an argument and returns 
 //    the index of the largest value in the array.
 	public static void getIndexOfMax() {
 		
 		Scanner in = new Scanner(System.in);

 		System.out.println("How long do you want the array to be? ");
 		int numArray = in.nextInt();
 		
 		int array[] = new int[numArray];
 		
 		System.out.println("Please enter " + numArray + " values");
 		
 		for (int i = 0 ; i < array.length; i++ ) {
            array[i] = in.nextInt();
         }
 		
 		int[] inputArray = null;
		int maxValue = inputArray[0];
 		for(int i=1; i < inputArray.length; i++) {
 			if(inputArray[i] > maxValue) {
 				maxValue = inputArray[i];
 			}
 		}
 		
 		int i = 0;
 		while (i < array.length) {
 			
 			if(array[i] == maxValue) {
 				System.out.println("The index of maximum value is " + i);
 			}
 			
 			else {
 				i += 1;
 			}
 		}
 	}
 
 // 7) Write a public static method named swapByIndex, 
 //    that takes three arguments. The first argument is an Array of int, 
 //    and the second and third arguments are int indexes. 
 //    This method will swap the values at the two given index arguments 
 //    in the array, and return a reference to the array.
 	public static void swapByIndex() {
 		
 		Scanner in = new Scanner(System.in);

 		System.out.println("How long do you want the array to be? ");
 		int numArray = in.nextInt();
 		
 		int array[] = new int[numArray];
 		
 		System.out.print(array);
 		
 		System.out.println("Please enter " + numArray + " values");
 		
 		for (int i = 0 ; i < array.length; i++ ) {
            array[i] = in.nextInt();
         }
 	
 		System.out.println("Please select an array index value: ");
 		int arrIndex1 = in.nextInt();
 		
 		System.out.println("Please select a second array index value: ");
 		int arrIndex2 = in.nextInt();
 		
 		int i = 0;
 		while (i < array.length) {
 			
 			if(i == arrIndex1) {
 				array[i] = array[arrIndex2];
 			}
 			
 			else {
 				i += 1;
 			}
 		}
 		
 		while (i < array.length) {
 			
 			if(i == arrIndex2) {
 				array[i] = array[arrIndex1];
 			}
 			
 			else {
 				i += 1;
 			}
 		}

 	}
 
 //8) Write a public static method named removeAtIndex, 
 //  that takes two arguments. The first argument is an Array of int, 
 //  and the second argument is an int index. This method create and return 
 //  a new array with all of the values in the argument array 
 //  except the value at the argument index.
 	public static void removeAtIndex() {

 		Scanner in = new Scanner(System.in);

 		System.out.println("How long do you want the array to be? ");
 		int numArray = in.nextInt();
 		
 		int array[] = new int[numArray];
 		
 		System.out.print(array);
 		
 		System.out.println("Please enter " + numArray + " values");
 		
 		for (int i = 0 ; i < array.length; i++ ) {
            array[i] = in.nextInt();
         }
 	
 		System.out.println("Please select an array index value to remove: ");
 		int arrIndex = in.nextInt();
 		
 		int[] newArray = new int[array.length - 1];
 		
 		for (int i = 0; i < array.length; i++) {
 			
 			if(i == arrIndex) {
 				
 			}
 			
 			else {
 				newArray[i] = in.nextInt();
 			}
 		}
 	}
 
 //9) Write a public static method named insertAtIndex, 
 //   that takes three arguments. The first argument is an Array of int, 
 //   the second argument is an int index, and the third argument is an int value. 
 //   This method create and return a new array with all of the values 
 //   in the argument array and including the third argument value 
 //   inserted at the index specified by the second argument value.
 	public static void insertAtIndex() {
 		
 		Scanner in = new Scanner(System.in);

 		System.out.println("How long do you want the array to be? ");
 		int numArray = in.nextInt();
 		
 		int array[] = new int[numArray];
 		
 		System.out.print(array);
 		
 		System.out.println("Please enter " + numArray + " values");
 		
 		for (int i = 0 ; i < array.length; i++ ) {
            array[i] = in.nextInt();
         }
 	
 		System.out.println("Please select an array index value to add: ");
 		int arrIndex = in.nextInt();
 		
 		System.out.println("Which value would you like to add? ");
 		int newValue = in.nextInt();
 		
 		int[] newArray = new int[array.length + 1];
 		
 		for (int i = 0; i < array.length; i++) {
 			
 			if(i == arrIndex) {
 				array[i] = newValue;
 			}
 			
 			else {
 				newArray[i] = in.nextInt();
 			}
 		}
 	}
 
 //10) Write a public static method named isSorted, 
 //    that takes an Array of int as an argument. 
 //    This method should return the boolean value true 
 //    if all the element values in the array are in ascending order; 
 //    otherwise the method should return the boolean value false.
 	public static void isSorted() {
 		
 		Scanner in = new Scanner(System.in);

 		System.out.println("How long do you want the array to be? ");
 		int numArray = in.nextInt();
 		
 		int array[] = new int[numArray];
 		
 		System.out.print(array);
 		
 		System.out.println("Please enter " + numArray + " values");
 		
 		for (int i = 0 ; i < array.length; i++ ) {
            array[i] = in.nextInt();
         }
 		
 		int i = 0;
 		for (int j = i + 1; j < numArray; j++) { 
            if (array[i] > array[j]) 
            {
                int newArray = array[i];
                array[i] = array[j];
                array[j] = newArray;
            }
        }
 		
 		System.out.print("Array Elements in Ascending Order: ");
 		
    for (i = 0; i < numArray - 1; i++) 
    {
        System.out.print(array[i] + ", ");
    }
   
    	System.out.print(array[numArray - 1]);
 	}
 }


