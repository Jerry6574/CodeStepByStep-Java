/* GetDaysInMonth.java

Solution to: https://www.codestepbystep.com/problem/view/java/parameters/getDaysInMonth
		 and https://www.codestepbystep.com/problem/view/java/parameters/daysInMonth

Write a method named getDaysInMonth that accepts an integer parameter representing a month (between 1 and 12) 
and returns the number of days in that month in a non-leap year. 
For example, the call getDaysInMonth(9) would return 30 because September has 30 days.

Month	1 Jan	2 Feb	3 Mar	4 Apr	5 May	6 Jun	7 Jul	8 Aug	9 Sep	10 Oct	11 Nov	12 Dec
Days	31		28		31		30		31		30		31		31		30		31		30		31


 */
import acm.program.*;

public class GetDaysInMonth extends ConsoleProgram {
    
    public void run() {
    	println(getDaysInMonth(10));
    }
    
    public int getDaysInMonth(int month) {
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
}
