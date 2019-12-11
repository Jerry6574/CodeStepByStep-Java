/* PrintBackward.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/printBackward

Write a method named printBackward that accepts a String as its parameter 
and prints the characters in the opposite order. 

For example, a call of printBackward("hello there!"); should print the following output:
!ereht olleh

If the empty string is passed, no output should be produced

 */


import acm.program.*;

public class PrintBackward extends ConsoleProgram {
    
    public void run() {
    	printBackward("DCBA");
    }
    
    public void printBackward(String str) {
        if(str.length() > 0){
            for(int i = str.length() - 1; i >= 0; i--){
                print(str.charAt(i));
            }
        }
    }
}
