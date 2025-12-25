public class deletionLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static void main(String[] args) {
        Node head = new Node(20);
        head.next = new Node(30);
        head.next.next = new Node(40);
        head.next.next.next = new Node(50);

        // Deletion at beginning
        head = head.next;
        // Deletion at last
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;

        // Deletion at given position (e.g., position 1)
        int position = 1;
        current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;

        // print all
        current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}
