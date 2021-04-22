package tree;

public class BinarySearchTree<T extends Comparable<? super T>> extends BinaryTree<T> {

    public void add(T value){
        this.overallRoot = add(overallRoot, value);
    }
    public boolean contains (T value){
        if(overallRoot == null){
            System.out.println("Tree is Empty!");
            return false;
        }
        return contains(overallRoot, value);
    }

    private Node<T> add(Node<T> root, T value){
        if(root == null){
            root =  new Node<T>(value);
        } else{
            int compare = value.compareTo(root.value);
            if(compare > 0){
                root.right = add(root.right, value);
            } else if(compare < 0){
                root.left = add(root.left, value);
            }

        }

        return root;
    }
    private boolean contains(Node<T> root, T value){
        if(root == null){
            return false;
        } else{
            int compare =  value.compareTo(root.value);
            if(compare == 0){
                return true;
            } else if(compare < 0){
                return contains(root.left, value);
            } else{
                return contains(root.right, value);
            }
        }
    }

}
