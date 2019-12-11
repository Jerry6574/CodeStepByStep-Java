/* UnionSets.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/set/unionSets

Write a method named unionSets that accepts as a parameter a HashSet of TreeSets of integers, 
and returns a TreeSet of integers representing the union of all of the sets of ints. 
(A union is the combination of everything in each set.) 

For example, calling your method on the following set of sets:
{{1, 3}, {2, 3, 4, 5}, {3, 5, 6, 7}, {42}}

Should cause the following set of integers to be returned:
{1, 2, 3, 4, 5, 6, 7, 42}

 */
import java.util.*;

import acm.program.*;

public class UnionSets extends ConsoleProgram {
    
    public void run() {
    	TreeSet<Integer> ts1 = new TreeSet<>(Arrays.asList(1, 3));
    	TreeSet<Integer> ts2 = new TreeSet<>(Arrays.asList(2, 3, 4, 5));
    	TreeSet<Integer> ts3 = new TreeSet<>(Arrays.asList(3, 5, 6, 7));
    	TreeSet<Integer> ts4 = new TreeSet<>(Arrays.asList(42));
    	
    	HashSet<TreeSet<Integer>> sets = new HashSet<>();
    	sets.add(ts1);
    	sets.add(ts2);
    	sets.add(ts3);
    	sets.add(ts4);
    	
    	println(unionSets(sets).toString());
    }
    
    public TreeSet<Integer> unionSets(HashSet<TreeSet<Integer>> sets) {
    	TreeSet<Integer> union = new TreeSet<>();

    	for(TreeSet<Integer> ts: sets) {
    		union.addAll(ts);
    	}
    	
    	return union;
    }
}
