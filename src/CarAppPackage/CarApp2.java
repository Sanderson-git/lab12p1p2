package CarAppPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp2 {
	static List<Car> carList = new ArrayList<>();
	private static Scanner scnr = new Scanner(System.in);
	private static int invenCount = 1;
	private static int invenSelection = 0;
	private static boolean purchaseConfirmation;
	private static boolean stillSelecting = true;

	public static void main(String[] args) {
		fillInven();

		printInven();

		while (stillSelecting) {
			selectInven();
			if (stillSelecting) {
			printInven();
			}
		}

	}

	public static void printInven() {
		System.out.println("Inventory: ");
		invenCount = 1;
		for (Car car : carList) {
			System.out.print(invenCount + ". " + car.getMake() + " " + car.getModel() + " " + car.getYear() + " "
					+ car.getPrice());
			if (car instanceof UsedCar) {
				System.out.print(" (used) " + ((UsedCar) car).getMileage() + " miles");
			}
			System.out.println();
			invenCount++;
		}
		System.out.println(invenCount++ + ". Quit");
	}

	public static void selectInven() {
		invenSelection = Validator.getInt(scnr, "Which car would you like? (Select with inventory number)") - 1;

		if (invenSelection == (carList.size())) { // selecting quit
			System.out.println("Selection ending. Have a great day.");
			stillSelecting = false;
			return;

		} else if (invenSelection > (carList.size() + 1)) { // error input
			System.out.println("Error. Selection out of bounds.");
			stillSelecting = true;
			return;
		} else {
			System.out.print(carList.get(invenSelection).getMake() + " " + carList.get(invenSelection).getModel() + " "
					+ carList.get(invenSelection).getYear() + " " + carList.get(invenSelection).getPrice());
			if (carList.get(invenSelection) instanceof UsedCar) {
				System.out.print(" " + ((UsedCar) carList.get(invenSelection)).getMileage() + " miles");
			}

			purchaseConfirmation = Validator.getYesNo(scnr, "\r\nWould you like to buy this car?");
			if (purchaseConfirmation) {
				System.out.println("Excellent! Our finance department will be in touch shortly.");
				carList.remove(invenSelection);
//		invenCount = invenCount--;
				return;
			}
		}
	}
	
	

	public static void fillInven() {
		carList.add(new Car(2020, "Nikolai", "Model S", 54999.90));
		carList.add(new Car(2020, "Fourd", "Escapade", 31999.90));
		carList.add(new Car(2020, "Chewie", "Vette", 44989.95));
// used cars
		carList.add(new UsedCar(2015, "Hyonda", "Prior", 14795.50, 35987.6));
		carList.add(new UsedCar(2013, "GC", "Chirpus", 8500.00, 12345.0));
		carList.add(new UsedCar(2016, "GC", "Witherell", 14450.00, 3500.3));
	}

}
