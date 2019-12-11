/* Starters.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/starters

Write a method named starters that accepts two parameters: a list of strings, and an integer k. 
Your method should examine the strings in the list passed and return a set of all first characters 
that occur at least k times. In other words, if k or more strings in the list start with a 
particular character at index 0 of the string (case-insensitively), that character should be 
part of the set that you return. All elements of your set should be in lowercase. 

For example, consider a list variable called v containing the following elements:
{"hi", "how", "are", "He", "", "Marty!", "this", "morning?", "fine.", "?foo!", "", "HOW", "A"}

Two words in the list start with "a", one starts with "f", four start with "h", 
two start with "m", one starts with "t", and one starts with "?". 
Therefore the call of starters(v, 2) should return a set containing:
{'a', 'h', 'm'}

The call of starters(v, 3) on the same list should return a set containing:

{'h'}

If no start character occurs k or more times, return an empty set. 
The characters should appear in your set in alphabetical order. 
Note that some of the elements of the list might be empty strings; 
empty strings have no first character, so your code should not consider them when counting. 
(But your code shouldn't crash on an empty string.)

Constraints: Obey the following restrictions in your solution.

	You will need to construct your set to be returned, and in addition to that, 
	you may create one additional data structure (stack, queue, set, map, etc.) 
	as auxiliary storage. (You can have as many simple variables as you like.)
	
	You should not modify the contents of the list passed to your method.
	Declare your method in such a way that any caller can be sure that this will not happen.
	
	Your solution should run in no worse than O(N log N) time, where N is the number of pairs in the map.

 */
import java.util.*;

import acm.program.*;

public class Starters extends ConsoleProgram {
    
    public void run() {
    	ArrayList<String> v = new ArrayList<>(Arrays.asList("four", "score", "and", "seven", "very", "long", "years", "ago"));
    	int k = 1;
    	println(starters(v, k));
    }
    
    public TreeSet<Character> starters(ArrayList<String> v, int k) {
    	TreeMap<Character, Integer> charFreq = new TreeMap<>();
    	TreeSet<Character> charSet = new TreeSet<>();
    	
    	for(String word: v) {
    		
    		if(word.length() > 0) {
	    		char firstLetter = Character.toLowerCase(word.charAt(0));
	    		
	    		if(charFreq.containsKey(firstLetter)) {
	    			int count = charFreq.get(firstLetter);
	    			charFreq.put(firstLetter, count + 1);
	    		} else {
	    			charFreq.put(firstLetter, 1);
	    		}
    		}
    	}
    	
    	for(Map.Entry<Character, Integer> charEntry: charFreq.entrySet()) {
    		int count = charEntry.getValue();
    		if(count >= k) {
    			charSet.add(charEntry.getKey());
    		}
    	}
    	
    	return charSet;
    }
}
