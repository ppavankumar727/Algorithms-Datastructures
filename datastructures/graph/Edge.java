package graph;
public class Edge {
    private Vertex start;
    private Vertex end ;
    private Integer weight;

    public Edge (Vertex start , Vertex end,Integer weight){
        this.start = start;
        this.end = end;
        this.weight = weight;
    }
    public Vertex getEnd(){
        return this.end;
    }
    public Vertex gedStart(){
        return this.start;
    }
    public Integer getWeight(){
        return this.weight;
    }
}