package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {

    Node<T> overallRoot;


    ArrayList<T> values;

    public BinaryTree(){
        this.overallRoot = null;
    }

    public BinaryTree(Node root){
        this.overallRoot = root;
    }

    public ArrayList<T> preOrder(){
        values = new ArrayList<T>();
        return preOrder(overallRoot);
    }

    public ArrayList<T> inOrder(){
        values = new ArrayList<>();
        return inOrder(overallRoot);
    }

    public ArrayList<T> postOrder(){
        values = new ArrayList<>();
        return postOrder(overallRoot);
    }

    private ArrayList<T> preOrder(Node<T> root){
        if(root == null){
            return null;
        }

        values.add(root.value);
        preOrder(root.left);
        preOrder(root.right);

        return values;
    }

    private ArrayList<T> inOrder(Node<T> root){
        if(root == null){
            return null;
        }

        inOrder(root.left);
        values.add(root.value);
        inOrder(root.right);

        return values;

    }

    private ArrayList<T> postOrder(Node<T> root){
        if(root == null){
            return null;
        }

        postOrder(root.left);
        postOrder(root.right);
        values.add((T) root.value);
        return values;
    }

    public int findMaximumValue(){
        if (this.overallRoot == null){
            return 0;
        }
        values = new ArrayList<>();
        values = this.postOrder();
        int max = (Integer) this.overallRoot.value;
        for (Integer i = 0; i < values.size(); i++){
            if (max <(Integer) values.get(i)) {
                max = (Integer) values.get(i);
            }
        }
        return max;
    }

    public ArrayList<T> breadthFirst(){
        values = new ArrayList<>();

        if(overallRoot == null){
            return values;
        }

        if(overallRoot != null) {

            Queue nodes = new LinkedList();
            nodes.offer(overallRoot);

            while (!nodes.isEmpty()) {
                Node<T> currentNode = (Node<T>) nodes.poll();
                values.add(currentNode.value);
                if (currentNode.left != null) {
                    nodes.offer(currentNode.left);
                }

                if (currentNode.right != null) {
                    nodes.offer(currentNode.right);
                }

            }
        }

        return values;
    }

    public int sumOfOddNodes(){
        if (this.overallRoot == null){
            return 0;
        }
        values = new ArrayList<>();
        values = this.postOrder();
        int sum = 0;
        for (Integer i = 0; i < values.size(); i++){
            if ((Integer) values.get(i)%2 != 0) {
                sum = sum + (Integer) values.get(i);
            }
        }
        return sum;
    }
}
