package OOPS;

public class Child extends Person {
	String profession;
	public Child()
	{
		System.out.println("Inside Child default constructor");
	}
	
	public Child(String Name,int Age,String Profession)
	{
		super(Name,Age);
		this.profession=Profession;
	}
 public void print()
 {
	 
	System.out.println("Inside child"); 
 }
 public void display()
 {
	 System.out.println("Inside child display function");
 }
 
}
