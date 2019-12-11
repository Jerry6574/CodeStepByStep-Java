/* ToMorseCode.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/toMorseCode

Write a method named toMorseCode that converts strings into their Morse code equivalents. 
Morse code is a mapping from each character from A-Z to a sequence of dots and dashes. 
For example, the string "SOS" could be represented in Morse code as "... --- ...".

Your method accepts two parameters: a TreeMap from char to String, and a String of text to convert. 
Assume that the provided client code builds a map from individual text characters to their 
Morse code equivalents. For example, the key 'A' maps to ".-" . Your method accepts such a map, 
and a string to be converted, and should print out the Morse code equivalent of the given string to the console.

For example, if the letter to Morse code map is stored in a variable called mapping, 
the call of toMorseCode(mapping, "SOS TITANIC"); should print the following console output:

... --- ... - .. - .- -. .. -.-.

Note that the string might contain some characters that are not uppercase A-Z letters (like spaces); 
just skip those characters. You may assume that the mapping passed contains a mapping for every 
letter from A-Z in uppercase. Do not modify the letter map that is passed in.

 */
import java.util.*;

import acm.program.*;

public class ToMorseCode extends ConsoleProgram {
    
    public void run() {

    }
    
    public void toMorseCode(TreeMap<Character, String> codeTreeMap, String text) {
    	for(int i = 0; i < text.length(); i++) {
    		char ch = text.charAt(i);
    		if(Character.isLetter(ch)) {
    			ch = Character.toUpperCase(ch);
    			print(codeTreeMap.get(ch) + " ");
    		}
    		
    	}
    }
}
