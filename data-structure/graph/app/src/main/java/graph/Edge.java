package graph;

public class Edge {

    Node source;
    Node destination;
    int weight;

    public Edge (Node node){
        this.source = node;
        this.weight = 0;
    }

    public Edge (Node source, Node destination, int weight){
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}
