package test;

public class ReversalExamples {

	public static void main(String[] args) {
		
		
		//Reversal of string
		String str="Clean India Green India";
		String strRev="";
		
		for(int index=str.length()-1;index>=0;index--)
		{
			strRev=strRev+str.charAt(index);
		}
				
		
System.out.println("The string in reverse is '"+strRev+"'");

//Check for vowels in a string
int result=0;
for(int index=0;index<=str.length()-1;index++)
{
	if(str.charAt(index)=='a'||str.charAt(index)=='e'||str.charAt(index)=='i'||str.charAt(index)=='o'||str.charAt(index)=='u'||str.charAt(index)=='A'||str.charAt(index)=='E'||str.charAt(index)=='I'||str.charAt(index)=='O'||str.charAt(index)=='U')
{
	result=result+1;
		}
}
System.out.println("Number of vowels in the string is "+result);

	//Reversal of array
     int[] arrNum= {35,45,56};
     
     
     for(int index=arrNum.length-1;index>=0;index--)
     {
    	   System.out.println(arrNum[index]);  	
    	      }
     
     //Reversal of number
     int num1=345647;
     int numRev=0;
     System.out.println("The number to be reversed is "+num1);
     System.out.print("The reversed number is "+numRev);
     while(num1%10!=0)
     {
     numRev=num1%10;
     num1= num1/10;
     System.out.print(numRev);
     }
     
     
  
		
	}

}
