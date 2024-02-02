package Stack.StackImpl;

import java.util.Stack;

public class StackImpl {

	//LIFO=>Last In First Out
	//FILO=>First In Last Out
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.add(10);
		stack.add(20);
		stack.add(30);
		stack.add(40);
		stack.add(50);
		stack.add(60);
		System.out.println(stack.add(70));  //true add(): it returns true/false
		System.out.println(stack.push(80)); //80 push(): it returns value
		
		System.out.println(stack);  //[10, 20, 30, 40, 50, 60, 70, 80]
		System.out.println("==================pup()=>it retrieve the last value and remove from the stack==============");
		
		System.out.println(stack.size());  //8
		System.out.println(stack.pop());   //80
		System.out.println(stack.size());  //7
		System.out.println(stack.pop());  //70
		System.out.println(stack.size());  //6
		System.out.println(stack.pop());  //60
		System.out.println(stack.size());  //5
		System.out.println(stack);  //[10, 20, 30, 40, 50]
		System.out.println("==================peek()=> it retrieve the last value without removing it==============");
		
		System.out.println(stack.peek());  //50
		System.out.println(stack.size());  //5
		System.out.println(stack.peek());  //50
		System.out.println(stack.size());  //5
		System.out.println(stack);  //[10, 20, 30, 40, 50]
		
		
	}
}
