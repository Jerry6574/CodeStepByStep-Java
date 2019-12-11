/* PostalService.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/postalService

Write a method named postalService that helps the postal service sort mail for customers based on "ZIP" codes. 
A ZIP code is an integer that represents a given city or region of the USA. 
Your method accepts two hash maps as parameters:

1. a {customer name → ZIP code} map, where each key is a person's full name as a string and each value is 
that person's numeric ZIP code as an integer. For example, the pair Jon Smith=12345 would mean that 
the customer named John Smith lives at the ZIP code of 12345.

2. a {ZIP code → city} map, where each key is an integer ZIP code and each value is the name of 
the city for that zip code as a string. For example, the pair 12345=Mordor would mean that 
the ZIP code 12345 corresponds to the city of Mordor.

Your job is to build and return a new hash map where the keys are city names, 
and values are strings showing the last name (surname) of every customer whose ZIP code is in that city.

In the customer map passed to your method, names are represented in "FirstName LastName" format, 
where the given name (first name) is followed by a space and then the surname (last name), 
such as "Michael Jackson". But a name could have more words in it, such as "Oscar de la Hoya", 
or could contain just a single word, such as "Cher". For any name, regardless of how many words it contains, 
the last word in that name is considered to be the customer's last name / surname.

For example, two maps named people and cities might store the following pairs, shown in key=value format:

(1) 'people' customer map:  
  {Ally T Obern=85704, Madonna=11430, David Q Shaw=90045, Mike Tom Brooks=85704,
   Jerry Cain=11430, Kate Jan Martin=68052, Jane Su=68052, Jessica K. R. Miller=94305,
   Marty Doug Stepp=95050, Nick T=94305, Sara de la Pizza=68052, Stu T. Reges=94305,
   Prince=94305, Dany Khaleesi Mother of Dragons Targaryen=9999999}
(2) 'cities' ZIP/city map:  
  {11430=NewYork, 22222=Duluth, 68052=Springfield, 71384=Omaha, 85704=Tucson,
   90045=Redmond, 94305=Stanford, 95050=SantaClara, 9999999=Westeros}
   
In the result map you must build, each key is a string representing a city name, 
and the associated value is a string with the last names of all people in that ZIP code, 
separated by " and " if there is more than one person in the ZIP code in the data. 
The order names are listed for a given ZIP code does not matter. 

If a given city does not correspond to any people in the customer map, 
that city name should not be included in your result map.

When passed the maps above, the call of postalService(people, cities) should return the following map:

  {Tucson=Obern and Brooks, NewYork=Madonna and Cain, Redmond=Shaw,
   Springfield=Martin and Su and Pizza, Stanford=Miller and T and Reges and Prince,
   SantaClara=Stepp, Westeros=Targaryen}
   
Assumptions: You may assume that ZIP codes will be non-negative, 
but otherwise you should not make any assumptions about the range of numbers you will see as ZIP codes. 
You may assume that names are non-empty strings consisting of at least one character, 
but otherwise you should also not make any assumptions about the length or content of names. 
You may assume that every ZIP code found in the customer map will also be found in the ZIP/city map, 
but not every ZIP/city found in the cities map might be present in the people/customers map. 
If the customer map passed is empty, return an empty map. 
Otherwise do not make assumptions about the size of either map.

Constraints: You may declare one map to help you solve this problem. (This is the map you will return.) 
You may not declare any other data structures. You can have as many simple variables as you like, 
such as integers or strings. Do not modify the maps that are passed in to your method as parameters.

 */
import java.util.*;

import acm.program.*;

public class PostalService extends ConsoleProgram {
    
    public void run() {
    	HashMap<String, Integer> people = new HashMap<>();
    	people.put("Ally T Obern", 85704);
    	people.put("Jerry", 85704);
    	people.put("Madonna", 11430);
    	
    	HashMap<Integer, String> allZips = new HashMap<>();
    	allZips.put(85704, "Tucson");
    	allZips.put(11430, "New York");
    	
    	println(postalService(people, allZips).toString());
    }
    
    public HashMap<String, String> postalService(HashMap<String, Integer> people, HashMap<Integer, String> allZips) {
    	HashMap<String, String> cities = new HashMap<>();
    	
    	if(people.size() == 0) {
    		return cities;
    	}
    	
    	for(Map.Entry<String, Integer> person: people.entrySet()) {
    		
    		for(Map.Entry<Integer, String> zip: allZips.entrySet()) {
    			String[] fullName = person.getKey().split(" ");
    			String lastName = fullName[fullName.length-1];
    			
    			int personZipCode = person.getValue();
    			int cityZipCode = zip.getKey();
    			String city = zip.getValue();
    			
    			if(personZipCode == cityZipCode) {
    				
    				if(cities.containsKey(city)) {
    					String residents = cities.get(city);
    					cities.put(city, residents + " and " + lastName);
    				} else {
    					cities.put(city, lastName);
    				}
    				
    			}
    			
    		}
    		
    	}
    	
    	return cities;
    }
}
