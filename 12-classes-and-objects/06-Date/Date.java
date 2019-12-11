/* Date.java

Solution to: https://www.codestepbystep.com/problem/view/java/classes/Date

 */


public class Date{
    private int month;
    private int day;
    
    public Date(int month, int day) {
    	this.month = month;
    	this.day = day;
    }
    
    public int daysInMonth() {
    	switch (month) {
		case 2:
			return 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 31;
		}
    }
    
    public int getDay() {
    	return day;
    }
    
    public int getMonth() {
    	return month;
    }
    
    public void nextDay() {
    	int nDaysInMonth = daysInMonth();
    	
    	if(day < nDaysInMonth) {
    		day++;
    	
    	// wrapping to next month
    	} else {
    		day = 1;
    		
    		if(month != 12) {
    			month++;
    		
    		// wrapping to next year
    		} else {
    			month = 1;
    		}
    	}
    }
    
    public String toString() {
    	String monthStr = month + "";
    	String dayStr = day + "";
    	
    	if(month < 10) {
    		monthStr = "0" + monthStr;
    	}
    	
    	if(day < 10) {
    		dayStr = "0" + dayStr;
    	}
    	
    	return monthStr + "/" + dayStr;
    }
}
