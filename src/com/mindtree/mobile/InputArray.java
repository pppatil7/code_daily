package com.mindtree.mobile;

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
	
	public static Mobile[] mobarr=new Mobile[3];
	static int size=0;
	public static void takeArrayValue() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mobile id: ");
		int id=sc.nextInt();
		System.out.println("enter the mobile model name: ");
		sc.nextLine();
		String model=sc.nextLine();
		System.out.println("enter the mobile price: ");
		double price=sc.nextDouble();
		System.out.println("enter the number of sims: ");
		int numberOfSims=sc.nextInt();
		System.out.println("enter the mobile has camera or not: ");
		boolean hasCamera=sc.nextBoolean();
		Mobile mobile=new Mobile(id, model, price, numberOfSims, hasCamera);
		mobarr[size]=mobile;
		size++;
		System.out.println("are u wanted to enter another entry enter 'yes/no' ");
		sc.nextLine();
		String yesNo=sc.nextLine();
		
		if(yesNo.contains("yes")) {
			InputArray.takeArrayValue();
		}
			System.out.println(mobarr);
	}
	
	public static void displayByModelName(Mobile[] mobarr) {
		String[] modelArr=new String[size];
		for(int i=0;i<size;i++) {
			modelArr[i]=mobarr[i].getModel();
		}
		Arrays.sort(modelArr);
		System.out.println(String.valueOf(mobarr));	
	}	
}