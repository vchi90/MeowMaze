public class MazeSolver {
/**
 Contains the method to solve a Maze.

 See README for specifics. (statement of the problem, etc)
*/

  public static boolean solveThis(Maze maze) {
      if (maze.explorerIsOnA() == Maze.TREASURE) { //testing base cases
          return true;
      }
    else if (maze.explorerIsOnA() == Maze.WALL) {
      return false;
    } 
    else { //explorer must be on a stepping stone, but least that you can test is the base case, so we'll leave that out for today :)
    return false;
    }
  }
}
