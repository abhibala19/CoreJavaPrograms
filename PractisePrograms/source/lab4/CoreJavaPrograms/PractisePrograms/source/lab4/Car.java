package CoreJavaPrograms.PractisePrograms.source.lab4;

public class Car {
	private String carName;
	private int fuelQty;
	private boolean isStarted;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		if (carName == null || carName.trim().equals("")) {
			System.out.println("Give a valid name");
		} else
			this.carName = carName;
	}

	public boolean isStarted() {
		return isStarted;
	}

	public void setStarted(boolean isStarted) {
		this.isStarted = isStarted;
	}

	public void setFuelQty(int n) {
		if (n > 0) {
			fuelQty = n;
		} else {
			System.out.println("give valid value");
		}
	}

	public int getFuelQty() {
		return fuelQty;
	}

	public void start() {
		if (fuelQty > 0) {
			System.out.println("i am " + getCarName() + "car started");
			isStarted = true;
		} else {
			System.out.println("there is no fuel to start the car");
		}
	}

	public void drive() {
		if (isStarted) {
			if (fuelQty > 0) {
				System.out.println("driving");
				fuelQty--;
			}
			if (fuelQty == 0) {
				stop();
			}
		}
	}

	public void reverse() {

		if (isStarted) {
			if (fuelQty > 0) {
				System.out.println("reversed");
				fuelQty--;
			}
			if (fuelQty == 0) {
				stop();
			}
		}
	}

	public void stop() {
		isStarted = false;
		System.out.println("the car is stopped");

	}
}