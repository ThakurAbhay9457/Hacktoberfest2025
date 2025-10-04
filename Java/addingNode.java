class LinkedList {
    Node head; 

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }


    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void insertAfter(int afterValue, int data) {
        Node newNode = new Node(data);
        Node current = head;
        while (current != null && current.data != afterValue) {
            current = current.next;
        }
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Node with value " + afterValue + " not found.");
        }
    }


    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtBeginning(0);
        list.insertAfter(1, 15);
        list.printList(); // Output: 0 1 15 2
    }
}
