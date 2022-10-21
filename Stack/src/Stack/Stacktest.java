package Stack;

import java.util.ArrayList;

public class Stacktest{
public static void main(String [] arg) {
	
	MyStack stack = new MyStack();


	stack.push("A");
	stack.push("B");
	stack.push("C");

	
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());

}
}



