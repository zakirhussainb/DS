***
           Dynamic Programming
***
#### Recursion
* ##### Make it work - Worst Case
    - visualize the problem as a tree
    - implement the tree using recursion
    - seed the base case
    - test it
    
#### Memoization
* ##### Make it efficient - Average Case
    - add a memo object
    - add a new base case to return memo values, don't change the existing base cases.
    - store return values(the logic) into the memo.
    
#### Tabulation
* ##### Make it more efficient - Best Case
    - visualize the problem as a tables
    - size the table based on the inputs
    - initialize the table with default values
    - seed the trivial answer into the table
    - iterate through the table
    - fill further positions based on the current position