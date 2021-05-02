package utilities;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FizzBuzzTreeTest<T> {
    private FizzBuzzTree<Integer> testInt= new FizzBuzzTree<>();
    @Test
    public void breadthFirstEmptyTree() {
        FizzBuzzTree<String> emptyTree = new FizzBuzzTree<>();
        emptyTree.fizzBuzz(null);
        assertNull("Should be null tree", emptyTree.preOrder());

    }

    @Test
    public void testFizzBuzz() {
        NodeTree left = new NodeTree(1, new NodeTree(6), new NodeTree(7));
        NodeTree right = new NodeTree(5, new NodeTree(15), new NodeTree(9));
        NodeTree root = new NodeTree(2, left, right);

        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(6);
        array.add(7);
        array.add(1);
        array.add(15);
        array.add(9);
        array.add(5);
        array.add(2);

        ArrayList<T> expected = new ArrayList<T>();
        expected.add((T) "2");
        expected.add((T) "1");
        expected.add((T) "Fizz");
        expected.add((T) "7");
        expected.add((T) "Buzz");
        expected.add((T) "FizzBuzz");
        expected.add((T) "Fizz");

        testInt = new FizzBuzzTree<>(root);
        System.out.println(testInt.preOrder());
        System.out.println(testInt.fizzBuzz(array));
        assertEquals( expected, testInt.fizzBuzz(array));
    }

    @Test
    public void testFizzBuzzOneNode() {
        NodeTree left = new NodeTree(null);
        NodeTree right = new NodeTree(null);
        NodeTree root = new NodeTree(2);

        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);

        ArrayList<T> expected = new ArrayList<T>();
        expected.add((T) "2");

        testInt = new FizzBuzzTree<>(root);
        System.out.println(testInt.preOrder());
        System.out.println(testInt.fizzBuzz(array));
        assertEquals( expected, testInt.fizzBuzz(array));
    }

    @Test
    public void testFizzBuzzNoNodeDivide() {
        NodeTree left = new NodeTree(1, new NodeTree(4), new NodeTree(7));
        NodeTree right = new NodeTree(8, new NodeTree(11), new NodeTree(13));
        NodeTree root = new NodeTree(2, left, right);

        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(4);
        array.add(7);
        array.add(1);
        array.add(11);
        array.add(8);
        array.add(13);
        array.add(2);

        ArrayList<T> expected = new ArrayList<T>();
        expected.add((T) "2");
        expected.add((T) "1");
        expected.add((T) "4");
        expected.add((T) "7");
        expected.add((T) "8");
        expected.add((T) "11");
        expected.add((T) "13");

        testInt = new FizzBuzzTree<>(root);
        System.out.println(testInt.preOrder());
        System.out.println(testInt.fizzBuzz(array));
        assertEquals( expected, testInt.fizzBuzz(array));
    }

}
