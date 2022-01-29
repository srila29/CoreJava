package test;

public class dataTypeExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20;
		int num2=50;
		
		int sum=num1+num2;
		int sub=num2-num1;
		int mul=num1*num2;
		float div=(float)num2/num1;
		//String result="The sum of two numbers is ";
		String name="Clean India Green India";
		System.out.println("Total number of characters in name are "+name.length());
		char char1=name.charAt(0);
		System.out.println("Character at first positin is "+char1);
		System.out.println("String in uppercase is "+name.toUpperCase());
		System.out.println("String in uppercase is "+name.toLowerCase());		
		System.out.println("Sum "+sum);
		System.out.println("Difference "+sub);
		System.out.println("Product "+mul);
		System.out.println("Division result is "+div);
	}

}
