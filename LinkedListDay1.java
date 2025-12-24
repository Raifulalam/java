public class LinkedListDay1 {
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

        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }

}
