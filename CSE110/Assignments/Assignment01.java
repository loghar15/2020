package CSE110;
// CSE 110     : 76375/ iCourse
// Assignment  : Assignment01
// Author      : Jeffrey Harrison, 1218599902
// Description : To collect information about the available pizza and distribute amongst adults and children.

import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {  
        // declare and instantiate a Scanner
    	Scanner s=new Scanner(System.in);

    	
        // declare and initialize variables
    	int numPizzas, numSlices, numAdults, numChildren;
        int totalSlices, adultSlices, availableSlices, childSlices, leftoverSlices;
       
        
        // prompt for and collect inputs
        System.out.println("Number of pizzas purchased : ");
        numPizzas=s.nextInt();
        
        System.out.println("Number of slices per pizza : ");
        numSlices=s.nextInt();
        
        System.out.println("Number of adults           : ");
        numAdults=s.nextInt();
        
        System.out.println("Number of children         : ");
        numChildren=s.nextInt();
        
        
        // compute required values
        totalSlices= (numPizzas * numSlices);
        
        adultSlices= (numAdults * 2);
        
        availableSlices= (totalSlices - adultSlices);
        
        childSlices= (availableSlices / numChildren);
        
        leftoverSlices= (availableSlices - (childSlices * numChildren));       
        

        // display required outputs
        System.out.println("Total number of slices of pizza               : " + totalSlices);
        System.out.println("Total number of slices given to adults        : " + adultSlices);
        System.out.println("Total number of slices available for children : " + availableSlices);
        System.out.println("Number of slices each child will get          : " + childSlices);
        System.out.println("Number of slices left over                    : " + leftoverSlices);

    }
}
