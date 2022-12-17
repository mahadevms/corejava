package list;

public class Employees {
	private String firstName;
	private String surName;
	private int empId;
	public Employees(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.surName = lastName;
		this.empId = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return surName;
	}
	public void setLastName(String lastName) {
		this.surName = lastName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int id) {
		this.empId = id;
	}

}
