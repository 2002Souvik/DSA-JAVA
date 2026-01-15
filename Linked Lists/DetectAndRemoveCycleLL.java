public class DetectAndRemoveCycleLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    // private Node tail;

    public boolean detectCycle() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void removeCycle() {
        Node slow = head;
        Node fast = head;

        // First, detect the cycle
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                break;
            }
        }

        // If there is no cycle
        if(slow != fast) {
            return;
        }

        // Move slow to head and keep fast at meeting point
        slow = head;
        Node prev = null; // To keep track of the node before fast

        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the cycle by setting the next of the last node to null
        prev.next = null;
    }

    public static void main(String[] args) {
        DetectAndRemoveCycleLL ll = new DetectAndRemoveCycleLL();

        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(4);
        ll.head.next.next.next.next = ll.head.next; // Creating a cycle for testing

        if (ll.detectCycle()) {
            System.out.println("Cycle detected");
            ll.removeCycle();
            System.out.println("Cycle removed");
        } else {
            System.out.println("No cycle detected");
        }
    }
}
