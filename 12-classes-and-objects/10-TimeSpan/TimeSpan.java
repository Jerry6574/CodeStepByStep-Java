/* TimeSpan.java

Solution to: https://www.codestepbystep.com/problem/view/java/classes/TimeSpan

 */

public class TimeSpan{
    private int hours;
    private int minutes;
    
    public TimeSpan(int hours, int minutes) {
    	this.hours = hours;
    	this.hours += minutes / 60;
    	this.minutes = minutes % 60;
    }
    
    public int getHours() {
    	return hours;
    }
    
    public int getMinutes() {
    	return minutes;
    }
    
    public void add(int hours, int minutes) {
    	this.hours += hours;
    	this.hours += (minutes + getMinutes()) / 60;
    	this.minutes = (minutes + getMinutes()) % 60;
    }
    
    public void add(TimeSpan timeSpan) {
    	this.hours += timeSpan.getHours();
    	this.hours += (timeSpan.getMinutes() + getMinutes()) / 60;
    	this.minutes = (timeSpan.getMinutes() + getMinutes()) % 60;
    }
    
    public double getTotalHours() {
    	double totalHours = 0.0;
    	totalHours += getHours();
    	totalHours += (double) getMinutes() / 60;
    	
    	return totalHours;
    }
    
    public String toString() {
    	return getHours() + "h" + getMinutes() + "m";
    }
}
