package com.mindtree.medicine;

public class Medicine {

	String name;
	int quantity;
	int price;
	
	public Medicine() {
		super();
	}
	
	public Medicine(String name, int quantity, int price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Medicine [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
}
