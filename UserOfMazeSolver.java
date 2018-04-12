public class UserOfMazeSolver {
/**
 Test MazeSolver class. Specifically the solver method:
 Here we want to test the base cases and the recursive cases, BUT for this homework, base case only.
 o Wall Element
 o Treasure
 o Stepping Stone
 Does this by: supplying MazeSolver with the Maze.
*/

    public static void main(String[] commandLine)
       throws java.io.FileNotFoundException {
       Maze testDummy = new Maze (commandLine[0], Integer.parseInt(commandLine[1]), Integer.parseInt(commandLine[2])); //taking it from the terminal to determine maze and the starting position

      System.out.println(MazeSolver.solveThis(testDummy));
    }
}