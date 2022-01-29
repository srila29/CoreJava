package test;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter divisor");
		int div=scanner.nextInt();
		int result=0;
		int[] arr= {1,2,4};
				try {
		result=num/div;
		System.out.println(arr[10]);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inside Arithmetic expression");
		
		}
				
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("Array out of bound");
				}
		catch(Exception e)
		{
			System.out.println("Exception raised");
		}
				finally {
					System.out.println("Inside finally");
				}
		System.out.println(result);
		System.out.println("After try and catch");
		scanner.close();
		

	}

}
