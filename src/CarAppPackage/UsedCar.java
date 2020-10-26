package CarAppPackage;

public class UsedCar extends Car {
	private double mileage;
	
	public UsedCar (int year, String make, String model, double price, double mileage) {
		super(year, make, model, price);
		this.mileage = mileage;
	}
	
	public double getMileage() {
		return mileage;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	@Override
	public String toString() {
		return "UsedCar [Make=" + getMake() + ", Model=" + getModel()
				+ ", Year=" + getYear() + ", Price=" + getPrice() +  ", Mileage=" + mileage + "]";
	}
	
}
