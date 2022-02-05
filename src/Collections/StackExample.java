package Collections;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Stack<Integer> stack1=new Stack<Integer>();
 stack1.push(4);
 stack1.push(8);
 stack1.push(12);
 
 System.out.println(stack1);
 
 stack1.pop();
 System.out.println(stack1);
 
 stack1.push(5);
 //Display the last value that got added.. in this case 5 is added at the end
 System.out.println(stack1.peek());

 
	}

}
