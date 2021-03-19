package com.product;

public class Product {

	int id;
	String name;
	int quantity;
	float pricePerQuantity;

	public Product(int id, String name, int quantity, float pricePerQuantity) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.pricePerQuantity = pricePerQuantity;
	}

	public Product() {
		super();
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPricePerQuantity() {
		return pricePerQuantity;
	}

	public void setPricePerQuantity(float pricePerQuantity) {
		this.pricePerQuantity = pricePerQuantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", pricePerQuantity="
				+ pricePerQuantity + "]";
	}

}
