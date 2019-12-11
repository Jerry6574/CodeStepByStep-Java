/* Stutter.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/stutter

Write a method named stutter that accepts a string parameter returns a new string 
replacing each of its characters with two consecutive copies of that character. 

For example, a call of stutter("hello") would return "hheelllloo".

 */


import acm.program.*;

public class Stutter extends ConsoleProgram {
    
    public void run() {
    	println(stutter("hello"));
    }
    
    public String stutter(String s) {
    	String stutterStr = "";
    	
    	for(int i = 0; i < s.length(); i++) {
    		stutterStr = stutterStr + s.charAt(i) + s.charAt(i);
    	}
    	return stutterStr;
    }
}
