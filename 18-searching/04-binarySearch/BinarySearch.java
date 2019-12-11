/* BinarySearch.java
Solution to: https://www.codestepbystep.com/problem/view/java/searching/binarySearch
 */
import acm.program.*;

public class BinarySearch extends ConsoleProgram {
    
    public void run() {
    	int[] a = {-4,  2,  7, 10, 15, 20, 22, 25, 30, 36, 42, 50, 56, 68, 85, 92, 103};
    	println(binarySearch(a, -40));
    }
    
	public int binarySearch(int[] a, int target) {
		int min = 0;
		int max = a.length - 1;
		
		return binarySearchHelper(a, target, min, max);
	}

	public int binarySearchHelper(int[] a, int target, int min, int max) {
		int mid = min + (max - min) / 2;
		
		if(max >= min) {
			if(a[mid] == target) {
				return mid;
			} else if(a[mid] < target) {
				min = mid + 1;
				// search left half of array
				return binarySearchHelper(a, target, min, max);
			} else if(a[mid] > target) {
				max = mid - 1;
				// search right half of array
				return binarySearchHelper(a, target, min, max);
			}
		}
		return -1;
	}
    
}
