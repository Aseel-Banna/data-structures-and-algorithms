package utilities;

import java.util.Queue;

public class AnimalShelter<T> {

    Node<T> front;
    Node<T> rear;


    public T enqueue(T animal) {
        Node<T> newNode = new Node<T>(animal);

        if (this.front == null) {
            this.front = newNode;
            this.rear = newNode;

        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
        return animal;
    }

    public String dequeue(String pref) {
        Node<T> temp = this.front;
        if (temp == null) return null;
        if (pref != "dog" && pref != "cat") return "It should be cat or dog!";
        else{
            this.front = this.front.next;
        }
        return pref;
    }

}

