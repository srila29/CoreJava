package test;
import java.util.Scanner;
public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				Scanner scanner=new Scanner(System.in);
				System.out.println("Enter the number to be checked ");
				int num=scanner.nextInt();
			//	int counter=0;
				boolean flag=true;
				for(int i=2;i<num/2;i++)
				{
					if(num%i==0)
					{
						//counter=counter+1;
						flag=false;
						break;
					}
				}
			//	if(counter==0)
				if(flag==true)
				{
					System.out.println("The given number"+num+" is a prime number");
				}
				else
				{
					System.out.println("The given number "+num+" is not a prime number");
				}
scanner.close();
	}
}


