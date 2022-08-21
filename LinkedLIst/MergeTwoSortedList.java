package LinkedLIst;

public class MergeTwoSortedList {

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  static Node head;
  static Node temp;

  public static Node mergeTwoLists(Node l1, Node l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    // Head of the result list
    // Choose head which is smaller of the two lists
    if (l1.data < l2.data) {
      temp = head = new Node(l1.data);
      l1 = l1.next;
    } else {
      temp = head = new Node(l2.data);
      l2 = l2.next;
    }
    // Loop until any of the list becomes null
    while (l1 != null && l2 != null) {
      if (l1.data < l2.data) {
        temp.next = new Node(l1.data);
        l1 = l1.next;
      } else {
        temp.next = new Node(l2.data);
        l2 = l2.next;
      }
      temp = temp.next;
    }
    // Add all the nodes in l1, if remaining
    while (l1 != null) {
      temp.next = new Node(l1.data);
      l1 = l1.next;
      temp = temp.next;
    }
    // Add all the nodes in l2, if remaining
    while (l2 != null) {
      temp.next = new Node(l2.data);
      l2 = l2.next;
      temp = temp.next;
    }
    return head;
  }

  public static void main(String[] args) {
    MergeTwoSortedList l1 = new MergeTwoSortedList();
    MergeTwoSortedList l2 = new MergeTwoSortedList();
  }
}
