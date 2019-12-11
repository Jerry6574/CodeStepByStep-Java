/* RemoveAll.java
 
Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/removeAll

Write a method named removeAll that accepts as a parameter an ArrayList of strings along with an element value string, 
and modifies the list to remove all occurrences of that string. 

For example, if the list v contains {"a", "b", "c", "b", "b", "a", "b"}, 
the call of removeAll(v, "b"); should modify it to store {"a", "c", "a"}.

 */
import java.util.ArrayList;
import java.util.Arrays;

import acm.program.*;

public class RemoveAll extends ConsoleProgram {
    
    public void run() {
    	ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "b", "b", "a", "b"));
    	String value = "b";
    	removeAll(list, value);
    	println(list.toString());
    }
    
    public void removeAll(ArrayList<String> list, String value) {
    	for(int i = 0; i < list.size(); i++) {
    		if(list.get(i) == value) {
    			list.remove(i);
    			i--;
    		}
    	}
    }
}
