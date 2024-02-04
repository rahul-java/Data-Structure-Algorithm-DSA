package Questions.OpenAndClosedBracketProblem;

import java.util.Scanner;
import java.util.Stack;

public class OpenAndClosedBracketProblem {
/*
 []
true

[({})]
true

{[{(})}]
false

*/	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Please Enter the Bracket Expression [{()}]:");
		
		while(sc.hasNext())
		{
			String s=sc.next();
			System.out.println(isBalanced(s));
		}
	}

	private static boolean isBalanced(String s) {
		
		Stack<Character> stack=new Stack<>();
		
		for(char ch:s.toCharArray())
		{
			if(ch=='(' || ch=='{' || ch=='[')
			{
				stack.push(ch);
			}
			else if (stack.isEmpty() || (ch==')' && stack.pop()!='(')
					                 || (ch=='}' && stack.pop()!='{')
					                 || (ch==']' && stack.pop()!='[')) {
				return false;
			}
		}
		return stack.isEmpty();
	}
}
