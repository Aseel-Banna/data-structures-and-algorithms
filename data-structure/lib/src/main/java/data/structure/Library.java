/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package data.structure;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    Node head;
    public Library(){
        head = null;
    }

    static class Node {

        int value;
        Node next;
        public Node(int v){
            value = v;
            next = null;
        }
    }


    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        }else{
            node.next = head;
            head = node;
        }
    }

    public String toString() {
        Node currNode = head;
        String result = "";
        System.out.print("\"");

        while (currNode != null) {
            result+="{" + currNode.value + "} -> ";
            currNode = currNode.next;
        }

        return result + "Null";
    }

    public boolean includes(int x) {
        Node currNode = head;
        while (currNode != null)
        {
            if (currNode.value == x)
                return true;
            currNode = currNode.next;
        }
        return false;
    }
}