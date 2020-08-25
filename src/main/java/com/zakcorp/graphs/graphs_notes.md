***
           Spanning Tree
***
1. Given a graph, find the number of spanning trees that can be generated out of that graph.
> Eg. Given a graph with V -> 4 and E -> 6 (V - vertices and E - edges)
Then according to the definition of Spanning Trees, for a graph to be ST, there must be V-1
edges, so V = 4 and E = 3

> We can find the solution in 
> <sup>6</sup>C<sub>3</sub> - 4 = 20 - 4 = 16 possible spanning trees
> Here "4" denotes the number of cycles that can be formed with 3 edges, 
> so we need to remove those.

***
           Minimum Cost Spanning Tree
***
1. Out of the number of spanning trees that can be formed from a given graph, we need to find out the
minimum cost spanning tree out of all the spanning trees.
2. MST - The spanning tree with least total weight/cost, when adding all of its edges.