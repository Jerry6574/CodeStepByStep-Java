/* 
boxOfStars.java
Solution to: https://www.codestepbystep.com/problem/view/java/parameters/boxOfStars

Write a method named boxOfStars that accepts two integer parameters representing a width and height in characters, 
and prints to the console a 'box' figure whose border is * stars and whose center is made of spaces. For example, 
the call of boxOfStars(8, 5); should print the following output:
********
*      *
*      *
*      *
********

 */

import acm.program.*;

public class BoxOfStars extends ConsoleProgram {
    
    public void run() {
    	boxOfStars(8, 5);
    }
    
    public void boxOfStars(int w, int h) {
        for(int i = 0; i < h; ++i) {
        	
        	// print full row of * for first and last row
            if(i == 0 || i == h - 1) {
                for(int j = 0; j < w; ++j) {
                    print("*");
                }   
            } 
            // for middle rows, print * at first and last column
            else {
                for(int j = 0; j < w; ++j) {
                    if(j == 0 || j == w - 1) {
                        print("*");
                    } else{
                        print(" ");
                    }
                }   
            }
            println();
        }
    }  
}
