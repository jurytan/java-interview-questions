public class QueueDriver {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        int popped = queue.pop();
        queue.push(5);
        queue.push(6);
        queue.push(7);
        queue.push(8);

        int value = queue.pop();
        while(value != -1) {
            System.out.println(value);
            value = queue.pop();
        }

        System.out.println("THIS IS THE FIRST MAN OUT: " + popped);
    }
}