package test;

import java.util.Scanner;

public class conditionsExample {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your age ");
		int age=scanner.nextInt();
		if (age>=18)
		{
			System.out.println("You are eligible to vote");
		}
		else if (age==17)
		{
			System.out.println("Come back next year");
		}
		else
		{
			System.out.println("Sorry not eligible");
			
		}
		scanner.close();
		

	}

}
