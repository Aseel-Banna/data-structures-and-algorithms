/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        BinaryTree<Integer> testInt= new BinaryTree<>();
        Node left = new Node(3, new Node(1), new Node(13));
        Node right = new Node(7, new Node(18), new Node(10));
        Node root = new Node(8, left, right);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(1);
        expected.add(13);
        expected.add(7);
        expected.add(18);
        expected.add(20);
        expected.add(8);

        testInt = new BinaryTree<>(root);
        System.out.println(testInt.sumOfOddNodes());
    }
}
