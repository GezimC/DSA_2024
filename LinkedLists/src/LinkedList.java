public class LinkedList {
    public Node head;
    public int size;

    public LinkedList(Node firstNode) {
        this.head = firstNode;
        this.size = 1;
    }

    public void addLast(Node newnode) {
        Node currentNode = this.head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newnode;
        this.size++;
    }

    public void displayList() {
        Node currentNode = this.head;

        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }

    }

    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }

        // ose nese se kem size e listes
//        if (this.head == null) {
//            return true;
//        }
//
        return false;

//        return this.size==0;
    }

    public void addFirst(Node newnode) {
        newnode.next = this.head;
        this.head = newnode;
        this.size++;
    }

    public void RemoveFirst() {
        if (this.size == 0) {
            System.out.println("List is empty");
        } else {
            this.head = this.head.next;
            this.size--;
        }


    }

    public void RemoveLast() {
        if (this.size == 0) {
            System.out.println("List is empty");
        }

        Node currentNode = this.head;
        // 1 next        2 next        3 null
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = null;

    }

    public int findFirst()
    {
        return this.head.data;
    }

    public int findLast()
    {
        Node currentNode = this.head;

        // 1 next   2 next    3 null
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        return currentNode.data;
    }


    public int findPrevious(Node node)
    {
        Node currentNode = this.head;
        //  1 next     2 next    3 next    4 next    5 null
        while (currentNode.next.data != node.data) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }
}

//to do:
/*
isEmpty()                                  -- checks if linkedlist is empty  --done
addFirst()                                 -- adds new node in beginning of the list --done
removeFirst()                              -- removes first element of the list   --done
removeLast()                               -- removes the last element of the list --done
addAfterIndex(int index, int data)         -- add new node after specific index
removeByIndex(int index)                   -- removes node at a specific index
findLast()                                 -- returns last node   --done
findFirst()                                -- returns first node   -- done
findByIndex(int index)                     -- finds a node by index
findPrevious(Node node)                    -- finds a previous node of given node
toArray() -> int[10,20,30]                 -- converts nodes data to an array
toLinkedList(int[] array)                  -- converts array to linked list
appendToLinkedList(int[] array)            -- appends an array to linked list
 */