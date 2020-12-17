package CSE110;


public class preLab7 {
	
	public static void main(String [] args) {
		
		//Create Car objects with initial values
		
		Car car1 = new Car(2016, "Sonic");
		Car car2 = new Car(2007, "LS460");
			
		
		//Use setter method to add Make
		//car1's make is Chevrolet
		car1.setModelMake("Chevrolet");
		
		//car2's make is Lexus
		car2.setModelMake("Lexus");
		
		
		//Display the car info: Like "2002 Toyota Camry"
		//Displaying Car 1 info
		System.out.println(car1.getModelYear() + " " + car1.getModelMake() + " " + car1.getModelName());
		
		//Displaying Car 2 info
		System.out.println(car2.getModelYear() + " " + car2.getModelMake() + " " + car2.getModelName());

	}
}
