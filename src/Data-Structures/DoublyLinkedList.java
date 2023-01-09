
public class DoublyLinkedList {
        ListNode head;
        ListNode tail;
      
        public void addNode(int val) {
          ListNode newNode = new ListNode(val);
          if (head == null) {
            head = newNode;
            tail = newNode;
          } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
          }
        }
      
        public void removeNode(ListNode node) {
          if (node.prev != null) {
            node.prev.next = node.next;
          } else {
            head = node.next;
          }
      
          if (node.next != null) {
            node.next.prev = node.prev;
          } else {
            tail = node.prev;
          }
        }
}

class ListNode {
  int val;
  ListNode prev;
  ListNode next;

  ListNode(int val) {
    this.val = val;
  }
}
