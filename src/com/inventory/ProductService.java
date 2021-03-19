package com.inventory;

import com.product.Product;

public class ProductService {
	
	public static Product[] products = new Product[10];
	public static int arraySize = 0;
	
	public void addProduct(Product product) {
		products[arraySize] = product;
		arraySize++;
	}
	
	public void displayProducts() {
		for (int i = 0; i < arraySize; i++) {
			System.out.println(products[i]);
		}
	}

}
