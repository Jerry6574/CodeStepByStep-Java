/* ClockAdvance.java

Solution: https://www.codestepbystep.com/problem/view/java/classes/Clock-advance

 */

public class Clock {
    private int hour;
    private int minute;
    private String amPm;
    
    // Constructs a new time for the given hour/minute
    public Clock(int h, int m, String ap) {
    	hour = h;
    	minute = m;
    	amPm = ap;
    }
    
    // returns the field values
    public int getHour() {
    	return hour;
    }
    public int getMinute() {
    	return minute;
    }
    
    public String getAmPm() {
    	return amPm;
    }

    // returns String for time; for example, "6:27 PM"
    public String toString() {
    	String minuteStr = minute + "";
    	if(minute < 10) {
    		minuteStr = "0" + minuteStr;
    	}
    	return hour + ":" + minuteStr + " " + amPm;
    }
    
    public void advance(int minutes) {
        // net change in minutes for the day
        int remainderMinutes = minutes % (60 * 24);

        // net change in hours for the day
        int deltaHours = ((remainderMinutes + getMinute()) / 60) % 24;
        
        boolean rollOverAmPm = false;
        
        if(getHour() < 12) {
        	// 
        	rollOverAmPm = (deltaHours + getHour() >= 12) && (deltaHours + getHour() <= 24);
        } else {
        	// for 12am to become 12pm, the deltaHours must be greater than 12 hours and less than 24 hours
        	if(deltaHours >= 12) {
        		rollOverAmPm = true;
        	}
        }
        

        minute = (remainderMinutes + getMinute()) % 60;
        
        if((deltaHours + getHour()) % 12 == 0) {
        	hour = 12;
        } else {
        	hour = (deltaHours + getHour()) % 12;
        }
        
        
        if(rollOverAmPm) {
            if(amPm == "AM") {
                amPm = "PM";
            } else {
                amPm = "AM";
            }
        }
    }
    
	public static void main(String[] args) {
		Clock time = new Clock(6, 27, "PM");
		
		time.advance(1);       //  6:28 PM
		time.advance(30);      //  6:58 PM
		time.advance(5);       //  7:03 PM
		time.advance(60);      //  8:03 PM
		time.advance(128);     // 10:11 PM
		time.advance(180);     //  1:11 AM
		time.advance(1440);    //  1:11 AM  (1 day later)
		time.advance(21075);   //  4:26 PM  (2 weeks later)
		System.out.println(time.toString());
	}
}
