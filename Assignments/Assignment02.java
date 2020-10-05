package CSE110;

//CSE 110     : 76379
//Assignment  : Assignment 02
//Author      : Jeffrey Harrison, 1218599902
//Description : To estimate the amount of materials and costs for a project.

import java.util.Scanner;

public class Assignment02 {
 
 public static void main(String[] args) {
	 
     // declare and instantiate a Scanner
	 Scanner in = new Scanner(System.in);

	 
     // declare and initialize variables
     double lengthRoad, lengthRoadft, widthRoadft, weightAsphalt, numIntersections, numStoplights, numTrucks, costAsphalt, costStoplights, costPipes, costCrew, costLabor, costTotal, depthRoadft, numCrew, totalCubicft;
     int numLanes, depthAsphalt, numDays, numPipes;

     
     
     // collect inputs
     System.out.println("Length of the road project (miles) : ");
     lengthRoad = in.nextDouble();
     
     System.out.println("Number of lanes                    : ");
     numLanes = in.nextInt();
     if (numLanes > 8) {
    	 System.out.println("Your input exceeds the max number of lanes.");
     }

     System.out.println("Depth of asphalt (inches)          : ");
     depthAsphalt = in.nextInt();
     
     System.out.println("Days to complete project           : ");
     numDays = in.nextInt();

     
     // compute required values
     lengthRoadft = (lengthRoad * 5280);

     widthRoadft = (numLanes * 12);

     depthRoadft = ((double)depthAsphalt / 12);
     
     totalCubicft = (lengthRoadft * widthRoadft * depthRoadft);
     
     weightAsphalt = (totalCubicft * 150);
     
     numTrucks = Math.ceil(weightAsphalt / 10000);

     numIntersections = Math.floor(lengthRoad);
     
     numStoplights = ((numIntersections * 2) + (numIntersections * numLanes));
     
     numPipes = (int)(lengthRoadft / 24);
     Math.ceil(numPipes);
      
     numCrew = (double) Math.ceil((50 * lengthRoad * numLanes) / numDays);
   
     
     // calculate the costs
     costAsphalt = ((numTrucks * 5) * 200.00);
     
     costStoplights = (numStoplights * 25000.00);
    
     costPipes = (numPipes * 500.00);
     
     costCrew = ((numDays * 8) * 25.00);
     
     costLabor = (costCrew * numCrew);
     
     costTotal = (costAsphalt + costStoplights + costPipes + costLabor);
     
     
     // display results
     System.out.println("=== Amount of materials needed ===");
     System.out.println("Truckloads of Asphault : " + numTrucks);
     System.out.println("Stoplights             : " + numStoplights);
     System.out.println("Conduit pipes          : " + numPipes);
     System.out.println("Crew members needed    : " + numCrew);
     System.out.println("=== Cost of Materials ============");
     System.out.println("Cost of Asphalt        : $" + costAsphalt);
     System.out.println("Cost of Stoplights     : $" + costStoplights);
     System.out.println("Cost of Conduit pipes  : $" + costPipes);
     System.out.println("Cost of Labor          : $" + costLabor);
     System.out.println("=== Total Cost of Project ========");
     System.out.println("Total cost of project : $" + costTotal);
     
 	}
 }



