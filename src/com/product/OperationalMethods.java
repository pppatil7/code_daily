package com.product;

import java.util.Scanner;

public class OperationalMethods {
	
	public static Product[] arr = new Product[10];
	
	Scanner sc=new Scanner(System.in);
	public Product[] addProductDetails(Product[] product) {
		System.out.println("enter the id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name");
		String name=sc.nextLine();
		System.out.println("enter the quantity");
		int quantity=sc.nextInt();
		System.out.println("enter the price per quantity");
		float pricePerQuantity=sc.nextFloat();
		Product p=new Product(id, name, quantity, pricePerQuantity);
		product=addNewProducts(product, p);
		return product;
	}
	
	public Product[] addNewProducts(Product[] product,Product p) {
		Product[] newProduct=new Product[product.length+1];
        for(int i=0;i<product.length;i++) {
        	newProduct[i]=product[i];
        }
        newProduct[product.length]=p;
        return newProduct;
	}
	
	public int[] getCurrentArray() {
		return this.arr;
	}
	

}
