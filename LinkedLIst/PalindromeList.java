package LinkedLIst;

class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    next = null;
  }
}

public class PalindromeList {
  static Node head;

  static Node middle(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

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

  static boolean isPalindrome(Node head) {
    if (head == null) return true;

    Node mid = middle(head);
    Node last = reverseList(mid);
    Node current = head;

    while (last != null) {
      if (last.data != current.data) {
        return false;
      }

      last = last.next;
      current = current.next;
    }
    return true;
  }

  public static void main(String[] args) {
    PalindromeList list = new PalindromeList();

    PalindromeList.head = new Node(1);
    PalindromeList.head.next = new Node(2);
    PalindromeList.head.next.next = new Node(2);
    PalindromeList.head.next.next.next = new Node(1);

    System.out.println(list.isPalindrome(head));
  }
}
