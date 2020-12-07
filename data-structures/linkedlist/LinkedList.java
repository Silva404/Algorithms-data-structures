class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // insert a new node at first position
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    // add a node at given position
    public void addNodeAtGivenPosition(Node old_node, int new_data) {
        if (old_node == null) {
            return;
        }

        Node newNode = new Node(new_data);
        newNode.next = old_node.next;
        old_node.next = newNode;
    }

    public void addNodeAtTheEnd(int new_data) {
        Node new_node = new Node(new_data);
        Node lastNode = head;
        new_node.next = null;

        while (lastNode != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = new_node;
        return;
    }

    // linkelist with 3 nodes
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        linkedList.head.next = second;
        second.next = third;

        linkedList.printList();
    }
}