/**
 * Class to demonstrate the functionality of MyBinaryTree
 */
public class BinaryTreeDemo {

    /**
     * Main method to run the binary tree operations
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Create an instance of MyBinaryTree
        MyBinaryTree tree = new MyBinaryTree();

        // Insert elements into the binary tree
        tree.insert(8); // Root node
        tree.insert(7); // Left child of 8
        tree.insert(9); // Right child of 8
        tree.insert(10); // Right child of 9
        tree.insert(1); // Left child of 7
        tree.insert(11); // Right child of 10
        tree.insert(5); // Right child of 1
        tree.insert(89); // Right child of 11
        tree.insert(6); // Right child of 5
        tree.insert(65); // Left child of 89
        tree.insert(4); // Left child of 5

        // Perform and display the traversals
        System.out.print("In-Order: "); 
        tree.inorder(); // Prints nodes in sorted order (Left -> Root -> Right)
        System.out.println();

        System.out.print("Pre-Order: ");
        tree.preorder(); // Prints nodes in traversal order (Root -> Left -> Right)
        System.out.println();

        System.out.print("Post-Order: ");
        tree.postorder(); // Prints nodes in traversal order (Left -> Right -> Root)
    }
    
    
}


