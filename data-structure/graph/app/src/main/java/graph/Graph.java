package graph;

import java.security.InvalidParameterException;
import java.util.*;

public class Graph<T> {

    HashSet<Node<T>> vertexes;

    public Graph() {
        this.vertexes = new HashSet<>();
    }

    public Node AddNode(T data){
        Node<T> node = new Node<>(data);
        if (node != null){
            vertexes.add(node);
        }
        return node;
    }

    public boolean AddEdge(Node<T> node1, Node<T> node2, int weight){
        if (node1 == null || node2 == null){
            System.out.println("One of the node is null!");
            return false;
        }
        if(!vertexes.contains(node1) || !vertexes.contains(node2)){
            vertexes.add(node1);
            vertexes.add(node2);
            System.out.println("Node with value " + node1.value + " & Node with value " + node2.value + " has an edge with weight " + weight);
            return true;
        }
        return false;
    }

    public void addEdge(Node<T> n1, Node<T> n2, int weight) throws NoSuchElementException {
        if (this.vertexes.contains(n1) && this.vertexes.contains(n2)) {
            if(n1 == n2) {
                throw new InvalidParameterException("An edge must be added between two unique Nodes");
            } else {
                n1.neighbors.add(new Edge(n2, weight));
                n2.neighbors.add(new Edge(n1, weight));
            }
        } else {
            throw new NoSuchElementException("Could not find one of the provided Nodes in the graph");
        }
    }

    public Set<Node<T>> GetNodes(){
        return vertexes;
    }

    public HashSet<Edge> GetNeighbors(Node<T> node){
        return node.neighbors;
    }

    public int size(){
        return vertexes.size();
    }

    public String isEmpty(){
        if (vertexes.size() == 0){
            return null;
        }
        return "Graph is not empty!";
    }

    public Node<T> getNode(T data){
        for(Node<T> node: vertexes){
            if(node.value.equals(data)){
                return node;
            }
        }
        return null;
    }

}