public class RecursiveSearch {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int recSearch(Node head, int key) {
        return recSearchHelper(head, key, 0);
    }

    private int recSearchHelper(Node node, int key, int index) {
        if (node == null) {
            return -1;
        }
        if (node.data == key) {
            return index;
        }
        return recSearchHelper(node.next, key, index + 1);
    }

    public static void main(String[] args) {
        RecursiveSearch ll = new RecursiveSearch();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.print();

        System.out.println(ll.recSearch(ll.head, 3));
    }    
}
