public class arrayTolinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 7, 5, 12, 8, 9, 14 };
        Node head = null;
        Node tailNode = null;
        Node mover = head;
        for (int n : arr) {
            Node newNode = new Node(n, tailNode);
            if (head == null) {
                head = newNode;
                mover = head;
            } else {
                mover.next = newNode;
                mover = mover.next;
            }
        }

        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }

}
