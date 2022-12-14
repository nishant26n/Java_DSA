package LinkedLIst;

class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    next = null;
  }
}

public class ReverseList {
  static Node head;

  static Node reverseList(Node node) {
    Node prev = null;
    Node current = node;
    Node next = null;

    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    node = prev;
    return node;
  }

  void printList(Node node) {
    while (node != null) {
      System.out.println(node.data + " ");
      node = node.next;
    }
  }

  public static void main(String[] args) {
    ReverseList list = new ReverseList();

    list.head = new Node(5);
    list.head.next = new Node(15);
    list.head.next.next = new Node(4);
    list.head.next.next.next = new Node(20);

    System.out.println("Given Linked list");
    list.printList(head);
    head = list.reverseList(head);
    System.out.println("");
    System.out.println("Reversed linked list ");
    list.printList(head);
  }
}
