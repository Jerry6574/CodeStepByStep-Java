/* BiggestFamily.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/biggestFamily

Write a method named biggestFamily that reads an input file of people's names and prints 
information about which family has the most people in it. 
Your method accepts a string parameter representing a filename of input.

The input file contains a collection of names, one per line, in the format of the example shown at right. 
Each line of the file contains a first name (given name), a single space, and a last name (surname / family name). 
For example, in the name "Ned Stark", the word "Ned" is the first name and "Stark" is the last name. 
You may assume that every line follows this exact format and that first and last names are single words.

Jon Snow
Ned Stark
Gregor Clegane
Cersei Lannister
Tyrion Lannister
Sandor Clegane
Jaime Lannister
Catelyn Stark
Theon Greyjoy
Arya Stark
Cersei Smith
Ned Jones

Your method should open and read the contents of this input file and figure out which last name(s) occur 
most frequently in the data, and print the members of that family in ABC order in exactly the format shown below.

If multiple families are tied for the most members, print each of the tied families in the same format. For example, in the data at right, the largest families are Stark and Lannister, each of which has 3 members listed, so your method should print the Lannisters in ABC order and then the Starks in ABC order.

For example, if the input above is in families.txt, then the call of biggestFamily("families.txt"); should print:

Lannister family: Cersei Jaime Tyrion
Stark family: Arya Catelyn Ned

It is possible that more than two families might tie for the most members. 
One example of such a case is if every person in the file has a different last name. 
In such a case, you should print all of the tying families in this same format.

Assumptions: You may assume that the file exists, and that it contains at least one name, 
that every line of input in the file is in the exact valid format described above, 
and that no two lines of the file will be exactly the same (though a given first or last name 
might occur multiple times).

Constraints:

You may open and read the file only once. Do not re-open it or rewind the stream.
You should choose an efficient solution. Choose data structures intelligently and use them properly.
You may create up to two collections (stack, queue, set, map, etc.) 
or nested/compound structure as auxiliary storage. 
A nested structure, such as a set of lists, counts as one collection. 
A temporary collection variable that is merely a replica or reference to some other collection 
(such as, Stack v = myQueue.remove();) is fine and does not count as a second structure. 
(You can have as many simple variables as you like, such as ints or strings.)

 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import acm.program.*;
import acm.util.ErrorException;

public class BiggestFamily extends ConsoleProgram {
    
    public void run() {
    	String filename = "families.txt";
    	try {
			biggestFamily(filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public void biggestFamily(String filename) throws FileNotFoundException {
    	TreeMap<String, TreeSet<String>> families = new TreeMap<>();
    	BufferedReader rd = null;
    	
		try{
			FileInputStream stream = new FileInputStream(filename);
			rd = new BufferedReader(new InputStreamReader(stream));
			
		} catch(FileNotFoundException ex){
			println("That file doesn't exist. ");
			throw ex;
		}
		
		try {
			while(true){
				String name = rd.readLine();
				
				if(name == null){
					break;
				}
				String[] fullname = name.split(" ");
				String firstName = fullname[0];
				String lastName = fullname[1];
				
				if(families.containsKey(lastName)) {
					families.get(lastName).add(firstName);
				} else {
					TreeSet<String> firstNames = new TreeSet<>();
					firstNames.add(firstName);
					families.put(lastName, firstNames);
				}
			}
			
			rd.close();
		} catch(IOException ex){
			throw new ErrorException(ex);
		}
		
    	Map.Entry<String, TreeSet<String>> biggestFamily = null;
    	int biggestFamiliySize = 0;

    	for (Map.Entry<String, TreeSet<String>> entry : families.entrySet()){
    	    if (biggestFamily == null || entry.getValue().size() > biggestFamily.getValue().size()){
    	    	biggestFamily = entry;
    	    }
    	}
    	
    	biggestFamiliySize = biggestFamily.getValue().size();
    	
    	for (Map.Entry<String, TreeSet<String>> entry : families.entrySet()){
    		String lastName = entry.getKey();
    		TreeSet<String> firstNames = entry.getValue();
    		
    	    if (firstNames.size() == biggestFamiliySize){
    	    	print(lastName + " family: ");
    	    	
    	    	Iterator<String> iterator = firstNames.iterator();
    	    	while(iterator.hasNext()) {
    	    		print(iterator.next() + " ");
    	    	}
    	    	println();
    	    }
    	}
    }
}
