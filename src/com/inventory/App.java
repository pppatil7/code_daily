package com.inventory;

import java.util.Scanner;

import com.product.Product;

public class App {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// todo right switch case
		Scanner scanner = new Scanner(System.in);
		App appInstace = new App();
		ProductService service = new ProductService();
		
		System.out.println("============= MENU BAR ============= ");
		System.out.println("Choice 1. Add Product ");
		System.out.println("Choice 2. Update product ");
		System.out.println("Choice 3. Delete product ");
		System.out.println("Choice 4. Exit ");
		System.out.println("\n Choose you choice between above options ");
		int choice = scanner.nextInt();
		System.out.println("Choice selected: "+ choice);
		if(choice == 1) {
			Product product = appInstace.addProductChoice();
			service.addProduct(product);
			service.displayProducts();
		}
		
	}
	
	public Product addProductChoice() {
		int id;
		String name;
		int quantity;
		float pricePerQunatity;
		
		System.out.println("enter the id");
		id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter the name");
		name=sc.nextLine();
		
		System.out.println("enter the quantity");		
		quantity=sc.nextInt();
		
		System.out.println("enter the price per quantity");
		float pricePerQuantity=sc.nextFloat();
		
		Product product = new Product(id, name, quantity, pricePerQuantity);
		return product;
	}
	
	public void exitFromProgram() {
		System.exit(0);
	}

}
