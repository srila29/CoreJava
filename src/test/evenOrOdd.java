package test;
import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number to be checked ");
		int num1=scanner.nextInt();
		if (num1%2==0)
		{
			System.out.println("Number is even");
			
		}
		else {
			System.out.println("Number is odd");
		}
		scanner.close();

	}

}
