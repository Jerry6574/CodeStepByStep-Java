/* GetMajorityLastName.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/getMajorityLastName

Write a method named getMajorityLastName that accepts as its parameter a hash map from strings to strings; 
the keys of the map represent first names and the values represent last names. 
If there is a single common last name that is present in more than half of the 
key/value pairs in the map passed in (a "majority" last name), your method should return that last name. 
If there is no majority last name, your method should return the string "?" .

For example, if the map contains the following key/value pairs, the majority last name is "Smith" 
because it occurs 5 times, which is more than half of the nine pairs in the map. 
Therefore your method would return "Smith".

{Hal=Perkins, Mark=Smith, Mike=Smith, Stuart=Reges, David=Smith, Jean=Reges, Geneva=Smith, Amie=Smith, Bruce=Reges}
The following maps don't have any majority last name because no last name occurs strictly greater than half the time. Therefore when passed either of the maps below, your method would return "?" .

{Marty=Stepp, Mehran=Sahami, Keith=Schwarz, Cynthia=Lee, Yogurt=Schwarz}
{Tywin=Lannister, Rob=Stark, Sansa=Stark, Tyrion=Lannister}

If the map that contains only one key/value pair, that pair's value is the majority last name. 
An empty map does not have any majority last name.

Constraints: You may declare at most one auxiliary data structure to help you solve this problem. 
Do not modify the map that is passed in to your method as a parameter.

 */
import java.util.*;

import acm.program.*;

public class GetMajorityLastName extends ConsoleProgram {
    
    public void run() {
    	HashMap<String, String> names = new HashMap<>();
    	names.put("Hal", "Perkins");
    	names.put("Mark", "Smith");
    	names.put("Mike", "Smith");
    	names.put("Stuart", "Reges");
    	names.put("David", "Smith");
    	names.put("Jean", "Reges");
    	names.put("Geneva", "Smith");
    	names.put("Amie", "Smith");
    	names.put("Bruce", "Reges");
    	
    	println(getMajorityLastName(names));
    }
    
    public String getMajorityLastName(HashMap<String, String> names) {
    	if(names.size() == 0) return "?";
    	
    	double totalNames = 0.0;
    	HashMap<String, Integer> lastNameFreq = new HashMap<>();
    	
    	for(String lastName: names.values()) {
    		
    		if(lastNameFreq.containsKey(lastName)) {
    			int count = lastNameFreq.get(lastName);
    			lastNameFreq.put(lastName, count + 1);
    		} else {
    			lastNameFreq.put(lastName, 1);
    		}
    		
    		totalNames++;
    	}
    	
    	Map.Entry<String, Integer> maxEntry = null;

    	for (Map.Entry<String, Integer> entry : lastNameFreq.entrySet())
    	{
    	    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
    	    {
    	        maxEntry = entry;
    	    }
    	}
    	
    	if(maxEntry.getValue() / totalNames > 0.5) {
    		return maxEntry.getKey();
    	} else {
    		return "?";
    	}
    }
}
