package OOPS;

public class Person {
public String name;
public int age;

public Person()
{
System.out.println("Inside Parent default constructor");	
}

public Person(String Name,int Age)
{
	this.name=Name;
	this.age=Age;
}

 void display()
{ 
	 //System.out.println(name);
	System.out.println("Inside parent display function");
	}

}
