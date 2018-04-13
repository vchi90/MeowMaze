public class MazeSolver {
/**
 Contains the method to solve a Maze.

 See README for specifics. (statement of the problem, etc)
*/
private static int[] directions = {Maze.EAST, Maze.NORTH, Maze.SOUTH, Maze.WEST};

    private static Maze mazeToSolve;
	
    public static boolean solveThis(Maze aMaze) {
        mazeToSolve = new Maze(aMaze);
		  return solveMaze();
    }
	
    private static boolean solveMaze() {
      if (mazeToSolve.explorerIsOnA() == Maze.TREASURE) { //base cases
        return true;
        }
      else if (mazeToSolve.explorerIsOnA() == Maze.WALL) {
        return false;
        }
      else {
		    mazeToSolve.dropA(Maze.WALL);
        Maze snapshot = new Maze(mazeToSolve); //using the Maze(old maze) constructor
        for (int eachDirection : directions) {
          mazeToSolve.go(eachDirection);
          if (solveMaze()) {
            return true; }
          else {
            mazeToSolve = new Maze(snapshot);}
            }
          }
      return false; 
  }
}
