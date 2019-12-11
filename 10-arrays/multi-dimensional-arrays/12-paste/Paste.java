/* Paste.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/2d/paste

 */
import acm.graphics.GImage;
import acm.program.*;

public class Paste extends ConsoleProgram {
    
    public void run() {
        while (true) {
            println("You said: " + readLine());
        }
    }
    
    public void paste(GImage img1, GImage img2, int xOffset, int yOffset) {
    	int newWidth = 0;
    	int newHeight = 0;
    	
    	if(xOffset + img2.getWidth() <= img1.getWidth()) {
    		newWidth = (int) img1.getWidth(); 
    	} else {
    		newWidth = (int) img1.getWidth() + xOffset;
    	}
    	
    	if(yOffset + img2.getHeight() <= img2.getHeight()) {
    		newHeight = (int) img1.getHeight(); 
    	} else {
    		newHeight = (int) img1.getHeight() + yOffset;
    	}
    	
    	int[][] newPixelArray = new int[newHeight][newWidth];
    	
    	for (int i = 0; i < newHeight; i++) {
			for (int j = 0; j < newWidth; j++) {
				
				if((i < yOffset || i > yOffset + img2.getHeight()) && (j < xOffset || j > xOffset + img2.getWidth())) {
					newPixelArray[i][j] = img1.getPixelArray()[i][j];
				} else if((i >= yOffset && i <= yOffset + img2.getHeight()) && (j >= xOffset && j <= xOffset + img2.getWidth())) {
					newPixelArray[i][j] = img1.getPixelArray()[i + yOffset][j + xOffset];
				}
			}
		}
    	
    	img1.setPixelArray(newPixelArray);
    }
    
}
