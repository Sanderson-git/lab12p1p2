package CarAppPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp1 {
	
	private static Scanner scnr;
	private static List<Car> carList = new ArrayList<>();

	public static void main(String[] args) {
		scnr = new Scanner (System.in);
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		carInput();
		invenPrint();
	}
	
	public static void carInput () {
		int carAmnt = 0;
//		System.out.println("How many cars are you entering?");
		carAmnt = Validator.getInt(scnr, "How many cars are you entering?");
		for (int i = 0; i < carAmnt; i++) {
//			System.out.println("Enter Car #" + (i + 1) + " Make: ");
			String carMake = Validator.getString(scnr, "Enter Car #" + (i + 1) + " Make: ");
//			System.out.println("Enter Car #" + (i + 1) + " Model: ");
			String carModel = Validator.getString(scnr, "Enter Car #" + (i + 1) + " Model: ");
//			System.out.println("Enter Car #" + (i + 1) + " Year: ");
			int carYear = Validator.getInt(scnr, "Enter Car #" + (i + 1) + " Year: ");
//			System.out.println("Enter Car #" + (i + 1) + " Price: ");
			double carPrice = Validator.getDouble(scnr, "Enter Car #" + (i + 1) + " Price: ");
			carList.add(new Car(carYear, carMake, carModel, carPrice));
		}	
	}
	
	public static void invenPrint () {
		System.out.println("\r\nCurrent Inventory: ");
		for (Car car : carList) {
//			System.out.println(car.getMake() + "     " + car.getModel() + "     " + car.getYear() + "     $" + car.getPrice());
			System.out.printf("%-7s " + "%-10s " + "%-4d " + "$" + "%-6.2f", car.getMake(), car.getModel(), car.getYear(), car.getPrice());
		}
	}

}
