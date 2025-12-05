public class BasicsOfLL {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int data) { 
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) { 
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) { 
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public int removeFirst() { 
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;

        if (size == 1) {
            head = tail = null;
            size = 0;
            return val;
        }

        head = head.next;
        size--;
        return val;
    }

    public int removeLast() { 
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node temp = head;

        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        int val = tail.data;
        tail = temp;
        tail.next = null;
        size--;

        return val;
    }

    public void print() { 
        if (head == null) {
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

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        BasicsOfLL ll = new BasicsOfLL();

        ll.addFirst(3);
        ll.addFirst(4);
        ll.addLast(2);
        ll.addLast(1);
        ll.add(2, 5);

        ll.print();

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();

        System.out.println("Size: " + ll.getSize());
    }
}
