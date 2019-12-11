/* NameDiamond.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/nameDiamond

Write a method named nameDiamond that accepts a string as a parameter and 
prints it in a "diamond" format as shown below. 
For example, the call of nameDiamond("MARTY"); should print:

M
MA
MAR
MART
MARTY
 ARTY
  RTY
   TY
    Y
 */

import acm.program.*;

public class NameDiamond extends ConsoleProgram {
    
    public void run() {
    	nameDiamond("MARTY");
    }
    
    public void nameDiamond(String s) {
    	for(int i = 1; i < s.length() + 1; i++) {
    		println(s.substring(0, i));
    	}
    	for(int i = 1; i < s.length() + 1; i++) {
    		String subStr = s.substring(i, s.length());
    		
    		// print padding spaces
    		for(int j = 0; j < s.length() - subStr.length(); j++) {
    			print(" ");
    		}
    		println(subStr);
    	}
    }
}
