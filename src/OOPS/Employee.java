package OOPS;

public class Employee {
	public String name;
	public int empId;
	 public static int salary=1000;
	 public static String company="UST Gloabl";
	 
	 public Employee()
	 {}
	 
	 
	 public Employee(String name,int empId,int salary)
	 {
		 this.name=name;
		 this.empId=empId;
		 Employee.salary=salary;
	 }
	 public Employee(String name,int empId)
	 {
		 this.name=name;
		 this.empId=empId;
		 
	 }
	 
	 public static void ChangeCompany()
	 {
		 Employee.company="UST Global tech";
	 }
	
	public void PrintName()
	{
		System.out.println("Name of employee is "+this.name);
	}
	public void PrintID()
	{
		{
			System.out.println("ID of employee is "+this.empId);
		}
	}
	public void PrintSalary()
	{
		{
			System.out.println("Salary of employee is "+Employee.salary);
		}
	}
	
	public void PrintCompany()
	{
		System.out.println("Company name "+company);
	}
}


