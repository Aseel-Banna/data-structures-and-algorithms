package graph;

public class Edge<T> {

    Node source;
    Node destination;
    int weight;
    public Node<T> node;

    public Edge (Node node){
        this.source = node;
        this.weight = 0;
        this.node = node;
    }

    public Edge (Node source, Node destination, int weight){
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public Node<T> getNode() {
        return node;
    }
}
