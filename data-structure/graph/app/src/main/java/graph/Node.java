package graph;

import java.util.HashSet;

public class Node <T>{
    T value;
    public HashSet<Node<T>> neighbors;

    Node(T value){
        this.value = value;
        this.neighbors = new HashSet<Node<T>>();
    }

    public boolean addNeighbor(Node<T> node){
        Node<T> edge = new Node(node);
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