package utilities;

public class Node <T>{
    T value;
    Node<T> next;
    Node(T value){
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}