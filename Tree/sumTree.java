package Tree;

class Node{
    Node left, right;
    int data;

    public Node(int data){
        this.data = data;
    }
}

public class sumTree {

    Node root;

    static int toSumTree(Node node){
        // Base case
        if (node == null)
            return 0;
  
        // Store the old value
        int old_val = node.data;
        node.data = toSumTree(node.left) + toSumTree(node.right);
        return node.data + old_val;
    }
  
    static void printInorder(Node node){
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
    
    public static void main(String[] args){
        
        BinaryTree tree = new BinaryTree();
  
        tree.root = new Node(10);
        tree.root.left = new Node(-2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(-4);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(5);
  
        toSumTree(tree.root);
  
        System.out.println("Inorder Traversal of the resultant tree is:");
        printInorder(tree.root);

    }   

}
