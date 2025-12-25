public class SearchInLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

    public static void main(String[] args) {
        Node head = new Node(10, null);
        head.next = new Node(20, null);
        head.next.next = new Node(30, null);
        head.next.next.next = new Node(40, null);
        head.next.next.next.next = new Node(50, null);
        int stp = 0;

        int target = 30;
        Node current = head;
        boolean found = false;
        while (current != null) {
            if (current.data == target) {
                found = true;
                break;
            }
            stp++;
            current = current.next;
        }
        if (found) {
            System.out.println("Element " + target + " found in the linked list." + " at position " + stp);
        } else {
            System.out.println("Element " + target + " not found in the linked list.");
        }
    }
}
