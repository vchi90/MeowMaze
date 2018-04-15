# MeowMaze
  To meow a maze is to solve a maze.
## Personnel
  Vincent Chi, En Yu Zhang
## Statement of Problem
  To find the boolean value to the statement: “there exists one or more paths through a maze starting at a designated beginning and ending at multiple treasures”.
## Recursive Abstraction
  When I'm asked to traverse a maze from a designated beginning to find a treasure, the recursive abstraction can find a possible path from a step adjacent to the starting point to the treasure. 

## Base Cases
  Base case:
  
  - if (explorer) on treasure {solved, return true;}. 
  
  - if (explorer) on wall {return false;}.
  
## English Algorithm and/or Pseudocode.
Given a maze problem, the solver method will first check for the base cases:

```java
int solutions == 0
if explorer on treasure {
    return true;
    }
else if explorer on wall {
    return false;
    }
else {
    for each directions {
        drop a wall;
        take a snapshot;
        move;
        if recursive abstraction{
            solutions++;
            display;
            }
        else {
            restore snapshot;
            }
        }
    if solutions > 0 {
        return true;
        }
    return false;
    }

```

  The end product should be a solved maze.
  
## Class(es), with Fields and Methods
  Maze class: Double integer array maze. 
   - Treasure
   
   - Explorer
   
   - Wall
   
   - Stepping stone
   
   - Directions
   
   - toString
  
  Maze solver class: Traversing method that includes everything above is in here.

## Version *n* Wishlist
  
  - Shortest path.

## Known Bugs
  - 64 Max Maze Size
 
## v1
- solved maze is now displayed
