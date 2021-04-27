package utilities;

public class NodeTree<T> {
    T value;
    NodeTree<T> left;
    NodeTree<T> right;
    NodeTree(T value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public NodeTree (T value,  NodeTree<T> left,  NodeTree<T> right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
