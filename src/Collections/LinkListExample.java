package Collections;
import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> list1=new LinkedList<String>();
list1.add("John");
list1.add("Sam");
list1.add("Jony");
list1.add("Mary");

System.out.println(list1);

//Linked list can add items at first or last

list1.addFirst("Renauld");
list1.addLast("Rosy");
System.out.println(list1);

for(int i=0;i<list1.size();i++)
{
	System.out.println(list1.get(i));
}
	}

}
