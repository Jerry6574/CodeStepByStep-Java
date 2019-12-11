/* FlipHorizontal.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/2d/flipHorizontal

 */
import acm.graphics.GImage;
import acm.program.*;

public class FlipHorizontal extends ConsoleProgram {
    
    public void run() {

    }
    
    public void flipHorizontal(GImage image) {
    	int[][] pixelArray = image.getPixelArray();
    	
    	for (int i = 0; i < pixelArray.length; i++) {
			for (int j = 0; j < pixelArray[0].length / 2; j++) {
				int temp = pixelArray[i][j];
				pixelArray[i][j] = pixelArray[i][pixelArray[0].length - 1 - j];
				pixelArray[i][pixelArray[0].length - 1 - j] = temp;
			}
		}
    	
    	// setPixelArray undefined in local ACM library, cannot test solution locally
    	image.setPixelArray(pixelArray);
    }
}
