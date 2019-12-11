/*

Solution to: https://www.codestepbystep.com/problem/view/java/recursion/matchCount

Write a recursive method named matchCount that accepts two ArrayLists of integers as parameters and that returns the number of elements that match between them. Two elements match if they occur at the same index in both lists and have equal values. For example, given the two lists shown below, the call of matchCount(v1, v2) would compare as follows:

v1: {2, 5, 0, 3, 8, 9, 1, 1, 0, 7}
     |  |  |  |  |  |  |
v2: {2, 5, 3, 0, 8, 4, 1}
The method should return 4 in this case because 4 of these pairs match (2-2, 5-5, 8-8, and 1-1). If either list is empty, by definition it has no matches with the other list, so your method should return 0.

 */

import java.util.*;

public class MatchCount {

	public static void main(String[] args) {
		ArrayList<Integer> v1 = new ArrayList<>(Arrays.asList(2, 5, 0, 3, 8, 9, 1, 1, 0, 7));
		ArrayList<Integer> v2 = new ArrayList<>(Arrays.asList(2, 5, 3, 0, 8, 4, 1));
		
		System.out.println(matchCount(v1, v2));
	}
	
	public static int matchCount(ArrayList<Integer> v1, ArrayList<Integer> v2) {
		if(v1.size() == 0 || v2.size() == 0) {
			return 0;
		} else {
			int match = 0;
			if(v1.get(0) == v2.get(0)) {
				match = 1;
			}
			
			v1.remove(0);
			v2.remove(0);
			return match + matchCount(v1, v2);
		}
	}
	
}
