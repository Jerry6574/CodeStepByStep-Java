/*

Solution to: https://www.codestepbystep.com/problem/view/java/recursion/numberSequence

 */

public class NumberSequence {

	public static void main(String[] args) {
		numberSequence(10);
	}
	
	public static void numberSequence(int n) {
	    if(n < 1) {
	        throw new IllegalArgumentException();
	    } else if(n == 1) {
	        System.out.print("1");
	    } else if(n == 2){
	        System.out.print("1 1");
	    } else {
	        if(n % 2 == 1) {
	            System.out.print((n / 2 + 1) + " ");
	            numberSequence(n - 2);
	            System.out.print(" " + (n / 2 + 1));
	        } else {
	            System.out.print(n / 2 + " ");
	            numberSequence(n - 2);
	            System.out.print(" " + n / 2);
	        }
	    }
	}
}
