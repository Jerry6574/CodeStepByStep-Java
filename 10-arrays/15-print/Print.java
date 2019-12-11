/* Print.java

Solution to: https://www.codestepbystep.com/problem/view/java/arrays/print

Write a method named print that accepts an array of integers as a parameter and prints them, 
one per line, in the format shown. Your code should work for an array of any size. 

For example, if an array named a contains the elements [32, 5, 27, -3, 2598], 
then the call of print(a); should produce the following output:

element [0] is 32
element [1] is 5
element [2] is 27
element [3] is -3
element [4] is 2598

 */


public class Print{
    public static void main(String[] args) {
    	int[] a = {32, 5, 27, -3, 2598};
    	print(a);
    }
    
    public static void print(int[] array) {
    	for(int i = 0; i < array.length; i++) {
    		System.out.println("element [" + i + "] is " + array[i]);
    	}
    }
}
