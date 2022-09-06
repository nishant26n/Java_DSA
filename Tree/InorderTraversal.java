package Tree;

class Node {
  Node left, right;
  int data;

  public Node(int data) {
    this.data = data;
    left = right = null;
  }
}

public class InorderTraversal {
  Node root;

  InorderTraversal() {
    root = null;
  }

  void inOrder(Node node) {
    if (node == null) return;

    inOrder(node.left);

    System.out.print(node.data + "->");

    inOrder(node.right);
  }

  public static void main(String[] args) {
    InorderTraversal tree = new InorderTraversal();

    tree.root = new Node(1);
    tree.root.left = new Node(12);
    tree.root.right = new Node(19);

    tree.root.left.left = new Node(5);
    tree.root.left.right = new Node(6);

    System.out.println("In Order traversal");
    tree.inOrder(tree.root);
  }
}
