package com.mobile.store;

public class Mobile {

	int id;
	String model;
	float price;
	String dateOfManufacture;

	public Mobile() {
		super();
	}

	public Mobile(int id, String model, float price, String dateOfManufacture) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
		this.dateOfManufacture = dateOfManufacture;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", model=" + model + ", price=" + price + ", dateOfManufacture=" + dateOfManufacture
				+ "]";
	}

}
