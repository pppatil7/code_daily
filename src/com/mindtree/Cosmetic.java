package com.mindtree;

public class Cosmetic {
	
	int id;
	String name;
	String brandName;
	int quantity;
	double price;
	
	public Cosmetic() {}
	
	public Cosmetic(int id, String name, String brandName, int quantity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.brandName = brandName;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cosmetic [id=" + id + ", name=" + name + ", brandName=" + brandName + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	
	
	
	
	

}
