package com.car;

public class Car {

	int carId;
	String carName;
	String carBrand;
	int modelYear;
	double carPrice;

	public Car() {
		super();
	}

	public Car(int carId, String carName, String carBrand, int modelYear, double carPrice) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carBrand = carBrand;
		this.modelYear = modelYear;
		this.carPrice = carPrice;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", carBrand=" + carBrand + ", modelYear=" + modelYear
				+ ", carPrice=" + carPrice + "]";
	}

}
