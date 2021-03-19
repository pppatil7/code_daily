package com.student.record;

public class Student {

	int studentId;
	String studentName;
	int studentAge;
	int studentStandard;
	String studentAddress;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, int studentAge, int studentStandard, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentStandard = studentStandard;
		this.studentAddress = studentAddress;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public int getStudentStandard() {
		return studentStandard;
	}

	public void setStudentStandard(int studentStandard) {
		this.studentStandard = studentStandard;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentStandard=" + studentStandard + ", studentAddress=" + studentAddress + "]";
	}

}
