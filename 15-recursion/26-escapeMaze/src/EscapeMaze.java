/*

Solution to: https://www.codestepbystep.com/problem/view/java/recursion/escapeMaze

Write a recursive method named escapeMaze that uses recursive backtracking to find a pathway out of a 2-dimensional maze. Assume that the maze is represented as an object of class Maze which is provided to you. A Maze object stores its data internally as a 2-dimensional array of char values, where row 0 is the top and column 0 is the left edge. A maze contains walls and empty squares. Empty squares are represented as the space character ' ', and any other character is considered a wall.

Your method should accept three parameters: a maze and a starting row/column from which to begin your search. You are to explore the various ways to move up, down, left and right in the maze to try to reach an open spot on the outer border of the maze (which would be an exit from the maze).

Method													Description
public int getWidth()									maze's width (number of columns)
public int getHeight()									maze's height (number of rows)
public char getSquare(int r, int c)						square at the given row/column, e.g. '#'
public void setSquare(int r, int c, char ch)			sets given square to store given character; allowed only on squares that are empty or contain '.'
public boolean isExplored(int r, int c)					true if you set this square as explored (initially false for all squares)
public void setExplored(int r, int c, boolean b)		sets the given square to be explored or not
public String toString()								string version of maze, as shown below

For example, the maze might look like the characters below at left, with 12 rows and 10 columns, and an "exit" near the lower-right corner at row 9, column 9. Suppose we are asked to find a path out of this maze starting from row 6, column 1. If a Maze variable called maze stores a maze with the characters below:

##########
#        #
# ### ## #
# #    # #
# #  # # #
# ## #####
# #      #
# # #  # #
##### ####
#   #
# #    # #
##########

Now suppose a call of escapeMaze(maze, 6, 1); is made. The call would produce the output shown below at right:

##########
#.....   #
#.###.## #
#.# .. # #
#.# .# # #
#.##.#####
#.# ..   #
# # #. # #
#####.####
#   #.....
# #  ..# #
##########
Your method should mark its path using the setSquare method on the maze, setting squares to use the dot character, '.', if they are part of the pathway out of the maze. But you do not want to mark any squares with dots until you have found an entire pathway out of the maze, at which point you should mark all the squares as you 'backtrack' out of your recursive code.

An important aspect of this problem is that you don't want to explore the same square more than twice. This is because if you already visited the square before (and explored all paths in all four directions away from that square), there must not be a pathway out of the maze that goes through that square. Therefore as you visit squares of the maze, you should mark them as explored by calling the maze's setExplored method, and you should be careful not to re-process a square that has already been explored. Just because a square has been explored does not mean it is necessarily part of the pathway out of the maze.

You may assume that the maze passed to your method is not null and that the starting row/column passed are within the bounds of the maze. Do not use any loops in solving this problem.

 */

public class EscapeMaze {

	public static void main(String[] args) {

	}
	
	public void escapeMaze(Maze maze, int startRow, int startCol) {
		if(solveMaze(maze, startRow, startCol)) {
			System.out.println(maze.toString());
		}
	}
	
	private boolean solveMaze(Maze maze, int startRow, int startCol) {
		
		// base case, hit the wall or explored
		if(maze.getSquare(startRow, startCol) == '#' || maze.isExplored(startRow, startCol)) {
			return false;
		}
		
		maze.setExplored(startRow, startCol, true);
		maze.setSquare(startRow, startCol, '.');
		
		// base case, at finish point
		if((startRow == 0 || startRow == maze.getHeight()-1) || 
		   (startCol == 0 || startCol == maze.getWidth()-1)) {
			return true;
		}

		// explore all 4 adjacent points
		if(solveMaze(maze, startRow-1, startCol)) {
			return true;
		}
		if(solveMaze(maze, startRow+1, startCol)) {
			return true;
		}
		if(solveMaze(maze, startRow, startCol-1)) {
			return true;
		}
		if(solveMaze(maze, startRow, startCol+1)) {
			return true;
		}
		
		// reached dead-end
		// unmakred explored to allow backtracking
		maze.setExplored(startRow, startCol, false);
		maze.setSquare(startRow, startCol, ' ');
		
		return false;
	}

}
