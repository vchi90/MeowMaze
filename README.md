# MeowMaze
  To meow a maze is to solve a maze.
## Personnel
  Vincent Chi, En Yu Zhang
## Statement of Problem
  To find the boolean value to the statement:
  
  "There exists an accessible treasure".
## Recursive Abstraction
  When I'm asked to traverse a maze to find a treasure, the recursive abstraction can identify the possible paths and take a step, putting a wall behind me.
  
  If there are more than one possible steps, take snapshots to refer to.
## Base Cases
  Base case:
  
  - if treasure found {solved, return true;}. (explorer on treasure)
  
  - if no possible paths and unused snapshots {return false;}.
  
  - if wall spawn, also return false;
## English Algorithm and/or Pseudocode.
Given a maze problem, the solver method will first check for the base cases:

```java
if explorer on treasure {
    return true;
}
else if explorer on wall {
    return false;
}
else {
    check directions, if more than 1 possible path, take snapshot.
    apply recursive abstraction
}
```

  The end product should be a solved maze.
  
## Class(es), with Fields and Methods
  Maze class: Double integer array maze. Treasure. Explorer. Wall. Stepping stone. Directions. toString. isLegal
  
  Maze solver class: Traversing method that includes everything above is in here.

## Version *n* Wishlist
  - All solutions.
  
  - Shortest path.

  - Snapshot(?)
