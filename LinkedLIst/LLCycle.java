package LinkedLIst;

import java.util.HashSet;
import java.util.LinkedList;

class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    next = null;
  }
}

public class LLCycle {
  static Node head;

  public static void pushData(int new_data) {
    Node newNode = new Node(new_data);
    newNode.next = head;
    head = newNode;
  }

  static boolean detectLoop(Node N) {
    HashSet<Node> loop = new HashSet<Node>();

    while (loop != null) {
      if (loop.contains(N)) return true;

      loop.add(N);

      N = N.next;
    }
    return false;
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.push(20);
    list.push(4);
    list.push(15);
    list.push(10);
  }
}
