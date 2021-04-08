package Data.Structures;
import java.util.*;

public class LinkedList {

  public static void main(String[] args) {
    LinkedList list1 = new LinkedList();

    list1 = insert(list1, "a");
    list1 = insert(list1, "b");
    list1 = insert(list1, "c");

    toString(list1);

//     System.out.println(list1.head);
    if (list1.search(list1.head, "g"))
      System.out.println("true");
    else
      System.out.println("false");

    try {
      if(list1 != null){
        System.out.println("Has Data");
      }
    } catch(Throwable e){
      e = null;
      e.printStackTrace();
    }
  }

  Node head;

  static class Node {

    String data;
    Node next;

    Node(String d) {
      data = d;
      next = null;
    }
  }


  public static LinkedList insert(LinkedList list, String data) {
    Node new_node = new Node(data);
    new_node.next = null;

    if (list.head == null) {
      list.head = new_node;
    } else {
      Node last = list.head;
      while (last.next != null) {
        last = last.next;
      }

      last.next = new_node;
    }

    return list;
  }

  public static void toString(LinkedList list) {
    Node currNode = list.head;

    System.out.print("\"");

    while (currNode != null) {

      System.out.print("{" + currNode.data + "} -> ");
      currNode = currNode.next;
    }
    if (currNode == null) {
      System.out.println("Null\"");
    }
  }

  public static boolean search(Node head, String x) {
    Node currNode = head;    //Initialize current
    while (currNode != null)
    {
      if (currNode.data == x)
        return true;    //data found
      currNode = currNode.next;
    }
    return false;
  }

  }


