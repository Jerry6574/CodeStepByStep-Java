/* PairFrequencies.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/pairFrequencies

Write a method named pairFrequencies that prints particular data about two-letter 
pairs in a collection of words. In the English language, some combinations of adjacent 
letters are more common than others. For example, 'h' often follows 't' ("th"), 
but rarely would you see 'x' following 't' ("tx"). Knowing how often a given letter 
follows other letters in the English language is useful in many contexts. 
In cryptography, we use this data to crack substitution ciphers (codes where each letter has 
been replaced by a different letter, for example: A-M, B-T, etc.) by identifying which possible 
decoding substitutions produce plausible letter combinations and which produce nonsense.

For this problem, you will write a method named pairFrequencies that accepts a Set representing a 
dictionary of words. Your method will examine the dictionary and print all 2-character sequences 
of letters along with a count of how many times each pairing occurs. For example, suppose a 
Set variable named dict contains the following words:

{"banana", "bends", "i", "mend", "sandy"}
This dictionary contains the following two-character pairs: "ba", "an", "na", "an", "na" 
from banana; "be", "en", "nd", "ds" from bends; "me", "en", "nd" from mend; and "sa", "an", 
"nd", "dy" from sandy. (Note that "i" is only one character long, so it contains no pairs.) 
So the call of pairFrequencies(dict); would print the following output:

an: 3
ba: 1
be: 1
ds: 1
dy: 1
en: 2
me: 1
na: 2
nd: 3
sa: 1
Notice that pairings that occur more than once in the same word should be counted as separate occurrences. 
For example, "an" and "na" each occur twice in "banana".

Constraints: Obey the following restrictions in your solution.

	You may create one additional data structure (stack, queue, set, map, etc.) as auxiliary storage. 
	A nested structure, such as a set of lists, counts as one additional data structure. 
	(You can have as many simple variables as you like.)
	
	You should not modify the contents of the set passed to your method.
	Declare your method in such a way that any caller can be sure that this will not happen.
	
	You should loop over the contents of the set no more than once.
	
	Your solution should run in no worse than O(N2) time, where N is the number of pairs in the map.

 */
import java.util.*;

import acm.program.*;

public class PairFrequencies extends ConsoleProgram {
    
    public void run() {
    	Set<String> dictionary = new HashSet<>(Arrays.asList("banana", "bends", "i", "mend", "sandy"));
    	pairFrequencies(dictionary);
    }
    
    public void pairFrequencies(Set<String> dictionary) {
    	if(dictionary.size() == 0) {
    		return;
    	}
    	
    	TreeMap<String, Integer> pairFreqMap = new TreeMap<>();
    	
    	Iterator<String> iterator= dictionary.iterator();
    	while(iterator.hasNext()) {
    		String word = iterator.next(); 
    		
    		if(word.length() > 1) {
        		for(int i = 0; i < word.length()-1; i++) {
        			String pair = word.substring(i, i+2);
        			
        			if(pairFreqMap.containsKey(pair)) {
        				int count = pairFreqMap.get(pair);
        				pairFreqMap.put(pair, count + 1);
        			} else {
        				pairFreqMap.put(pair, 1);
        			}
        		}
    		}
    		
    	}
    	
    	for(Map.Entry<String, Integer> pairEntry: pairFreqMap.entrySet()) {
    		println(pairEntry.getKey() + ": " + pairEntry.getValue());
    	}
    }
}
