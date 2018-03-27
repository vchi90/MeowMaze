# MeowMaze
  To meow a maze is to solve a maze.
## Statement of Problem
  To find the boolean value to the statement:
  "There exists one path through a maze starting at a designated beginning that ends at the treasure".
## Personnel
  Vincent Chi
  En Yu Zhang
## Recursive Abstraction
  The recursive abstraction can check for a treasure throughout a given path (or direction).
  
## English Algorithm and/or Pseudocode.
  Base case: if treasure found {solved}. (Snapshot(?))
             
  else {backtrack}. Somehow find if maze has been thoroughly traversed and failed if so, then return false.
             
  Recursive case: If there is a split, invoke recursive abstraction for each of the paths.
  

