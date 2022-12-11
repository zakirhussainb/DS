***
           Graphs
***
##### Graph
* Graph is defined as a set of vertices and edges, G = (V,E)

##### Directed Graph
* Def:- If the edges are having direction then it is called as directed graph.
* Outgoing from 1 and incoming on 4 -> Incident from 1 and incident on 4.
* Parallel Edges:- Pair of edges between two vertices.
* In-degree:- Number of edges coming to vertex.
* Out-degree:- Number of edges going from the vertex.
* Adjacent vertices:- If there are two vertices connected by the same edge.

##### Simple DiGraph
* Def:- There are no self-loops and no parallel edges.

##### Graph/Non-Directed Graph
* No directed edges are present.
* There is no in-degree or out-degree here, only degree.
* The edges are considered in both the directed, it is not a parallel edge, but rather it is a non-directed edge.

##### Non-Connected Graph
* More than one components that are non-connected.
* A graph is having connected components.
* On removing a vertex, if the graph is being divided into multiple components, then those vertices are called 
articulation points.

##### Strongly Connected
* In a directed graph, if you start from a vertex and reach every other vertex. There is a path between every pair
of vertices or from any starting vertex you can reach all other vertices.
* Strongly is the term used for Directed Graph.
* Path is set of all vertices between a pair of vertices.

##### Directed Acyclic Graph
* This are directed graphs and there are no cycles in it. If you start from any vertex you cannot reach the same vertex
in any way.

##### Topological Ordering
* In a DAG we can arrange all the vertices linearly in a single line, such that the edges are going 
only in forward direction.
* If you can do this type of arrangement, then it is called topological ordering of vertices. This is possible only
in DAG.

***
           Representation of Graphs
***

##### Adjacency Matrix
* Refer problems

##### Adjacency List
* Refer problems

##### Weighted Graph
* Adj Matrix -> Instead of marking the edge as '1', mark the cost/weight of edges, Cost Adjacency Matrix.
* Adj List -> Inside the node itself, we must mark the cost/weight of the edge.


***
           Graph Traversals
***

##### Breadth First Search
* You can start traversal from any vertex
* When you visit a vertex you must explore all its adjacent vertices.
* While exploring you can visit them in any order.
* Two important points:-
    * **Visiting** a vertex
    * **Exploring** its neighbours

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

NOTE:- Spanning Tree Rule:- The tree must be connected and it must not have any cycles.
***
           Minimum Cost Spanning Tree
***
1. Out of the number of spanning trees that can be formed from a given graph, we need to find out the
minimum cost spanning tree out of all the spanning trees.
2. MST - The spanning tree with least total weight/cost, when adding all of its edges.

           Prim's Algorithm for finding MST
Rules
1. This must be a Spanning Tree(Connected) and it must not have any cycles.(You must cover all the vertices).
2. Then it should be minimum cost.

***
           Union Find
***
Modeling the Connections

The Dynamic Connectivity Problem

Given a set of N objects

1. Union: connects two objects.
2. Find: is there a path connecting the two objects.
