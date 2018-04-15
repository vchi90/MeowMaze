public class MazeSolver {
/**
 Contains the method to solve a Maze.

 See README for specifics. (statement of the problem, etc)
*/
private static int[] directions = {Maze.EAST,
				   Maze.NORTH,
				   Maze.SOUTH,
				   Maze.WEST};

    private static Maze mazeToSolve;
	
    public static boolean solveThis(Maze aMaze) {
        mazeToSolve = new Maze(aMaze);
		  return solveMaze();
    }
	
    private static int solutions == 0;
    private static boolean solveMaze() {
      if (mazeToSolve.explorerIsOnA() == Maze.TREASURE) { //base cases
        return true;
        }
      else if (mazeToSolve.explorerIsOnA() == Maze.WALL) {
        return false;
        }
      else {
        for (int eachDirection : directions) {
	  Maze snapshot = new Maze(mazeToSolve); //using the Maze(old maze) constructor
	  mazeToSolve.dropA(Maze.WALL);
          mazeToSolve.go(eachDirection);
          if (solveMaze()) {
            System.out.println(maze.toString()); }
          else {
            mazeToSolve = new Maze(snapshot);}
            }
          }
      if (solutions > 0) {
          return true;
          }		  
  }
}
