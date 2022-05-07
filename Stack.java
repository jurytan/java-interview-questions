public class Stack {
    Node top;
    int length = 0;

    public Stack() {
        this.top = new Node(-1);
     }

    public Stack(Node top) {
       this.top = top;
    }

    public void push(Node newTop) {
        if (top != null) {
            newTop.next  = top;
        }
        top = newTop;
        length++;
    }

    public void push(int value) {
        Node newTop = new Node(value);
        newTop.next  = top;
        top = newTop;
        length++;
    }

    public int pop() {
        int result = top.value;
        top = top.next;
        length--;
        return result;
    }

}