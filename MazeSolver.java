public class MazeSolver {
/**
 Contains the method to solve a Maze.

 See README for specifics. (statement of the problem, etc)
*/

  public static boolean solveThis(Maze maze) {
      if (maze.explorerIsOnA() == Maze.TREASURE) { //base cases
          return true;
      }
    else if (maze.explorerIsOnA() == Maze.WALL) {
      return false;
    } 
    else { //explorer must be on a stepping stone, recursive case
    return false;
    }
  }
}
