/* Reverse.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/reverse

Write a method named reverse that accepts a string parameter returns a new 
string with the characters in the opposite order. 
For example, A call of reverse("Pikachu") would return "uchakiP".

 */
import acm.program.*;

public class Reverse extends ConsoleProgram {
    
    public void run() {
    	println(reverse("Pikachu"));
    }
    
    public String reverse(String s) {
    	String reverseStr = "";
    	
    	for(int i = 0; i < s.length(); i++) {
    		reverseStr = s.charAt(i) + reverseStr;
    	}
    	
    	return reverseStr;
    }
}
