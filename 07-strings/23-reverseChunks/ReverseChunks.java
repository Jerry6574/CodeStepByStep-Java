/* ReverseChunks.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/reverseChunks

Write a method named reverseChunks that accepts a string s and integer k as parameters and 
returns a new string that reverses the relative order of every k characters of s. 
For example, the call of reverseChunks("MehranSahami", 3) should view the string in 
groups of 3 characters at a time, reversing "Meh" into "heM", and "ran" into "nar", 
and so on, returning a result of "heMnarhaSima".

If the string's length is not an exact multiple of k, the last chunk of fewer-than-k characters 
at the end of the string should be left in its original order. 
For example, if the call is reverseChunks("MartyStepp", 4), the first chunk "Mart" becomes 
"traM" and the second chunk "ySte" becomes "etSy". The last two characters, "pp", 
are fewer than 4, so they are left as-is. So the result returned should be "traMetSypp".

You may assume that the value passed for k will be a positive integer.

Constraints: You should not create any data structures such as arrays. 
But you may create as many strings as you like, and you may use as many simple 
variables (such as ints) as you like.

 */
import acm.program.*;

public class ReverseChunks extends ConsoleProgram {
    
    public void run() {
    	println(reverseChunks("abcdabcdff", 4));
    }
    
    public String reverseChunks(String s, int n) {
    	int nChunks = s.length() / n;
    	if(nChunks == 0) {
    		return s;
    	}
    	
    	String reversedChunkStr = "";
    	
    	int i = 1;
    	for(i = 1; i <= nChunks; i++) {
    		String chunk = s.substring(n * (i - 1), n * i);
    		
    		// reverse of a chunk
    		String reversedChunk = "";
    		for(int j = 0; j < chunk.length(); j++) {
    			reversedChunk = chunk.charAt(j) + reversedChunk;
    		}
    		
    		reversedChunkStr += reversedChunk;
    	}
    	
    	// concat the unchunked portion of s
    	reversedChunkStr += s.substring(n * (i - 1), s.length());
    	
    	return reversedChunkStr;
    }
}
