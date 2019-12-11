/* SameDashes.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/sameDashes

Write a method named sameDashes that accepts two strings as parameters and that 
returns a boolean value indicating whether or not they have dashes in the 
same places (returning true if they do and false if not). 

For example, below are four pairs of strings of equal length that have the same pattern of dashes. 
Notice that the last pair has no dashes at all.

string 1:    "hi--there-you."        "-15-389"        "criminal-plan"        "abc"
string 2:    "12--(134)-7539"        "-xy-zzy"        "(206)555-1384"        "9.8"

So a call of sameDashes("hi--there-you.", "12--(134)-7539") should return true. 
By contrast, the call of sameDashes("hi--there-you", "hey-there-yo-") 
should return false because the first string has an unmatched dash at index 2 
and the second string has an unmatched dash at index 12.

To be considered a match, the strings must have exactly the same number of dashes in exactly the same positions. 
Note that the strings might be of different length, 
but different-length strings might still return true if it turns out that all 
of their dashes are in the range of indexes that is within the bounds of the shorter string. 

For example, the following calls should each return true, 
because the strings each have two dashes and they are in the same positions.

sameDashes("1st-has-more characters", "2nd-has-less")
sameDashes("1st-has-less", "2nd-has-more chars")
But the following should return false because the longer string has a third dash where the shorter does not:

sameDashes("1st-has-more-chars", "2nd-has-less")
sameDashes("1st-has-less", "2nd-has-more-characters")
Constraints: You should not use any data structures such as arrays to help you solve this problem. 
But you can declare as many simple variables like int, char, etc. as you like. 
Declaring auxiliary String variables is also fine.

 */
import acm.program.*;

public class SameDashes extends ConsoleProgram {
    
    public void run() {
    	println(sameDashes("1st-has-more characters", "2nd-has-less"));
    }
    
    public boolean sameDashes(String str1, String str2) {
    	String longStr;
    	String shortStr;
    	int i = 0;
    	boolean lengthEqual = false;
    	
    	int nMatchedDashes = 0;
    	
    	// determine which string is shorter or longer
    	if(str1.length() > str2.length()) {
    		longStr = str1;
    		shortStr = str2;
    	} else if(str1.length() < str2.length()){
    		longStr = str2;
    		shortStr = str1;
    	} else {
    		longStr = str1;
    		shortStr = str2;
    		lengthEqual = true;
    	}
    	
    	
    	for(i = 0; i < shortStr.length(); i++) {
    		char shortChar = shortStr.charAt(i);
    		char longChar = longStr.charAt(i);
    		
    		// matched dashes at index i
    		if(shortChar == longChar && shortChar == '-') {
    			nMatchedDashes++;
    			
    		// strings have unmatched dashes
    		} else if((shortChar == '-' && longChar != '-') || (shortChar != '-' && longChar == '-')) {
    			return false;
    		}
    	}
    	
    	if((nMatchedDashes >= 1 && lengthEqual) || (nMatchedDashes == 0)) {
    		return true;
    		
    	// iterate the remaining portion of the long string to find unmatched dashes
    	} else {
			for(int j = i; j < longStr.length(); j++) {
				if(longStr.charAt(j) == '-') {
					return false;
				}
			}
    	}

		return true;
    }
    
}
