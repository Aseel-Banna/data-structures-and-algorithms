package graph;

import java.util.*;

public class BreadthFirst<T> {

    Graph graph = new Graph();

    public LinkedList<Node> breadthFirstSearch(Node start) {

        Queue breadth = new LinkedList();
        LinkedList nodes = new LinkedList();
        HashSet<Node> visited = new HashSet<>();

        breadth.add(start);
        visited.add(start);

        while (!breadth.isEmpty()) {
            Node front = (Node) breadth.remove();
            nodes.add(front);

            for (Edge neighbor: (HashSet<Edge>) front.neighbors) {
                if (!visited.contains(neighbor.node)) {
                    breadth.add(neighbor.node);
                    visited.add(neighbor.node);
//                    front = front.next;
                }
            }

        }
        return nodes;
    }
}
