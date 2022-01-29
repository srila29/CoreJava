package test;

public class loopExample {

	public static void main(String[] args) {
		int i=1;
		//While loop
		while(i<=10)
		{
			if(i%5==0)
			{
				i=i+1;				continue;
			}
			else
			{
			System.out.println(i);
			i=i+1;
			}
			
		}
		
		//For loop
		for(int j=1;j<=10;j++)
		{
			if(j==5)
			{
				continue;
			}
			System.out.println(j);
		}
		//For loop reverse counting
		for(int j=10;j>0;j--)
		{
		
			System.out.println(j);
		}
		
		//Array and for loop
		int[] arrNum= {1,2,3,4};
		String quote= "Clean India Green India";
		String[] arrWords=quote.split(" ");
		System.out.println(arrWords[2]);
		System.out.println("The total number of words are : "+arrWords.length);
		// To print items of array using loop
		//Method1
		for(int index=0;index<arrWords.length;index++) {
			System.out.println(arrWords[index]);
		}
		//Method2
		for(String val:arrWords)
		{
			System.out.println(val);
		}
		for(int val:arrNum)
		{
			System.out.println(val);
		}
		}
		
		

	

}
