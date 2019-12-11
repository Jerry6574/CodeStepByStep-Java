/* MyProgram.java
Solution to https://www.codestepbystep.com/problem/view/java/parameters/averageOf3

Write a method named averageOf3 that accepts three integers as parameters 
and returns the average of the three integers as a real number. 
For example, the call of averageOf3(4, 7, 13) returns 8.
 */
import acm.program.*;

public class AverageOf3 extends ConsoleProgram {
    
    public void run() {
    	println(averageOf3(4, 7, 13));
    }
    
    public double averageOf3(int n1, int n2, int n3) {
    	return (n1 + n2 + n3) / 3.0;
    }
}
