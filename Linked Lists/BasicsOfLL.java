public class BasicsOfLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) { // O(1)
        // Create a new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // newNode next points to head
        newNode.next = head;
        // head is now the newNode
        head = newNode;
    }

    public void addLast(int data) { // O(1)
        // Create a new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // tail next points to newNode
        tail.next = newNode;
        // tail is now the newNode
        tail = newNode;
    }

    public void print() { // O(n)
        if(head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        System.out.println("Hello, Basics of Linked Lists!");
        BasicsOfLL ll = new BasicsOfLL();
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(4);
        ll.print();
        ll.addLast(2);
        ll.print();
        ll.addLast(1);
        ll.print();
    }
}
