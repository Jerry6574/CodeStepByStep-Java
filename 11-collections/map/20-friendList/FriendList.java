/* FriendList.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/friendList

Write a method named friendList that accepts a file name as a parameter and reads 
friend relationships from a file and stores them into a compound collection that is returned. 

You should create a map where each key is a person's name from the file, 
and the value associated with that key is a setof all friends of that person. 
Friendships are bi-directional: if Marty is friends with Danielle, Danielle is friends with Marty.

The file contains one friend relationship per line, consisting of two names. 
The names are separated by a single space. You may assume that the file exists and is in a valid proper format. 
If a file named buddies.txt looks like this:

Marty Cynthia
Danielle Marty
Then the call of friendList("buddies.txt") should return a map with the following contents:

{Cynthia=[Marty], Danielle=[Marty], Marty:[Cynthia, Danielle]}
Constraints:

You may open and read the file only once. Do not re-open it or rewind the stream.
You should choose an efficient solution. Choose data structures intelligently and use them properly.
You may create one collection (stack, queue, set, map, etc.) or nested/compound structure as auxiliary storage. 
A nested structure, such as a set of lists, counts as one collection. 
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

public class FriendList extends ConsoleProgram {
    
    public void run() {
    	String filename = "buddies.txt";
    	
    	try {
			println(friendList(filename).toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    public TreeMap<String, TreeSet<String>> friendList(String filename) throws FileNotFoundException {
    	TreeMap<String, TreeSet<String>> friendship = new TreeMap<>();
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
				String names = rd.readLine();
				
				if(names == null){
					break;
				}
				
				String name1 = names.split(" ")[0];
				String name2 = names.split(" ")[1];
				
				if(friendship.containsKey(name1)) {
					friendship.get(name1).add(name2);
				} else {
					TreeSet<String> friends = new TreeSet<>();
					friends.add(name2);
					friendship.put(name1, friends);
				}
				
				if(friendship.containsKey(name2)) {
					friendship.get(name2).add(name1);
				} else {
					TreeSet<String> friends = new TreeSet<>();
					friends.add(name1);
					friendship.put(name2, friends);
				}
			}
			
			rd.close();
		} catch(IOException ex){
			throw new ErrorException(ex);
		}
		
		return friendship;
    }
}
