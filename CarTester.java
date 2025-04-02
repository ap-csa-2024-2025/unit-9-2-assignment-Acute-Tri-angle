public class CarTester
{
	public static void run()
	{
		// Create a Car object
		Car car_in_poland = new Car("toyota", 23);
		// Print out the model
		System.out.println(car_in_poland.getModel());
		// Print out the fuelLevel
		System.out.println(car_in_poland.getFuelLevel());
		// Print how many miles are left with 23 mpg
		System.out.println(car_in_poland.milesLeft(23));
		// Print the object
		System.out.println(car_in_poland.toString());
		// Create an ElectricCar object
		ElectricCar car_in_Cali = new ElectricCar("CyberBum", 23);
		// Print out the model
		System.out.println(car_in_Cali.getModel());
		// Print out the fuelLevel
		System.out.println(car_in_Cali.getFuelLevel());
		// Print how many miles are left with 400 miles per charge
		System.out.println(car_in_Cali.milesLeft(400));
		// Print the object
		System.out.println(car_in_Cali.toString());
	}
}
