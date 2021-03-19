package com.student.record;

import java.util.Scanner;

import com.policy.Policy;

public class StudentService {
	
	private final static int DEFAULT_SIZE = 2;
	Student[] studentArr = new Student[DEFAULT_SIZE];
	int currentArraySize = 0;
	Scanner sc = new Scanner(System.in);
    
	
	public Student takeStudentDetails() {
		Student[] student=new Student[1];
		System.out.println("enter the student id");
		int studentId = sc.nextInt();
		System.out.println("enter the student name");
		sc.nextLine();
		String studentName = sc.nextLine();
		System.out.println("enter the student age");
		int studentAge = sc.nextInt();
		System.out.println("enter the student standard");
		int studentStandard=sc.nextInt();
		System.out.println("enter the student address");
		sc.nextLine();
		String studentAddress = sc.nextLine();
		Student students=new Student(studentId, studentName, studentAge, studentStandard, studentAddress);
		addStudentDetailsToArray(student);
		return students;
	}
	
	public void addStudentDetailsToArray(Student[] student) {
		if (currentArraySize < studentArr.length) {
			studentArr[currentArraySize] = student[0];
			currentArraySize++;
		} else if (currentArraySize == studentArr.length) {
			//growArray();
			studentArr[currentArraySize] = student[0];
			currentArraySize++;
		}
	  
	}
	
	public void growArray() {
		int newSize = studentArr.length * 2;

		Student[] tempArray = new Student[newSize];
		for (int i = 0; i < currentArraySize; i++) {
			tempArray[i] = studentArr[i];
		}
		studentArr = tempArray;
	}
	
	//update student details
	public void updateStudentDetails(Student student) {
		System.out.println("enter the updated address");
		sc.nextLine();
		String studentAddress = sc.nextLine();
		System.out.println("enter the updated age");
		int studentAge=sc.nextInt();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
