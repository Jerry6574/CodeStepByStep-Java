/* CheckBalance.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/stackqueue/checkBalance

Write a method named checkBalance that accepts a string of source code and uses a Stack to 
check whether the braces/parentheses are balanced. Every ( or { must be closed by a } or ) 
in the opposite order. Return the index at which an imbalance occurs, or -1 if the string is balanced. 
If any ( or { are never closed, return the string's length.

Here are some example calls:

//    index   0123456789012345678901234567890
checkBalance("if (a(4) > 9) { foo(a(2)); }")      // returns -1 because balanced
checkBalance("for (i=0;i&lt;a(3};i++) { foo{); )")   // returns 14 because } out of order
checkBalance("while (true) foo(); }{ ()")         // returns 20 because } doesn't match any {
checkBalance("if (x) {")                          // returns 8 because { is never closed
Constraints: Use a single stack as auxiliary storage.

 */

import java.util.Stack;

import acm.program.*;

public class CheckBalance extends ConsoleProgram {
    
    public void run() {
    	String code = "if (a(4) > 9) { foo(a(2)); }";
    	println(checkBalance(code));
    }
    
    public int checkBalance(String code) {
    	Stack<Character> stack = new Stack<>();
    	
    	for(int i = 0; i < code.length(); i++) {
    		char c = code.charAt(i);
    		
    		if(c == '(' || c == '{') {
    			stack.add(c);
    		}
    		
    		// no matching '(' for ')' or '{' for '}'
    		if((c == ')' || c == '}') && stack.size() == 0) {
    			return i;
    		
    		// mismatching '(' for '}' or '{' for ')'
    		} else if((c == ')' && stack.peek() != '(') || (c == '}' && stack.peek() != '{')) {
    			return i;
    		} else if((c == ')' && stack.peek() == '(') || (c == '}' && stack.peek() == '{')) {
    			stack.pop();
    		}
    	}
    	
    	if(stack.size() == 0) {
    		return -1;
    	} else {
    		return code.length();
    	}
    }
}
