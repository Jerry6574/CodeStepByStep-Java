/* Repeat.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/repeat

Write a method named repeat that accepts a String and a number of repetitions as 
parameters and returns the String concatenated that many times. 

For example, the call of repeat("hello", 3) returns "hellohellohello". 
If the number of repetitions is 0 or less, return an empty string.

 */


import acm.program.*;

public class Repeat extends ConsoleProgram {
    
    public void run() {
    	println(repeat("abc", 3));
    }
    
    public String repeat(String s, int n) {
    	if(n < 1){
          return "";
        } else {
          String str = "";
          for(int i = 0; i < n; i++){
            str += s;
          }
          return str;
        }
    }
}
