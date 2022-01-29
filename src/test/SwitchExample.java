package test;
import java.util.Scanner;
public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string to be checked ");
				String str=scanner.nextLine();
		int vowel=0;
		for(int index=0;index<str.length();index++)
		{
			char temp=str.toUpperCase().charAt(index);
			
			switch(temp)
			{
			case 'A':
			//case 'a':
			case 'E':
			//case 'e':	
			case 'I':
			//case 'i':		
			case 'O':
			//case 'o':	
			case 'U':
			//case 'u':
				vowel++;
				break;		
			default:
				System.out.println("Inside default");
				
				
				
			
			}
		}
      System.out.println("The number of vowels are: "+vowel);
      scanner.close();
	}

}
