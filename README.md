# MeowMaze
  To meow a maze is to solve a maze.
## Statement of Problem
  To find the boolean value to the statement:
  
  "There exists one path through a maze starting at a designated beginning that ends at the treasure".
## Personnel
  Vincent Chi, En Yu Zhang
## Recursive Abstraction
  When I'm asked to traverse a maze to find a treasure, the recursive abstraction can identify the possible paths and take a step, marking the stepping stone for backtracking as well as preventing repetition. (Put a wall on your steps..?)
  
  If no possible steps are found, backtrack.
  
## English Algorithm and/or Pseudocode.
  Base case:
  
  - if treasure found {solved, return true;}.
  
  - if all stepping stones are marked {return false;}.
             
  Recursive case: If there is a split, invoke recursive abstraction. (See recursive abstraction.)
  
## Class(es), with Fields and Methods
  Maze class: Double integer array maze. Treasure. Explorer. Wall. Stepping stone. Directions. toString.
  
  Maze solver class: Traversing method that includes everything above is in here.

## Version *n* Wishlist
  - All solutions.
  
  - Shortest path.

  - Snapshot(?)
