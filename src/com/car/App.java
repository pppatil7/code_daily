package com.car;

public class App {

	public static void main(String[] args) {
		CarService service=new CarService();
		
		Car[] car=new Car[4];
		Car car1=new Car(1, "hjvjd", "hyndai", 1991, 974934);
		Car car2=new Car(2, "jvbfhbnc", "maruti", 1993, 32532523);
		Car car3=new Car(3, "kfhgjf", "maruti", 1990, 87658364);
		Car car4=new Car(4, "jgrgg", "hyndai", 1981,7586865);
		car[0]=car1;
		car[1]=car2;
		car[2]=car3;
		car[3]=car4;
		
		Car cars = service.searchCarDetailsById(car, 2);
		int id = cars.getCarId();
		double price = cars.getCarPrice();
		System.out.println(id);
		System.out.println(price);
		
		
		
	}
}
