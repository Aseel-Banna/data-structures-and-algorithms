package stack.and.queue;

public class Queue <T>{
    Node front;
    Node Rear;

    public Queue(T value) {
        this.front = new Node(value);
        this.Rear = this.front;
    }

    public Queue() {
    }

    public void enqueue(T value){
        try {
            if (Rear == null){
                front = new Node(value);
                Rear = front;
            }else {
                this.Rear.next = new Node(value);
                this.Rear = this.Rear.next;
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public Object dequeue(){
        Node firstNode = front;
        try {
            if (isEmpty())
                return new NullPointerException();
            if(front == Rear){
                Rear = null;
            }
            front = front.next;
            firstNode.next = null;
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        return firstNode;
    }

    public Object peek(){
        try {
            if (isEmpty())
                return new NullPointerException();
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        return front.value;
    }

    public boolean isEmpty(){
        return front == null;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", Rear=" + Rear +
                '}';
    }
}
