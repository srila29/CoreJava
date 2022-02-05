package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("RAJ");
		arrayList.add("RAM");
		arrayList.add("Reena");
		arrayList.add("Priya");
		
		System.out.println("Size of arrayLIST is "+arrayList.size());
		System.out.println(arrayList);
		
		
	System.out.println("Item at 0 the position is "+arrayList.get(0));
		System.out.println(arrayList.remove(0));
		
		System.out.println("Size of arrayLIST is "+arrayList.size());
		System.out.println(arrayList);
		
		arrayList.set(2, "Pavani");
		
		System.out.println(arrayList);
		//for loop to print elements of array
		for(int index=0	;index<arrayList.size();index++)
		{
			System.out.println(arrayList.get(index));
		}
		
		//foreach to print the elements of array
		for(String name:arrayList)
		{
			System.out.println(name);
		}
		//Iterator
		Iterator<String> itr=arrayList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//Reverse the array		
		for(int index=arrayList.size()-1;index>=0;index--)
		{
			System.out.println(arrayList.get(index));
		}
		
		//To sort the array in ascending order
		Collections.sort(arrayList);
		System.out.println(arrayList);
		//Sorted list in descending
		for(int index=arrayList.size()-1;index>=0;index--)
		{
			System.out.println(arrayList.get(index));
		}
		
		

	}

}
