/* ComputeDistance.java

Solution to: https://www.codestepbystep.com/problem/view/java/parameters/computeDistance

Write a method named computeDistance that accepts four integer coordinates x1, y1, x2, 
and y2 as parameters and computes the distance between points (x1, y1) and 
(x2, y2) on the Cartesian plane. The formula for the distance between two points is:

d = sqrt((x2-x1)^2 + (y2-y1)^2)

For example, the call of computeDistance(10, 2, 3, 5) would return 7.615773105863909.

 */
import acm.program.*;

public class ComputeDistance extends ConsoleProgram {
    
    public void run() {
    	println(computeDistance(10, 2, 3, 5));
    }
    
    public double computeDistance(int x1, int y1, int x2, int y2) {
    	return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
