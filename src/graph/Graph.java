package graph;

import java.util.HashSet;

public class Graph {
    public int v;
    public HashSet<Edge> edges;



    public Graph(int v) {
        this.v = v;
        edges = new HashSet<>();
    }

    public void addEdge(int source, int destination, int value) {
        edges.add(new Edge(source, destination, value));
    }
    public class Edge {
        public int source;
        public int destination;
        public  int value;

        public Edge(int source, int destination, int value) {
            this.source = source;
            this.destination = destination;
            this.value = value;
        }
    }
}



