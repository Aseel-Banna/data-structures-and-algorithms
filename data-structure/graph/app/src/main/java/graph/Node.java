package graph;

import java.util.HashSet;

public class Node <T>{
    T value;
    Node<T> next;
    public HashSet<Edge> neighbors;

    Node(T value){
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    public boolean addNeighbor(Node<T> node){
        Edge edge = new Edge(node);
        this.neighbors.add(edge);
        return true;
    }

    public boolean addNeighbor(Node<T> node1,Node<T> node2 ,int weight){
        Edge edge = new Edge(node1,node2, weight);
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

    public int getCost(Node<T> to){
        for(Edge ed: this.neighbors){
            if(ed.node.value.equals(to.value)){
                return ed.weight;
            }
        }
        return 0;
    }

}