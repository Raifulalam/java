public class InsertonLinkedList {
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

        // insertion beginning
        Node newhead = new Node(100, head);
        head = newhead;
        // Inserting a new node with value 25 between 20 and 30
        Node current = head;
        while (current != null) {
            if (current.data == 20) {
                current.next = new Node(25, current.next);
                break;
            }
            current = current.next;
        }

        // insert at last
        current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(50, null);
        // print all
        current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }

}
