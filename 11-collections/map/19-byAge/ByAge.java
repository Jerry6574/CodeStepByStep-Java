/* ByAge.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/byAge

Write a method named byAge that accepts three parameters: 1) a map where each key is a 
person's name (a string) and the associated value is that person's age (an integer); 2) 
an integer for a minimum age; and 3) an integer for a max age. 
Your method should return a new map with information about people with ages between the min and max, inclusive.

In your result map, each key is an integer age, and the value for that key is a string 
with the names of all people at that age, separated by "and" if there is more than one 
person of that age. The order of names for a given age should be in alphabetical order, 
such as "Bob and Carl" rather than "Carl and Bob". (This is the order in which they naturally 
occur in the parameter map.) Include only ages between the min and max inclusive, 
where there is at least one person of that age in the parameter map. If the map passed is empty, 
or if there are no people in the map between the min/max ages, return an empty map.

For example, if a map named ages stores the following key:value pairs:

{Allison=18, Benson=48, David=20, Erik=20, Galen=15, Grace=25,
 Helene=40, Janette=18, Jessica=35, Marty=35, Paul=28, Sara=15,
 Stuart=98, Tyler=6, Zack=20}
The call of byAge(ages, 16, 25) should return the following map:

{18=Allison and Janette, 20=David and Erik and Zack, 25=Grace}
For the same map, the call of byAge(ages, 20, 40) should return the following map:

{20=David and Erik and Zack, 25=Grace, 28=Paul, 35=Jessica and Marty, 40=Helene}

Constraints: Obey the following restrictions in your solution.
	You will need to construct a map to store your results, but you may not use 
	any other structures (arrays, lists, etc.) as auxiliary storage. 
	
	(You can have as many simple variables as you like.)
	You should not modify the contents of the map passed to your method.
	
	Declare your method in such a way that any caller can be sure that this will not happen.
	Your solution should run in no worse than O(N log N) time, where N is the number of pairs in the map.
 */

import java.util.*;

import acm.program.*;

public class ByAge extends ConsoleProgram {
    
    public void run() {
    	TreeMap<String, Integer> ages = new TreeMap<>();
    	ages.put("Allison", 18);
    	ages.put("Jerry", 26);
    	ages.put("Rex", 26);
    	ages.put("David", 41);
    	
    	int min = 16;
    	int max = 27;
    	
    	println(byAge(ages, min, max));
    }
    
    public TreeMap<Integer, String> byAge(TreeMap<String, Integer> ages, int min, int max) {
    	TreeMap<Integer, String> ageDistribution = new TreeMap<>();
    	
    	if(ages.size() == 0) {
    		return ageDistribution;
    	}
    	
    	for(Map.Entry<String, Integer> ageEntry: ages.entrySet()) {
    		String name = ageEntry.getKey();
    		int age = ageEntry.getValue();
    		
    		if(age >= min && age <= max) {
    			if(ageDistribution.containsKey(age)) {
    				String people = ageDistribution.get(age);
    				ageDistribution.put(age, people + " and " + name);
    			} else {
    				ageDistribution.put(age, name);
    			}
    		}
    	}
    	
    	return ageDistribution;
    }
}
