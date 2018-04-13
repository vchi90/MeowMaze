public class MazeSolver {
/**
 Contains the method to solve a Maze.

 See README for specifics. (statement of the problem, etc)
*/
private static int[] directions = {Maze.EAST, Maze.NORTH, Maze.SOUTH, Maze.WEST};

  public static boolean solveThis(Maze maze) {

    if (maze.explorerIsOnA() == Maze.TREASURE) { //base cases
      return true;
      }
    else if (maze.explorerIsOnA() == Maze.WALL) {
      return false;
    }
    else {
      Maze snapshot = new Maze(maze); //using the Maze(old maze) constructor
      maze.dropA(Maze.WALL);
      for (int eachDirection : directions) {
        maze.go(eachDirection);
        if (solveThis(maze)) {
          return true; }
        else {
          maze = snapshot;}
        }
      }
    return false; 
  }
}
