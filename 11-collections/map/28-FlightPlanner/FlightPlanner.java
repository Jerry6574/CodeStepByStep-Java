/* FlightPlanner.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/FlightPlanner

Write a console program named FlightPlanner that reads in a file containing flight destinations from various cities, 
and then allow the user to plan a round-trip flight route. Here's what a sample run of the program might look like:

...
The flight data come from a file named flights.txt , which has the following format:

	Each line consists of a pair of cities separated by an arrow indicated by the two character combination ->, as in:
		New York -> Anchorage
		
	The file may contain blank lines for readability (you should just ignore these).
	
The entire data file used to produce this sample run appears below.

San Jose -> San Francisco
San Jose -> Anchorage
New York -> Anchorage
New York -> San Jose
New York -> San Francisco
New York -> Honolulu
Anchorage -> New York
Anchorage -> San Jose
Honolulu -> New York
Honolulu -> San Francisco
Denver -> San Jose
San Francisco -> New York
San Francisco -> Honolulu
San Francisco -> Denver

Your program should:
	Read in the flight information from the file flights.txt and store it in an appropriate data structure.
	
	Display the complete list of cities.
	
	Allow the user to select a city from which to start.
	
	In a loop, print out all the destinations that the user may reach directly from the current city, 
	and prompt the user to select the next city.
	
	Once the user has selected a round-trip route (i.e., once the user has selected a flight that 
	returns them to the starting city), exit from the loop and print out the route that was chosen.
	
A critical issue in building this program is designing appropriate data structures to keep track 
of the information you'll need in order to produce flight plans. You'll need to both have a way 
of keeping track of information on available flights that you read in from the flights.txt file, 
as well as a means for keeping track of the flight routes that the user is choosing in constructing 
their flight plan. Consider how both ArrayLists and HashMaps might be useful to keep track of the 
information you care about.

 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import acm.program.*;
import acm.util.ErrorException;

public class FlightPlanner extends ConsoleProgram {
    
	private BufferedReader rd;
	private HashMap<String, ArrayList<String>> cityToDestinations;
	
	public void init() {
    	cityToDestinations = new HashMap<>();
    	addCityToDestinations();
	}
	
    public void run(String filename) {
    	rd = openTextFile(filename);
    	printWelcomeMsg();
    	planTrip();
    }
    
    private BufferedReader openTextFile(String filename){
    	BufferedReader rd = null;
    	
		try{
			rd = new BufferedReader(new FileReader(filename));
		} catch(IOException ex){
			println("Please provide a valid filename. ");
		}
    	return rd;
    }
    
    private void addCityToDestinations() {
    	try {
	    	while(true) {
	    		String line = rd.readLine();
	    		if(line == null) {
	    			break;
	    		} else if(!line.equals("")) {
	        		String arrow = " -> ";
	        		int arrowPos = line.indexOf(arrow);
	        		String city = line.substring(0, arrowPos);
	        		String destination = line.substring(arrowPos + arrow.length());
	        		
	        		ArrayList<String> destinations;
	        		if(!cityToDestinations.containsKey(city)) {
	        			destinations = new ArrayList<>();
	        		} else {
	        			destinations = cityToDestinations.get(city);
	        		}
	        		
        			destinations.add(destination);
        			cityToDestinations.put(city, destinations);
	    		}
	    	}
	    	rd.close();
    	}
		catch(IOException ex){
			throw new ErrorException(ex);
		}
    }
    
    private void printWelcomeMsg() {
    	println("Welcome to Flight Planner! ");
    	println("Here's a list of all the cities in our database: ");
    	
    	for(String city: cityToDestinations.keySet()) {
    		println(" " + city);
    	}
    	println("Let's plan a round trip route! ");
    }
    
    private void printDestinations(String city) {
    	if(cityToDestinations.containsKey(city)) {
        	println("From " + city + " you can fly directly to: ");
           	for(String destination: cityToDestinations.get(city)) {
        		println(" " + destination);
        	}
        	print("Where do you want to go from " + city + " ? ");
    	} else {
    		println("You can't get to that city by a direct flight");
    	}
    }
    
    
    private void planTrip() {
    	String startCity = "";
    	String nextCity = "";
    	ArrayList<String> route = new ArrayList<>();
    	
    	while(true) {
    		if(startCity.equals("")) {
    			startCity = readLine("Enter the starting city: ");
    			
    			if(cityToDestinations.containsKey(startCity)) {
    				printDestinations(startCity);
    				nextCity = readLine();
    			} else {
    				print("You can't get to that city by a direct flight. ");
    			}
    			
    			route.add(nextCity);
    			
    		} else if(!startCity.equals("") && !startCity.equals(nextCity)) {
    			printDestinations(nextCity);
    			nextCity = readLine();
    			route.add(nextCity);
    			
    			if(cityToDestinations.containsKey(nextCity)) {
    				printDestinations(nextCity);
    				nextCity = readLine();
    			} else {
    				print("You can't get to that city by a direct flight. ");
    			}
    		} else if(startCity.equals(nextCity)) {
    			for(String city: route) {
    				print(city + " -> ");
    			}
    			print(startCity);
    			break;
    		}
    	}
    }
}