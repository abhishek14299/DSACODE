// Class representing a Binary Tree with methods for insertion and traversal
public class MyBinaryTree {

    // Root node of the binary tree
    Node root;

    // Method to insert a node into the binary tree
    public void insert(int data) {
        root = insertRec(root, data); // Start the recursive insertion
    }

    // Recursive helper method for insertion
    private Node insertRec(Node root, int data) {
        // If the current root is null, create and return a new node
        if (root == null) {
            root = new Node(data); // Create a new node for the given data
            return root;
        }

        // If the data is less than the root's data, insert into the left subtree
        if (data < root.data) { 
            root.left = insertRec(root.left, data);
        }
        // If the data is greater than the root's data, insert into the right subtree
        else if (data > root.data) { 
            root.right = insertRec(root.right, data);
        }

        return root; // Return the unchanged root node
    }

    // Method to perform in-order traversal
    public void inorder() {
        inorderRec(root); // Start recursive in-order traversal
    }

    // Recursive helper method for in-order traversal
    private void inorderRec(Node root) {
        if (root != null) { // Check if current node is not null
            inorderRec(root.left); // Visit left subtree
            System.out.print(root.data + " "); // Print the data of the current node
            inorderRec(root.right); // Visit right subtree
        }
    }

    // Method to perform pre-order traversal
    public void preorder() {
        preorderRec(root); // Start recursive pre-order traversal
    }

    // Recursive helper method for pre-order traversal
    private void preorderRec(Node root) {
        if (root != null) { // Check if current node is not null
            System.out.print(root.data + " "); // Print the data of the current node
            preorderRec(root.left); // Visit left subtree
            preorderRec(root.right); // Visit right subtree
        }
    }

    // Method to perform post-order traversal
    public void postorder() {
        postorderRec(root); // Start recursive post-order traversal
    }

    // Recursive helper method for post-order traversal
    private void postorderRec(Node root) {
        if (root != null) { // Check if current node is not null
            postorderRec(root.left); // Visit left subtree
            postorderRec(root.right); // Visit right subtree
            System.out.print(root.data + " "); // Print the data of the current node
        }
    }
}


