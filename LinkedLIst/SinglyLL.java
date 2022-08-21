package LinkedLIst;

public class SinglyLL {

  class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public Node head = null;
  public Node tail = null;

  void addNode(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
  }

  void display() {
    Node current = head;

    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    System.out.println("Node of singly linked list: ");
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    SinglyLL sList = new SinglyLL();

    sList.addNode(1);
    sList.addNode(2);
    sList.addNode(3);
    sList.addNode(4);
    sList.addNode(5);

    sList.display();
  }
}
