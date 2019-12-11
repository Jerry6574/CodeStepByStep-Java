/* CountNames.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/CountNames

Write a console program named CountNames that asks the user for a list of names (one per line) 
until the user enters a blank line (i.e., just presses Enter when asked for a name). 
At that point the program should print out how many times each name in the list was entered. 
A sample run of this program is shown below.

Enter name: Alice
Enter name: Bob
Enter name: Alice
Enter name: Chelsea
Enter name: Bob
Enter name: Alice
Enter name:
Entry [Alice] has count 3
Entry [Bob] has count 2
Entry [Chelsea] has count 1

 */

import java.util.*;

import acm.program.*;

public class CountNames extends ConsoleProgram {
    Map<String, Integer> names = new HashMap<>();
    
    public void run() {
        while (true) {
        	String name = readLine("Enter name: ");
        	
            if(name.equals("")) {
            	break;
            }

            if(names.containsKey(name)) {
            	names.put(name, names.get(name) + 1);
            } else {
            	names.put(name, 1);
            } 
        }
        
    	for(String tempName: names.keySet()) {
    		println("Entry [" + tempName + "] has count " + names.get(tempName));
    	}
    }
    
}
