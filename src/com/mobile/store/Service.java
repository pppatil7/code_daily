package com.mobile.store;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {
	public static int defaultSize=16; 
	public static Mobile[] mobileArr=new Mobile[defaultSize];
	public static int arraySize=0;
	static Scanner sc=new Scanner(System.in);
	
	public void addMobileToArray(Mobile mobile) {
		mobileArr[arraySize]=mobile;
		//new ArrayList(10);
		arraySize++;
		if(arraySize==defaultSize) {
			defaultSize=defaultSize*2;
			
		}
	}
	public void displayAllMobileInSystem() {
		for(int i=0;i<arraySize;i++) {
			System.out.println(mobileArr[i].getId()+" "+mobileArr[i].getModel()+" "+mobileArr[i].getPrice()+" "+mobileArr[i].getDateOfManufacture());
		}
	}
	public void takeMobileDetails() {
		System.out.println("enter the mobile id");
		int id=sc.nextInt();
		System.out.println("enter the mobile model name");
		sc.nextLine();
		String model=sc.nextLine();
		System.out.println("enter the price of the mobile");
		int price=sc.nextInt();
		System.out.println("enter the date of manufacture of mobile");
		sc.nextLine();
		String dateOfManufacture=sc.nextLine();
		Mobile mobile=new Mobile(id, model, price, dateOfManufacture);
		addMobileToArray(mobile);
	}
	
	public void updateAndDisplay() {
		System.out.println("enter the id of mobile that u wanted to update the price");
		int id=sc.nextInt();
		System.out.println("enter the updated price of the mobile");
		float price=sc.nextFloat();
		int index=0;
		for(int i=0;i<arraySize;i++) {
			if(mobileArr[i].getId()==id) {
				mobileArr[i].setPrice(price);
				index=i;
				break;
			}
		}
		System.out.println(mobileArr[index].getId()+" "+mobileArr[index].getModel()+" "+mobileArr[index].getPrice()+" "+mobileArr[index].dateOfManufacture);
	}
	
	public void sortGivenArrayByName(Mobile[] mobiles) {
		for(int i=0; i < arraySize; i++) {
			for(int j=i+1;j<arraySize;j++) {
				
			}	
		}
	}
	
	
	public void deleteOneMobileById() {
		System.out.println("enter the id of mobile that u wanted to delete");
		int id=sc.nextInt();
		int index=0;
		for(int i=0;i<arraySize;i++) {
			if(mobileArr[i].getId()==id) {
				index=i;
			}
		}
		for(int j=index;j<arraySize-1;j++) {
			mobileArr[j]=mobileArr[j+1];
		}
		arraySize--;
	}

	
}