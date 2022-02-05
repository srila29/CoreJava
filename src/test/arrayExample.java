package test;

public class arrayExample {

public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num1= {20,30,40,60};
System.out.println("The total number of values in num1 are "+num1.length);
System.out.println(num1[2]);
System.out.println(num1[num1.length-1]);
String[] str1= {"abc","def","fgh"};
System.out.println(str1[str1.length-1]);
String quote= "Clean India Green India";
String[] arrWords=quote.split(" ");
System.out.println(arrWords[2]);
System.out.println("The total number of words are : "+arrWords.length);


	}

}
