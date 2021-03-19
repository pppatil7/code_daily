package com.inventory;

import java.util.Scanner;

import com.product.Product;

public class Service {

	public static Product[] products = new Product[100];
	public static int arraySize = 0;
	Scanner sc = new Scanner(System.in);

	public void addProduct(Product product) {
		products[arraySize] = product;
		arraySize++;
	}

	public void takeInputAndAddProduct() {
		System.out.println("enter the id of the product");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name of the product");
		String name = sc.nextLine();
		System.out.println("enter the quantity of product");
		int quantity = sc.nextInt();
		System.out.println("enter the price per quantity of the product");
		int pricePerQuantity = sc.nextInt();
		Product product = new Product(id, name, quantity, pricePerQuantity);
		addProduct(product);
	}

	public void displayProductDetails() {
		for (int i = 0; i < arraySize; i++) {
			System.out.println(products[i]);
		}
	}

	public void updateQuantityofProduct() {
		System.out.println("enter the name of the product that u wanted to update");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("enter the quantity of the that u wanted to update");
		int quantity=sc.nextInt();
		for (int i = 0; i < arraySize; i++) {
			if (products[i].getName().equals(name)) {
				products[i].setQuantity(quantity);
				break;
				//System.out.println(products[i]);
			}
		}
	}

	public void displayProductsWhereQuantityLess() {
		System.out.println("enter the quantity that u wanted to display below that");
		int quantity=sc.nextInt();
		for (int i = 0; i < arraySize; i++) {
			if (products[i].getQuantity() < quantity) {
				System.out.println(products[i]);
			}
		}
	}

	public void productSortByQuantity() {
		Product temp;
		for (int i = 0; i < arraySize; i++) {
			for (int j = i + 1; i < arraySize; j++) {
				if (products[i].getQuantity() > products[j].getQuantity()) {
					temp = products[i];
					products[i] = products[j];
					products[j] = temp;
				}

			}
		}
		for (int k = 0; k < arraySize; k++) {
			System.out.println(products[k]);
		}
	}

}
