/* NameGame.java

Solution to: https://www.codestepbystep.com/problem/view/java/strings/NameGame

Write a console program in a class named NameGame that prints the following rhyme about .
the person's first and last name. You may assume that the user types a string with exactly one space.

What is your name? Fifty Cent
Fifty, Fifty, bo-Bifty
Banana-fana fo-Fifty
Fee-fi-mo-Mifty
FIFTY!

Cent, Cent, bo-Bent
Banana-fana fo-Fent
Fee-fi-mo-Ment
CENT! 

 */
import acm.program.*;

public class NameGame extends ConsoleProgram {
    
	public void run(){
    	String name = readLine("What is your name?");
    	String firstName = name.split(" ")[0];
    	String lastName = name.split(" ")[1];
    	
    	println(firstName + ", " + firstName + ", " + "bo-B" + firstName.substring(1));
    	println("Banana-fana fo-F" + firstName.substring(1));
    	println("Fee-fi-mo-M" + firstName.substring(1));
    	println(firstName.toUpperCase() + "!");
    	println();
    	
    	println(lastName + ", " + lastName + ", " + "bo-B" + lastName.substring(1));
    	println("Banana-fana fo-F" + lastName.substring(1));
    	println("Fee-fi-mo-M" + lastName.substring(1));
    	println(lastName.toUpperCase() + "!");
    }
    
}
