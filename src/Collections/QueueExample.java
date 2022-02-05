package Collections;
import java.util.PriorityQueue;
import java.util.ArrayDeque;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prioity Queue does not maintain any order for elements - Random order
	PriorityQueue<String> pq1=new PriorityQueue<String>();
		
		pq1.add("Ezra");
		pq1.add("Nik");
		pq1.add("Prisci");
		pq1.add("Atrise");
		pq1.add("Nik");
		
		 System.out.println(pq1);
		 
		 //To print the first element
		 System.out.println("First element is : "+ pq1.peek());
		 
		 //To remove the first element
		 System.out.println("Removing the first element,which is : "+ pq1.poll());
		 
		 //After removing the first element
		 System.out.println(pq1);
		
		
		//Array Deque adds elements in the way its added -Maintains the order of insertion
		 ArrayDeque<String> aq1=new ArrayDeque<String>();
		 aq1.add("Ezra");
			aq1.add("Nik");
			aq1.add("Prisci");
			aq1.add("Ezra");
			
			 System.out.println(aq1);
			 //Peek functions
			/* System.out.println(aq1.peek());
			 System.out.println(aq1.peekFirst());
			 System.out.println(aq1.peekLast());  */
			 
			 //Pool fns
			System.out.println(aq1.poll());
			System.out.println(aq1.pollFirst());
			 System.out.println(aq1.pollLast());
			 System.out.println(aq1);
	}

}
