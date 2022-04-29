public class LinkedListWoes {
    public static void main(String[] args) {
        // init the nodes
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);

        // build out list
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node7);
        node7.setNext(node8);
        node8.setNext(node9);
        node9.setNext(node10);
        // add in a cycle
        // node10.setNext(node8);

        // let's check for a cycle
        Node hare = node1;
        Node tortoise = node1;

        while (hare.next.next != null && tortoise.next != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;
            if (tortoise.getValue() == hare.getValue()) {
                // return true;
                System.out.println("Cycle detected!");
                return;
            }
        }
        // return false;
        System.out.println("Get fked!");

    }
}

class Node {
    public int value;
    public Node next;

    public Node (int value) {
        this.value = value;
        next = null;
    }

    public int getValue() {
        return this.value;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
