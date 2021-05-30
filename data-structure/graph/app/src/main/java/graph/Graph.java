package graph;

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
}