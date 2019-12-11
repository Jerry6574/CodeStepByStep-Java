/* Teacher.java

Solution to: https://www.codestepbystep.com/problem/view/java/collections/map/teacher

Write a method named teacher that produces a mapping of students' grades. 
Your method accepts two parameters: a class roster telling you each student's 
name and percentage earned in the course, and a grade mapping telling you the 
minimum percentage needed to earn each unique grade mark. 

The class roster is a hash map from students' names (strings) to the 
percentage of points they earned in the course (integers). 
The grade mapping is a hash map from percentages (integers) to grades (strings) and 
indicates the minimum percentage needed to earn each kind of grade. 

The task of your method is to look at the student roster and grade mapping and use 
them to build and return a new HashMap from students' names to the letter grades 
they have earned in the class, based on their percentage and the grade mapping. 
Each student should be given the grade that corresponds to the highest value from 
the grade mapping that is less than or equal to the percentage that the student earned.

Suppose that the class roster is stored in a map variable named roster 
that contains the following key/value pairs, and that the grade mapping 
is stored in a map variable named gradeMap that contains the key/value pairs below it:

roster:
  {Mort=77, Dan=81, Alyssa=98, Kim=52, Lisa=87, Bob=43, Jeff=70, Sylvia=92, Vikram=90}
gradeMap:
  {52=D, 70=C-, 73=C, 76=C+, 80=B-, 84=B, 87=B+, 89=A-, 91=A, 98=A+}
  
The idea is that Mort earned a C+ because his grade is at least 76%; 
Dan earned a B- because he earned at least 80%; and so on. 
If a given student's percentage is not as large as any of the percentages in the map, 
give them a default grade of "F". So your method should build and return the 
following map from students' names to their letter grades when passed the above data:

return value:
  {Mort=C+, Dan=B-, Alyssa=A+, Kim=D, Lisa=B+, Bob=F, Jeff=C-, Sylvia=A, Vikram=A-}
  
Though maps often store their elements in unpredictable order, 
for this problem you may assume that the grade mapping's key/value pairs are 
stored in ascending order by keys (percentages).

If either map passed to your method is empty, your method should return an empty map. 
You should not make any assumptions about the number of key/value pairs in the 
map or the range of possible percentages that could be in the map.

Constraints: You may create one new map as storage to solve this problem. 
(This is the map you will return.) You may not declare any other data structures. 
You can have as many simple variables as you like, such as integers or strings. 
Do not modify the maps that are passed in to your method as a parameter.

 */
import java.util.*;

import acm.program.*;

public class Teacher extends ConsoleProgram {
    
    public void run() {
    	HashMap<String, Integer> students = new HashMap<>();
    	students.put("Mort", 77);
    	students.put("Dan", 81);
    	students.put("Alyssa", 98);
    	students.put("Kim", 52);
    	students.put("Lisa", 87);
    	students.put("Bob", 43);
    	students.put("Jeff", 70);
    	students.put("Sylvia", 92);
    	students.put("Vikram", 90);
    	
    	TreeMap<Integer, String> gradeMap = new TreeMap<>();
    	gradeMap.put(52, "D");
    	gradeMap.put(70, "C-");
    	gradeMap.put(73, "C");
    	gradeMap.put(76, "C+");
    	gradeMap.put(80, "B-");
    	gradeMap.put(84, "B");
    	gradeMap.put(87, "B+");
    	gradeMap.put(89, "A-");
    	gradeMap.put(91, "A");
    	gradeMap.put(98, "A+");
    	
    	println(teacher(students, gradeMap));
    }
    
    public HashMap<String, String> teacher(HashMap<String, Integer> students, TreeMap<Integer, String> gradeMap) {
    	HashMap<String, String> classGrades = new HashMap<>();
    	
    	for(Map.Entry<String, Integer> studentEntry: students.entrySet()) {
    		int grade = studentEntry.getValue();
    		String name = studentEntry.getKey();
    		
    		for(Map.Entry<Integer, String> gradeEntry: gradeMap.entrySet()) {
    			int percentage = gradeEntry.getKey();
    			String letterGrade = gradeEntry.getValue();
    			
    			if(grade >= percentage) {
    				classGrades.put(name, letterGrade);
    			}
    		}
    		
    		if(classGrades.get(name) == null) {
    			classGrades.put(name, "F");
    		}
    	}
    	
    	return classGrades;
    }
}
