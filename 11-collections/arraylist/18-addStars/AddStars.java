/* AddStars.java
 * 
Solution to: https://www.codestepbystep.com/problem/view/java/collections/arraylist/addStars

Write a method named addStars that accepts as a parameter an ArrayList of strings, 
and modifies the list by placing a "*" element between elements, 
as well as at the start and end of the list. 

For example, if a list named list contains {"the", "quick", "brown", "fox"}, 
the call of addStars(list); should modify it to store {"*", "the", "*", "quick", "*", "brown", "*", "fox", "*"}.

 */

import java.util.ArrayList;
import java.util.Arrays;

import acm.program.*;

public class AddStars extends ConsoleProgram {
    
    public void run() {
    	ArrayList<String> list = new ArrayList<String>(Arrays.asList("the", "quick", "brown", "fox"));
    	addStars(list);
    	println(list.toString());
    }
    
    public void addStars(ArrayList<String> list) {
    	list.add(0, "*");
    	for(int i = 1; i < list.size(); i += 2) {
    		list.add(i+1, "*");
    	}
    }
    
}
