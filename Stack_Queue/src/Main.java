public class Main {
    public static void main(String[] args) {


        Stack stack = new Stack(8);
        // Stack: 8

        stack.push(1);
        // Stack: 1, 8

        stack.push(10);
        // Stack: 10, 1, 8

        stack.push(20);
        // Stack: 20, 10, 1, 8

        stack.push(30);
        // Stack: 30, 20, 10, 1,  8

        //show stack elements
        stack.displayStack();


        //remove top element
        int top = stack.pop();  //removes top:30
        System.out.println("\nAfter popping top element: " + top);
        stack.displayStack(); // 20, 10, 1, 8

    }
}