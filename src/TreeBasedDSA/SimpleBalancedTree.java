package TreeBasedDSA;

// Node class for Binary Tree
class Node2 {
    int key;
    Node2 left, right;

    Node2(int key) {
        this.key = key;
        left = right = null;
    }
}

// Binary Tree class
class BalancedBinaryTree1 {
    // Function to create a balanced binary tree
    Node2 createTree() {
        // Create root node
        Node2 root = new Node2(10);

        // Create left subtree
        root.left = new Node2(5);
        root.left.left = new Node2(3);
        root.left.right = new Node2(7);

        // Create right subtree
        root.right = new Node2(20);
        root.right.left = new Node2(15);
        root.right.right = new Node2(25);

        return root;
    }
}

// Main class
public class SimpleBalancedTree {
    public static void main(String[] args) {
        BalancedBinaryTree1 tree = new BalancedBinaryTree1();

        // Create the balanced binary tree
        Node2 root = tree.createTree();

        // Print a simple confirmation message
        System.out.println("Balanced Binary Tree has been created.");
    }
}
