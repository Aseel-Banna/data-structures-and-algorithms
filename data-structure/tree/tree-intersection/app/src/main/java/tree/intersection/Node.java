package tree.intersection;

public class Node {
    protected int data;
    protected Node left;
    protected Node right;

    public Node (int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }


    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
