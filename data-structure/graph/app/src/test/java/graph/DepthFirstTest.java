package graph;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class DepthFirstTest {

    @Test
    public void testBreadthFirst(){

    Graph<String> graph = new Graph<>();
    DepthFirst depthFirst = new DepthFirst();

    Node A = graph.AddNode("A");
    Node B = graph.AddNode("B");
    Node C = graph.AddNode("C");
    Node D = graph.AddNode("D");
    Node E = graph.AddNode("E");
    Node F = graph.AddNode("F");
    Node G = graph.AddNode("G");
    Node H = graph.AddNode("H");

    A.addNeighbor(B);
    B.addNeighbor(C);
    C.addNeighbor(G);
    G.addNeighbor(D);
    D.addNeighbor(E);
    E.addNeighbor(H);
    H.addNeighbor(F);

    LinkedList<Node> expected = new LinkedList<>();
        expected.add(A);
        expected.add(B);
        expected.add(C);
        expected.add(G);
        expected.add(D);
        expected.add(E);
        expected.add(H);
        expected.add(F);

        assertEquals(expected, depthFirst.depthFirstSearch(A));
}
}
