public class PancakeStackDriver {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        int value = stack.pop();
        while(value != -1) {
            System.out.println(value);
            value = stack.pop();
        }
    }
}