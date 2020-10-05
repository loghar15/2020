package CSE110;

// CSE 110    : 76375
//Assignment  : Assignment03
//Author      : Jeffrey Harrison, 1218599902
//Description : Calculating whether to buy, hold, or sell shares based on the user input

	import java.util.Scanner;
	import java.lang.Math;
	
public class Assignment03 {

 public static void main(String[] args) {
	 
     // declare and instantiate a Scanner
	 Scanner in = new Scanner(System.in);
     
     // declare and initialize variables
	 int currentShares, purchasePrice, marketPrice, fundsAvailable, numberofSharesToBuy, totalBuyCost, perShareBuyValue, totalBuyValue, perShareSellValue, totalSellValue;
	 int transactionFee = 10;
	
	 
     // prompt for and collect inputs
	 System.out.println("Current Shares  : ");
	 currentShares = in.nextInt();
	 
	 System.out.println("Purchase Price  : ");
	 purchasePrice = in.nextInt();
	 
	 System.out.println("Market Price    : ");
	 marketPrice = in.nextInt();
	 
	 System.out.println("Available Funds : ");
	 fundsAvailable = in.nextInt();
     
	 
     // compute required values
	 numberofSharesToBuy = (int) Math.floor((fundsAvailable-transactionFee) / marketPrice);
	 
	 totalBuyCost = transactionFee + (marketPrice * numberofSharesToBuy);
	 
	 perShareBuyValue = purchasePrice - marketPrice;
	 
	 totalBuyValue = perShareBuyValue * numberofSharesToBuy;
	 
	 perShareSellValue = marketPrice - purchasePrice;
	 
	 totalSellValue = perShareSellValue * currentShares;
	 

     // display required outputs
	   if(marketPrice < purchasePrice) {
		 
		   //Calculating based on the Purchase Price exceeding the Market Price.
		 if(totalBuyCost <= fundsAvailable && numberofSharesToBuy > 0) {
			 System.out.println("Buy " + numberofSharesToBuy + " shares");
			 }

		else if (numberofSharesToBuy == 0) {
			 System.out.println("Hold Shares");
			 }
		 }	 
		
	   //Calculating based on the Market Price exceeding the Purchase Price.
	   else {
		   
		 if((totalSellValue - transactionFee) >= purchasePrice){

			 System.out.println("Sell " + currentShares + " shares");
		 }
	     else {
	    	  System.out.println("Hold Shares");
	     }
	   }
 	}
}



