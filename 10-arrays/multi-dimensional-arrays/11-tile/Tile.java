/* Tile.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/2d/tile

 */
import acm.graphics.GImage;
import acm.program.*;

public class Tile extends ConsoleProgram {
    
    public void run() {
        while (true) {
            println("You said: " + readLine());
        }
    }
    
    public void tile(GImage source, int width, int height) {
    	int[][] tilePixelArray = new int[height][width];
    	
    	for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				tilePixelArray[i][j] = source.getPixelArray()[i % height][j % width];
			}
		}
    	
    	source.setPixelArray(tilePixelArray);
    }
    
}
