package day26;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class Main {
	public static void main(String[] args) {
		Car oldJunker = new Car("Ford", "Pinto", 1972, 17.5, 132480, 12, 8); // creates a new Car object

		oldJunker.drive(5); // drives the Car 5 miles
		oldJunker.fillTank(1); // put in a gallon of gas
		System.out.println(oldJunker.getFuelRemaining()); // prints the amount of fuel left

		// when you print an object
		// it defaultly shows the memory address information
		// because that's the default format of toString method
		// == when you print an object,
		// you are actually print the result to toString
		System.out.println(oldJunker); // prints the attributes of the car to the screen
	}
}

class Car {
	// make instance variable private
	private String make;
	private String model;
	private int year;
	private double mpg;
	private double milesDriven;
	private double fuelCapacity;
	private double fuelRemaining;

	public Car(String make, String model, int year, double mpg, double milesDriven, double fuelCapacity,
			double fuelRemaining) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.mpg = mpg;
		this.milesDriven = milesDriven;
		this.fuelCapacity = fuelCapacity;
		this.fuelRemaining = fuelRemaining;
	}

	void fillTank(double g) {
		this.fuelRemaining = Math.min(this.fuelRemaining + g, this.fuelCapacity);
	}

	void drive(double m) {
		double fuelNeeded = m / this.mpg;
		if (fuelNeeded <= this.fuelRemaining) {
			this.milesDriven += m;
			this.fuelRemaining -= fuelNeeded;
		}
	}

	public double getFuelRemaining() {
		return fuelRemaining;
	}

	// override
	@Override
	public String toString() {
		return "Model:" + model + ",\n" + "Make:" + make + ",\n" + "year:" + year + ",\n" + "mpg:" + mpg + ",\n"
				+ "milesDriven:" + milesDriven + ",\n" + "fuelCapacity:" + fuelCapacity + ",\n" + "fuelRemaining:"
				+ fuelRemaining + ",\n";
	}

}