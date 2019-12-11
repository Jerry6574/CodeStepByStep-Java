
/* Student.java

Solution to https://www.codestepbystep.com/problem/view/java/classes/Student

 */


public class Student{
    private String name;
    private int id;
    private int unitCount;
    public static final int GRADUDATION_UNIT = 180;
    
    public Student(String name, int id) {
    	this.name = name;
    	this.id = id;
    	this.unitCount = 0;
    }
    
    public String getName() {
    	return name;
    }
    
    public int getID() {
    	return id;
    }
    
    public int getUnits() {
    	return unitCount;
    }
    
    public void incrementUnits(int units) {
    	unitCount += units;
    }
    
    public boolean hasEnoughUnits() {
    	if(unitCount >= GRADUDATION_UNIT) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public String toString() {
    	return name + " (#" + id + ")"; 
    }
    
}
