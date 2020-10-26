package CarAppPackage;

public class Car {
	
	protected String make;
	protected String model;
	protected int year;
	protected double price;

	public Car (int year, String make, String model, double price) {
		this.year = year;
		this.make = make;
		this.model = model;
		this.price = price;
	}
	
	public Car () {
	}
	
	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [Make=" + make + ", Model=" + model + ", Year=" + year + ", Price=" + price + "]";
	}

}
