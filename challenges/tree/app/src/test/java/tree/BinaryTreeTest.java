package tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class BinaryTreeTest {

    private BinaryTree<Integer> testInt= new BinaryTree<>();

    @Test
    public void testTreeInit(){
        assertNull("Tree should be empty!", testInt.overallRoot);
    }

    @Test
    public void testAddNode(){
        Node root = new Node(2);
        testInt = new BinaryTree<>(root);
        assertEquals("Value should be the same as root data", Integer.valueOf(2), testInt.overallRoot.value);

    }
    @Test
    public void testTreesChildren(){

        Node left = new Node(1);
        Node right = new Node(3);
        Node root = new Node(2, left, right);
        testInt = new BinaryTree<>(root);
        assertEquals("Value should be the same as root data", Integer.valueOf(2), testInt.overallRoot.value);
        assertEquals("Value should be the same as left data", Integer.valueOf(1), testInt.overallRoot.left.value);
        assertEquals("Value should be the same as right data", Integer.valueOf(3) , testInt.overallRoot.right.value);

    }


    @Test
    public void testPreOrder() {
        Node left = new Node(1, new Node(6), new Node(7));
        Node right = new Node(3, new Node(8), new Node(9));
        Node root = new Node(2, left, right);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(1);
        expected.add(6);
        expected.add(7);
        expected.add(3);
        expected.add(8);
        expected.add(9);

        testInt = new BinaryTree<>(root);
        assertEquals("Value should do pre-order", expected, testInt.preOrder());
    }

    @Test
    public void testPostOrder() {
        Node left = new Node(1, new Node(6), new Node(7));
        Node right = new Node(3, new Node(8), new Node(9));
        Node root = new Node(2, left, right);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(6);
        expected.add(7);
        expected.add(1);
        expected.add(8);
        expected.add(9);
        expected.add(3);
        expected.add(2);

        testInt = new BinaryTree<>(root);
        assertEquals( expected, testInt.postOrder());
    }

    @Test
    public void testInOrder() {
        Node left = new Node(1, new Node(6), new Node(7));
        Node right = new Node(3, new Node(8), new Node(9));
        Node root = new Node(2, left, right);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(6);
        expected.add(1);
        expected.add(7);
        expected.add(2);
        expected.add(8);
        expected.add(3);
        expected.add(9);

        testInt = new BinaryTree<>(root);
        assertEquals( expected, testInt.inOrder());
    }


    @Test
    public void testPreOrderEmpty(){
        assertNull("Tree is Empty!", testInt.preOrder());

    }

    @Test
    public void inOrderEmpty(){
        assertNull("Tree is Empty!", testInt.inOrder());

    }


    @Test
    public void postOrderEmpty(){
        assertNull("Tree is Empty!", testInt.postOrder());

    }
}
