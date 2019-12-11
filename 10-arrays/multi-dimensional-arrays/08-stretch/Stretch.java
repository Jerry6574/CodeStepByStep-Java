/* Stretch.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/2d/stretch


 */




import acm.graphics.GImage;
import acm.program.*;

public class Stretch extends ConsoleProgram {
    
    public void run() {
    	
    }
   
   
    public void stretch(GImage image, int factor) {
    	int[][] pixelArray = image.getPixelArray();
    	int[][] stretchedPixelArray = new int[pixelArray.length][pixelArray[0].length * factor];
    	
    	for (int i = 0; i < pixelArray.length; i++) {
			for (int j = 0; j < pixelArray.length; j++) {
				for (int k = 0; k < factor; k++) {
					stretchedPixelArray[i][factor * j + k] = pixelArray[i][j];
				}
			}
		}
    	
    	// setPixelArray undefined in local ACM library, cannot test solution locally
    	// codestepbystep seems to end the test too quickly, cannot test solution online
    	image.setPixelArray(stretchedPixelArray);
    }
    
}
