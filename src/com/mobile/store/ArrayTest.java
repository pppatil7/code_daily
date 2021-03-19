package com.mobile.store;

public class ArrayTest {

	private final static int DEFAULT_SIZE = 2;
	int[] array = new int[DEFAULT_SIZE];
	int currentArraySize = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayTest myArray = new ArrayTest();
		
		myArray.add(50);
		myArray.printArraySizeAndLength();
		myArray.add(20);
		myArray.printArraySizeAndLength();
		myArray.add(570);
		myArray.printArraySizeAndLength();
		myArray.add(270);
		myArray.printArraySizeAndLength();
		myArray.add(670);
		myArray.printArraySizeAndLength();
		
		System.out.println("===== new Instance ====");
		ArrayTest myArray2 = new ArrayTest();
		myArray2.add(50);
		myArray2.printArraySizeAndLength();
		
		
	}
	
	public void add(int num) {
		if(currentArraySize < array.length) {
			array[currentArraySize] = num;
			currentArraySize++;
		}else if(currentArraySize == array.length ) {
			growArray();
			array[currentArraySize] = num;
			currentArraySize++;
		}
	}
	
	public void growArray() {
		int newSize = array.length * 2;
		
		int[] tempArray = new int[newSize];
		for(int i=0; i< currentArraySize; i++) {
			tempArray[i] = array[i];
		}		
		array = tempArray;
	}
	
	public void printArraySizeAndLength() {
		System.out.println("Current array length: "+ array.length+ " size: "+ currentArraySize);
	}

}
