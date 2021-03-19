package com.mindtree.medicine;

public class Customer {

	int id;
	String cName;
    int age;
	public Customer() {
		super();
	}
	public Customer(int id, String cName, int age) {
		super();
		this.id = id;
		this.cName = cName;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", cName=" + cName + ", age=" + age + "]";
	}
    
	
    
	
}
