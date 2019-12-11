/* WideFlip.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/2d/wideFlip

 */
import acm.program.*;
import acm.graphics.GImage;

public class WideFlip extends ConsoleProgram {
    
    public void run() {

    }
    
    public void wideFlip(GImage source) {
    	int[][] pixelArray = source.getPixelArray();
    	flipVertical(pixelArray);
    	
    	int[][] stretchedPixelArray = stretch(pixelArray);
    	
    	
    	// setPixelArray undefined in local ACM library, cannot test solution locally
    	// codestepbystep seems to end the test too quickly, cannot test solution online
    	source.setPixelArray(stretchedPixelArray);
    }
    
    public void flipVertical(int[][] pixelArray) {
        for (int i = 0; i < pixelArray.length / 2; i++) {
            for (int j = 0; j < pixelArray[0].length; j++) {
                int temp = pixelArray[i][j];
                pixelArray[i][j] = pixelArray[pixelArray[0].length - 1 - i][j];
                pixelArray[pixelArray[0].length - 1 - i][j] = temp;
            }
        }
    }
    
    public int[][] stretch(int[][] pixelArray) {
    	int factor = 2;
    	int[][] stretchedPixelArray = new int[pixelArray.length][pixelArray[0].length * factor];
    	
    	for (int i = 0; i < pixelArray.length; i++) {
			for (int j = 0; j < pixelArray.length; j++) {
				for (int k = 0; k < factor; k++) {
					stretchedPixelArray[i][factor * j + k] = pixelArray[i][j];
				}
			}
		}

    	return stretchedPixelArray;
    }
    
}
