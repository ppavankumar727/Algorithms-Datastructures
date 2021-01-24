package graph;

import java.util.ArrayList;

public class Graph {
    private boolean isWeighted;
    private boolean isDirected;
    private ArrayList<Vertex> vertices;

    public Graph(boolean isWeighted,boolean isDirected){
        this.isWeighted = isWeighted;
        this.isDirected = isDirected;
    }
    
}
