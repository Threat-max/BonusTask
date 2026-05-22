TOLENDI ARSEN
Project structure
src/
├── Main.java
└── graph/
    ├── Edge.java
    └── Graph.java
How the algorithm works
Dijkstra's is a greedy algorithm — it always picks the nearest unvisited vertex and updates distances to its neighbors. It keeps doing this until all vertices are visited.
The main constraint: edge weights must be non-negative. Otherwise the algorithm breaks.
Simple idea: start from source → relax neighbors → repeat until done.

Features
Weighted directed graph
Adjacency list representation
Custom Edge class
Dijkstra's algorithm with O(n²) complexity (no priority queue)
Prints shortest distances from source to all vertices

Core classes
Edge.java
Represents a single edge — where it goes and how much it costs:
int to;
int weight;
Graph.java
Stores the graph as an adjacency list and contains the main algorithm. Key parts:

addEdge(int from, int to, int weight) — adds a directed edge
dijkstra(int start) — runs the algorithm, returns distance array

Main.java
Entry point. Builds a sample graph, calls dijkstra(), and prints results.

SCREENSHOTS
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/35c95c05-e9df-4b4f-a9d7-877d7e319378" />
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/4c474e55-60ec-429d-ab41-45e691ab7f25" />
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/bdb373e8-a667-4e68-bfb6-9f303e8189ef" />
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/a48ed0eb-f5ff-43c5-ae1a-bf17af764336" />
RESULT
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/9904f625-af45-432c-bf57-d9d676a971ea" />

