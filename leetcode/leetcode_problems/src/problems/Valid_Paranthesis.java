package problems;

import java.util.Stack;

//Valid Parentheses

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.

//Example 1:
//
//Input: s = "()"
//Output: true
//Example 2:
//
//Input: s = "()[]{}"
//Output: true
//Example 3:
//
//Input: s = "(]"
//Output: false

public class Valid_Paranthesis {

	public static void main(String[] args) {
		System.out.println(isValid("[](){{}"));
	}

	private static boolean isValid(String str) {
		
        if ((str.length() % 2) != 0) {
            return false;
        }
		Stack<Character> stack = new Stack();
		for(char c:str.toCharArray()) {
			if(c == '(') {
				stack.push(')');
			}else if(c=='['){
				stack.push(']');
			}else if(c=='{') {
				stack.push('}');
			}else if(stack.isEmpty() || stack.pop()!=c){
				return false;
			}
			
		}
		
		return stack.isEmpty();
	}
}
