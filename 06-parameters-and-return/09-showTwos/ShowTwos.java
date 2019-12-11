/* ShowTwos.java

Solution to https://www.codestepbystep.com/problem/view/java/parameters/showTwos

Write a method named showTwos that shows the factors of 2 in a given integer. 
For example, the following calls:

7 = 7
18 = 2 * 9
68 = 2 * 2 * 17
120 = 2 * 2 * 2 * 15

The idea is to express the number as a product of factors of 2 and an odd number. 
The number 120 has 3 factors of 2 multiplied by the odd number 15. 
For odd numbers (e.g. 7), there are no factors of 2, so you just show the number itself. 
Assume that your method is passed a number greater than 0.

 */
import acm.program.*;

public class ShowTwos extends ConsoleProgram {
    
    public void run() {
    	showTwos(68);
    }
    
    public void showTwos(int n) {
    	int num = n;
    	String expression = num + " = ";
    	
    	while(true) {
    		if(num % 2 != 0) {
    			expression += num;
    			break;
    		} else {
    			expression += "2 * ";
    			num /= 2;
    		}
    	}
    	
    	println(expression);
    }
    
}
