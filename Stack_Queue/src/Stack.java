public class Stack {

    public Element top;
    public int size;
    public int max_size = 100;

    public Stack(int data) {
        this.top = new Element(data);
        this.size = 1;
    }


    public void push(int data) {
        if (size == max_size) {
            System.out.println("Stack is full");
        }

        Element newElement = new Element(data);
        newElement.next = this.top;

        this.top = newElement;
        this.size++;
    }

    public int pop() {
        if (size == 0) {
            System.out.println("Nothing to pop, size is 0");
            return -999999;
        }

        int actualTop = this.top.data;

        this.top = this.top.next;
        this.size--;
        return actualTop;
    }

    public boolean isEmpty() {
        if (size == 0) return true;

        return false;
    }

    public boolean isFull() {
        if (this.size == max_size) return true;

        return false;
    }


    public void displayStack() {
        int i = 0;

        Element tempElement = this.top;

        while (tempElement != null) {
            System.out.printf("Elementi %d: %d \n", i, tempElement.data);
            tempElement = tempElement.next;
            i++;
        }
    }


}
