/*A linked list is a linear data structure in which each element is a separate object. 
Each element (node) in a linked list contains a data field and a reference (link) to the next node in the list. 
The last node in the list has a reference to null, indicating the end of the list. 
*/

public class LinkedList {
    // head of the list
    private Node head;

    // constructor to create an empty list
    public LinkedList() {
    head = null;
    }

    // insert a new node at the beginning of the list
    public void insertAtHead(int data) {
    Node newNode = new Node(data);
    newNode.setNext(head);
    head = newNode;
    }

    // delete the first node of the list
    public void deleteFromHead() {
    head = head.getNext();
    }

    // find the length of the list
    public int length() {
    int length = 0;
    Node current = head;
    while (current != null) {
    length++;
    current = current.getNext();
    }
    return length;
    }

    // find the node at a given position
    public Node find(int position) {
    if (position < 0) {
    return null;
    }
    Node current = head;
    for (int i = 1; i < position; i++) {
    if (current.getNext() == null) {
    return null;
    }
    current = current.getNext();
    }
    return current;
    }

    // delete the node at a given position
    public void delete(int position) {
    if (position < 0 || position > length()) {
    return;
    }
    if (position == 1) {
    deleteFromHead();
    return;
    }
    Node current = find(position - 1);
    current.setNext(current.getNext().getNext());
    }
    }

    class Node {
    // data stored in the node
    int data;
    // reference to the next node in the list
    Node next;

    // constructor to create a node with no next node
    public Node() {
    next = null;
    data = 0;
    }

    // constructor to create a node with data and a next node
    public Node(int data) {
    this.data = data;
    next = null;
    }

    // set the next node of the current node
    public void setNext(Node next) {
    this.next = next;
    }

    // get the next node of the current node
    public Node getNext() {
    return next;
    }

    // set the data of the current node
    public void setData(int data) {
    this.data = data;
    }

    // get the data of the current node
    public int getData() {
    return data;
    }
}
  