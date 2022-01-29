package OOPS;

public class EncapsulationExample {
	//private String name; Changed the attribute name to Fname - Encapsulation example
	private String fname;
	private int salary;
	private String company;
	public String getName() {
		return fname;
	}
	public void setName(String name) {
		this.fname = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

}
