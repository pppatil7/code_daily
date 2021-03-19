package com.car;

import java.util.Scanner;

public class CarService {

	private final static int DEFAULT_SIZE = 2;
	Car[] carArr = new Car[DEFAULT_SIZE];
	int currentArraySize = 0;
	Scanner sc = new Scanner(System.in);

	public void takeCarDetails() {
		System.out.println("enter the car id");
		int carId = sc.nextInt();
		System.out.println("enter the car name");
		sc.nextLine();
		String carName = sc.nextLine();
		System.out.println("enter the car brand name");
		sc.nextLine();
		String carBrand = sc.nextLine();
		System.out.println("enter the model year");
		int modelYear = sc.nextInt();
		System.out.println("enter the price of the car");
		double carPrice = sc.nextDouble();
		boolean flag1 = isBrandNameValid(carBrand);
		boolean flag2 = isIdValid(carId);
		if (flag1 == true && flag2 == true) {
			Car car = new Car(carId, carName, carBrand, modelYear, carPrice);
			addCarDetailsToArray(car);
		} else {
			System.out.println("enter the id unique or car brand name correct");
			takeCarDetails();
		}

	}

	public void addCarDetailsToArray(Car car) {
		if (currentArraySize < carArr.length) {
			carArr[currentArraySize] = car;
			currentArraySize++;
		} else if (currentArraySize == carArr.length) {
			growArray();
			carArr[currentArraySize] = car;
			currentArraySize++;
		}
	}

	public void growArray() {
		int newSize = carArr.length * 2;

		Car[] tempArray = new Car[newSize];
		for (int i = 0; i < currentArraySize; i++) {
			tempArray[i] = carArr[i];
		}
		carArr = tempArray;
	}

	public boolean isIdValid(int carId) {
		boolean flag = true;

		for (int i = 0; i < currentArraySize; i++) {
			if (carArr[i].getCarId() == carId) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public boolean isBrandNameValid(String carBrand) {
		boolean flag = false;
		String newStr = "";
		int ascii = 0;
		char ch = ' ';
		for (int i = 0; i < carBrand.length(); i++) {
			ch = carBrand.charAt(i);
			ascii = ch;

			if (ascii >= 65 && ascii <= 90) {
				ascii = ascii + 32;
				ch = (char) ascii;
			}
			newStr = newStr + ch;
		}
		if (newStr.equals("hyundai") || newStr.equals("maruti")) {
			flag = true;
		}
		return flag;
	}

	//sort the array by id in insertion sort
	public Car[] insertionSortByCarId(Car[] carArr) {
		
		int n = carArr.length;
        for (int i = 1; i < n; ++i) {
            int key = carArr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
		return carArr;
	}
	
	
	
	
	
	
	//sort the array by using id in bubble sort
	public void sortByCarId(Car[] carArr) {
		Car temp=null;
		for(int i=0;i<carArr.length;i++) {
			for(int j=i+1;j<carArr.length;j++) {
				if(carArr[i].getCarId()>carArr[j].getCarId()) {
					temp=carArr[i];
					carArr[i]=carArr[j];
					carArr[j]=temp;
				}
			}
		}
	}
	
	//binary search
	public int binarySearch(Car[] carArr,int low,int high,int carId) {
		if(high<low)
		return -1;
		int mid=(low+high)/2;
		if(carArr[mid].getCarId()==carId)
		return mid;
		if(carId>carArr[mid].getCarId())
		return binarySearch(carArr, (mid+1), high, carId);
		return binarySearch(carArr, low, (mid-1), carId);
	}
	
	//search by carId using binary search
	public Car searchCarDetailsById(Car[] carArr,int carId) {
     sortByCarId(carArr);
     int low=0;
     int high=carArr.length;
		int indexOfSearchCar = binarySearch(carArr, low, high, carId);
		
		return carArr[indexOfSearchCar];
	}
	//update car price by Id
	public Car updateCarPriceById(Car[] carArr, int carId) {
		Car car=null;
		for(int i=0;i<carArr.length;i++) {
			if(carArr[i].getCarId()==carId) {
				car=carArr[i];
				break;
			}
		}
		return car;
	}
	
	
	

}
