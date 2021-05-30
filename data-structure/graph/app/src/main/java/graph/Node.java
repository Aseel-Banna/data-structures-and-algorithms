package graph;

import java.util.HashSet;

public class Node <T>{
    T value;
    Node<T> next;
    public HashSet<Edge> neighbors;

    Node(T value){
        this.value = value;
        this.neighbors = new HashSet<Edge>();
    }

    public boolean addNeighbor(Node<T> node){
        Edge edge = new Edge(node);
        this.neighbors.add(edge);
        return true;
    }


    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    public T getNodeValue(Node n){
        return (T) n.value;
    }

}