package com.mindtree.emp;

enum DeptName{
	COMPUTER, ARTS, PHYSICS
}

enum Designation{
	HOD, ASSISTANT_PROFESSOR, PROFESSOR, INSTRUCTOR
}

public class Employee {
	private long empid;
	private String empName;
	private DeptName deptName;
	private int experiance;
	private Designation designation;
	
	public Employee() {}
	
	
	
	public Employee(long empid, String empName, DeptName deptName, int experiance, Designation designation) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.deptName = deptName;
		this.experiance = experiance;
		this.designation = designation;
	}

	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public DeptName getDeptName() {
		return deptName;
	}
	public void setDeptName(DeptName deptName) {
		this.deptName = deptName;
	}
	public int getExperiance() {
		return experiance;
	}
	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	
	
	
}
