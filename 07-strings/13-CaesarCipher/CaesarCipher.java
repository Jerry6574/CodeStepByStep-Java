/* CaesarCipher.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/CaesarCipher

Write a console program in a class named CaesarCipher that implements a Caesar cipher or rotation cipher, 
which is a crude system of encoding strings by shifting every letter forward by a given number. 

Your program should prompt the user to type a message and an 
encoding "key" (number of places to shift each character) and display the shifted message. 

For example, if the shift amount is 3, then the letter A becomes D, and B becomes E, and so on. 
Letters near the end of the alphabet wrap around; for a shift of 3, X becomes A, and Y becomes B, 
and Z becomes C. Here are two example dialogues:

Your message? Attack zerg at dawn
Encoding key? 3
DWWDFN CHUJ DW GDZQ

Your message? DWWDFN CHUJ DW GDZQ
Encoding key? -3
ATTACK ZERG AT DAWN

 */


import acm.program.*;

public class CaesarCipher extends ConsoleProgram {
    
    public void run() {
    	String message = readLine("Your message? ");
    	message = message.toUpperCase();
    	int key = readInt("Encoding key? ");
    	
    	// get the effective number of shifts if key is greater than 26
    	key = key % 26;
    	
    	String cipherText = "";
    	
    	int A = 65;
    	int Z = 90;
    	
    	char cipherChar;
    	
    	for(int i = 0; i < message.length(); i++) {
    		int asciiValue = (int) (message.charAt(i));
    		
    		if(asciiValue >= A && asciiValue <= Z) {
    			int newAsciiValue = asciiValue + key;
    			
    			if(newAsciiValue < A) {
        			// shift to direction of Z 
    				cipherChar = (char) (newAsciiValue + 26);
    			} else if(newAsciiValue > Z) {
    				// shift to direction of A 
    				cipherChar = (char) (newAsciiValue - 26);
    			} else {
    				cipherChar = (char) (newAsciiValue);
    			}
    			
    			cipherText = cipherText + cipherChar;
    		
    		// Not A to Z ascii, keep original character
    		} else {
    			cipherText = cipherText + message.charAt(i);
    		}
    		
    	}
    	println(cipherText);
    }

}
