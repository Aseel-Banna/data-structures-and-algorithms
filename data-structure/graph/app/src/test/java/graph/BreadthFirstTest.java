package graph;

import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BreadthFirstTest {

    @Test
    public void testBreadthFirst(){
        Graph<String> graph = new Graph<>();

        Node pandora = graph.AddNode("pandora");
        Node arendelle = (Node) graph.AddNode("arendelle");
        Node metroville = (Node) graph.AddNode("metroville");
        Node monstroplolis = (Node) graph.AddNode("monstroplolis");
        Node narnia = (Node) graph.AddNode("narnia");
        Node naboo = (Node) graph.AddNode("naboo");

        pandora.addNeighbor(arendelle);
        arendelle.addNeighbor(metroville);
        arendelle.addNeighbor(monstroplolis);
        metroville.addNeighbor(monstroplolis);
        metroville.addNeighbor(naboo);
        metroville.addNeighbor(narnia);
        arendelle.addNeighbor(monstroplolis);
        monstroplolis.addNeighbor(naboo);
        narnia.addNeighbor(naboo);

        LinkedList<Node> expected = new LinkedList<>();
        expected.add(pandora);
        expected.add(arendelle);
        expected.add(metroville);
        expected.add(monstroplolis);
        expected.add(naboo);
        expected.add(narnia);

        BreadthFirst breadthFirst1 = new BreadthFirst();
        assertEquals(expected, breadthFirst1.breadthFirstSearch(pandora));
    }



}
