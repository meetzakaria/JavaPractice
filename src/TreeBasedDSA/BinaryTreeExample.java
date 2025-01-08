package TreeBasedDSA;

// Node class for Binary Tree
class Node1 {
    int key;
    Node1 left, right;

    Node1(int key) {
        this.key = key;
        left = right = null;
    }
}

// Binary Tree class
class BinaryTree {
    // Function to create the given tree
    Node1 createTree() {
        // Create root node
        Node1 root = new Node1(10);

        // Create left subtree
        root.left = new Node1(5);
        root.left.left = new Node1(3);
        root.left.right = new Node1(7);

        // Create right subtree
        root.right = new Node1(20);
        root.right.left = new Node1(15);
        root.right.right = new Node1(25);

        return root;
    }

    // In-order Traversal: Left -> Root -> Right
    void inOrderTraversal(Node1 root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.key + " ");
            inOrderTraversal(root.right);
        }
    }

    // Pre-order Traversal: Root -> Left -> Right
    void preOrderTraversal(Node1 root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    // Post-order Traversal: Left -> Right -> Root
    void postOrderTraversal(Node1 root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.key + " ");
        }
    }
}

// Main class
public class BinaryTreeExample {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Create the tree
        Node1 root = tree.createTree();

        // Print traversals
        System.out.println("In-order Traversal:");
        tree.inOrderTraversal(root);

        System.out.println("\nPre-order Traversal:");
        tree.preOrderTraversal(root);

        System.out.println("\nPost-order Traversal:");
        tree.postOrderTraversal(root);
    }
}
