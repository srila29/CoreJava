package Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This map rovides no gaurantee to storing order
	/*	HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1,"Chitra");
		map1.put(10, "Surya");
		map1.put(2,"Manoj");
		map1.put(3,"Suraj");
	
		
		System.out.println(map1);
		
		map1.put(2, "George"); //Updating the map with a key value
		System.out.println(map1);
		
		map1.remove(10); //Removing the key from a map
		
		System.out.println(map1);*/
		
		//This map maintains the storing order
		
		LinkedHashMap<Integer,String> map2=new LinkedHashMap<Integer,String>();
		map2.put(1,"Jothy");
		map2.put(10, "Arya");
		map2.put(2,"Manu");
		map2.put(3,"Sundar");
		
		System.out.println(map2);
		
		for(Entry<Integer, String> entry2:map2.entrySet())
		{
			System.out.println(entry2.getKey());
			System.out.println(entry2.getValue());
		
		
		for(Integer val:map2.keySet())
		{
			System.out.println("Keys are "+val);
			System.out.println("Value are "+map2.get(val));
		}
		
		for(String val:map2.values())
		{
			System.out.println("Values are "+val);
		}
		
		
		//This map displays in ascending order
	/*	TreeMap<Integer,String> map3=new TreeMap<Integer,String>();
		map3.put(1,"Ram");
		map3.put(10, "Shatru");
		map3.put(2,"Lakshman");
		map3.put(3,"Nakul");

		System.out.println(map3);
		System.out.println(map3.get(3));*/

	}

}
