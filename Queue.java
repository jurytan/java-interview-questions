public class Queue {
    Node head;
    Node tail;

    public Queue() {
        this.head = null;
        this.tail = null;    
    }

    public void push(Node node) {
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
    }

    public void push(int value) {
        Node node = new Node(value);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
    }

    public int pop() {
        if (this.head != null) {
            int result = this.head.value;
            this.head = this.head.next;
            return result;
        }
        return -1;
    }
}