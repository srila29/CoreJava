package Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Random order - Data is stored without any order
		HashSet<String> set1=new HashSet<String>();
		
		set1.add("Seetha");
		set1.add("Ram");
		set1.add("Rani");
		set1.add("Meera");
							
		System.out.println(set1);
		
		//Data is stored in the same order entered		
		LinkedHashSet<String> set2=new LinkedHashSet<String>();
		set2.add("Seetha");
		set2.add("Ram");
		set2.add("Rani");
		set2.add("Meera");
		
		System.out.println(set2);
		
		//Data is stored in ascending order
		TreeSet<String> set3=new TreeSet<String>();
		set3.add("Seetha");
		set3.add("Ram");
		set3.add("Rani");
		set3.add("Meera");
		System.out.println(set3);
		
		String str1="Clean world Green world";
		String result="";
		LinkedHashSet<String> set4=new LinkedHashSet<String>();
		String[] arrStr1=str1.split(" ");
		for (int index=0;index<arrStr1.length;index++)
		{
			set4.add(arrStr1[index]);
		}
			
		Iterator<String> itr=set4.iterator();
		while(itr.hasNext())
		{
			result+=itr.next()+" ";
			
		}
		System.out.println(result);
	}
		
		

		
		
		
	

	
}
