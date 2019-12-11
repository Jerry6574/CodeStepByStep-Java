/*
Solution to: https://www.codestepbystep.com/problem/view/java/recursion/crawl

Write a recursive method named crawl that accepts a string for a file or directory name as a parameter and prints information about that file or directory. If the name represents a normal file, just print its name. If the name represents a directory, print its name and information about every file/directory inside it, indented by 4 spaces at each level. For example, the call of crawl("course") might print the following information about your course directory:

course
    handouts
        lecture-schedule.xls
        syllabus.doc
    homework
        1-gameoflife
            GameOfLife.zip
            life.h
            life.java
            
Show the files in a given directory sorted in alphabetical order. (You may want to use the Arrays.sort command to help you with this.)

Constraints: Your method must be recursive, though you may use a loop to help you as appropriate.

 */


import java.io.File;
import java.util.Arrays;

public class Crawl {

	public static void main(String[] args) {
		crawl("course");
	}
	
	public static void crawl(String filename) {
		crawlHelper(filename, "");
	}
	
	private static void crawlHelper(String filename, String indent) {
		File root = new File(filename);
		System.out.println(indent + root.getName());
		
		if(root.isDirectory()) {	
			File[] list = root.listFiles();
			Arrays.sort(list);
			for(File f: list) {
				crawlHelper(filename + "/" + f.getName(), indent + "    ");
			}
		}
	}
}
