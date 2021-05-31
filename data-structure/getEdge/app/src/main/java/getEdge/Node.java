package getEdge;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {

    public T value;
    Node<T> next;
    public List<Edge<T>> neighbors;

    public Node(T value) {
        this.value = value;
        this.neighbors = new ArrayList<>();
    }

    public String toString() {
        return "Node: " + this.value;
    }
}
