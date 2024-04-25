import java.sql.SQLOutput;

public class MainLinkedList {
    public static void main(String[] args) {

        Node firstNode = new Node(25);
        LinkedList list = new LinkedList(firstNode);


        list.addLast(new Node(12));
        //  list.displayList();
        System.out.println("Is list empty?  " + list.isEmpty());


        Node newFirstNode = new Node(35);

        list.addFirst(newFirstNode);

//        list.displayList();
//        System.out.println(list.size);
//
        // list.RemoveLast();

        System.out.println(list.findPrevious(firstNode));
        // list.displayList();
    }
}