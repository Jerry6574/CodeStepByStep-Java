/* LastNamesByAge.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/lastNamesByAge

Write a method named lastNamesByAge that accepts three parameters: 1) a TreeMap where each key 
is a person's full name (a string) and the associated value is that person's age (an integer); 2) 
an integer for a minimum age; and 3) an integer for a max age. Your method should return a new 
map with information about people with ages between the min and max, inclusive.

In your result map, each key is an integer age, and the value for that key is a string with the 
last names of all people at that age, separated by "and" if there is more than one person of that age. 
The order of names for a given age should be in the order they occurred in the parameter map. 

Include only ages between the min and max inclusive, where there is at least one person of that 
age in the parameter map. If the map passed is empty, or if there are no people in the map 
between the min/max ages, return an empty map.

Some names are in the format "first last" such as "Marty Stepp". But a name could have more tokens, 
such as "Oscar de la Hoya", or could contain just a single token, such as "Cher". For example, 
if a map named ages stores the following key/value pairs:

{Allison L. Smith=18, Benson Kai Lim=48, David L Shaw=20, Erik Thomas Jones=20,
 Galen Wood=15, Madonna=25, Helene Q. Martin=40, Janette Siu=18,
 Jessica K. Miller=35, Marty Douglas Stepp=35, Paul Beame=28, Sara de la Pizza=15,
 Stuart T. Reges=98, Tyler Rigs=6, Prince=20}
The call of lastNamesByAge(ages, 16, 25) should return the following map:

{18=Smith and Siu, 20=Shaw and Jones and Prince, 25=Madonna}
For the same map, the call of lastNamesByAge(ages, 20, 40) should return the following map:

{20=Shaw and Jones and Prince, 25=Young, 28=Beame, 35=Miller and Stepp, 40=Martin}

Constraints: Obey the following restrictions in your solution.
	You will need to construct a map to store your results, but you may not use any other structures 
	(arrays, lists, etc.) as auxiliary storage. (You can have as many simple variables as you like.)
	
	You should not modify the contents of the map passed to your method.
	Declare your method in such a way that any caller can be sure that this will not happen.
	
	Your solution should run in no worse than O(N log N) time, where N is the number of pairs in the map.

 */
import java.util.Map;
import java.util.TreeMap;

import acm.program.*;

public class LastNamesByAge extends ConsoleProgram {
    
    public void run() {
    	TreeMap<String, Integer> ages = new TreeMap<>();
    	ages.put("Allison Bren", 18);
    	ages.put("Jerry Springer", 26);
    	ages.put("Rex Smith", 26);
    	ages.put("David Gao", 41);
    	
    	int min = 16;
    	int max = 27;
    	
    	println(lastNamesByAge(ages, min, max));
    }
    
    public TreeMap<Integer, String> lastNamesByAge(TreeMap<String, Integer> ages, int min, int max) {
    	TreeMap<Integer, String> ageDistribution = new TreeMap<>();
    	
    	if(ages.size() == 0) {
    		return ageDistribution;
    	}
    	
    	for(Map.Entry<String, Integer> ageEntry: ages.entrySet()) {
    		String[] fullName = ageEntry.getKey().split(" ");
    		String lastName = fullName[fullName.length-1];
    		
    		int age = ageEntry.getValue();
    		
    		if(age >= min && age <= max) {
    			if(ageDistribution.containsKey(age)) {
    				String people = ageDistribution.get(age);
    				ageDistribution.put(age, people + " and " + lastName);
    			} else {
    				ageDistribution.put(age, lastName);
    			}
    		}
    	}
    	
    	return ageDistribution;
    }
}
