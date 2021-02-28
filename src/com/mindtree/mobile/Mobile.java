package com.mindtree.mobile;

public class Mobile {
	
	int id;
	String model;
	double price;
	int numberOfSims;
	boolean hasCamera;
	
	public Mobile(int id, String model, double price, int numberOfSims, boolean hasCamera) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
		this.numberOfSims = numberOfSims;
		this.hasCamera = hasCamera;
	}
	
	public Mobile() {
		super();
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumberOfSims() {
		return numberOfSims;
	}
	public void setNumberOfSims(int numberOfSims) {
		this.numberOfSims = numberOfSims;
	}
	public boolean isHasCamera() {
		return hasCamera;
	}
	public void setHasCamera(boolean hasCamera) {
		this.hasCamera = hasCamera;
	}
	
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", model=" + model + ", price=" + price + ", numberOfSims=" + numberOfSims
				+ ", hasCamera=" + hasCamera + "]";
	}
}
