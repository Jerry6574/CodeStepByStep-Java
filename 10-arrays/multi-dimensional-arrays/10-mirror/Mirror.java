/* MyProgram.java
 * --------------
 * Modify this file any way you like (or create additional files in
 * the ACMStarterProject) in order to experiment with the capabilities
 * of the ACM libraries.
 * 
 * NOTE: While you are free to do whatever you like with this project,
 * it is still best to use the assignment-specific starter files
 * for actual assignments.
 */
import acm.graphics.GImage;
import acm.program.*;

public class Mirror extends ConsoleProgram {
    
    public void run() {

    }
    
    public void mirror(GImage source) {
    	int[][] pixelArray = source.getPixelArray();
    	
    	int height = pixelArray.length;
    	int width = pixelArray[0].length;
    	
    	int[][] newPixelArray = new int[height*2][width* 2];
    	
    	// copy original image
    	for(int i = 0; i < height; i++) {
    		for(int j = 0; j < width; j++) {
    			newPixelArray[i][j] = pixelArray[i][j];
    		}
    	}
    	
    	// copy flipHorizontal image
    	for(int i = 0; i < height; i++) {
    		for(int j = width; j < width; j++) {
    			flipHorizontal(pixelArray);
    			newPixelArray[i][j*2] = pixelArray[i][j];
    		}
    	}
    	
    	// copy flipHorizontal and flipVertical image
    	for(int i = height; i < height; i++) {
    		for(int j = width; j < width; j++) {
    			flipVertical(pixelArray);
    			newPixelArray[i*2][j*2] = pixelArray[i][j];
    		}
    	}
    	
    	// copy flipVertical image
    	for(int i = height; i < height; i++) {
    		for(int j = 0; j < width; j++) {
    			flipHorizontal(pixelArray);
    			newPixelArray[i*2][j] = pixelArray[i][j];
    		}
    	}
    	source.setPixelArray(newPixelArray);
    	
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
    
    public void flipHorizontal(int[][] pixelArray) {
    	for (int i = 0; i < pixelArray.length; i++) {
			for (int j = 0; j < pixelArray[0].length / 2; j++) {
				int temp = pixelArray[i][j];
				pixelArray[i][j] = pixelArray[i][pixelArray[0].length - 1 - j];
				pixelArray[i][pixelArray[0].length - 1 - j] = temp;
			}
		}
    }
}
