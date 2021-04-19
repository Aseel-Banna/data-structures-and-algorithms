package data.structure;

import java.io.IOException;
import java.util.LinkedList;

public class Library <T>{
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
        Node previous;
        Node last;
        int data;
        public Node(int v){
            value = v;
            next = null;
            previous = null;
            last = null;
            data = v;
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

    public void append(int val) {
        Node value = new Node(val);
        if (head == null) {
            head = value;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = value;
        }
    }

    public void insertAfter(int value, int newValue){
        Node node = new Node(newValue);
        Node current = head;
        while(current.value != value && current.next != null){
            current = current.next;
        }
        node.next = current.next;
        current.next = node;
    }

    public String toString() {
        Node currNode = head;
        String result = "";

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

    public void insertBefore(int value, int newValue){
        if (head.value == value) {
            insert(newValue);
        } else {
            Node node = new Node(newValue);
            Node current = head;
            while (current.next != null && current.next.value != value) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
    }

    public int returnValue(int index) throws IOException {
        LinkedList<Node> linkedList = new LinkedList<>();

        Node current = head;
        int count = 0;
        while (current != null)
        {
            if (count == index)
                return current.data;
            count++;
            current = current.next;
        }
        if(index< 0 || index > linkedList.size()) return -1;


        assert (false);
        return 0;
    }

    public void zipLists(Library q) {
        Node p_curr = head, q_curr = q.head;
        Node p_next, q_next;
        if (p_curr.next == null) {
            p_curr.next = q_curr;
            head =  p_curr;
        }else{
        while (p_curr != null && q_curr != null) {

            p_next = p_curr.next;
            q_next = q_curr.next;

            q_curr.next = p_next;
            p_curr.next = q_curr;

            p_curr = p_next;
            q_curr = q_next;
        }
        }

        q.head = q_curr;
    }

}
