/*A binary tree is a tree data structure in which each node has at most two children, which are referred to as the left child and the right child. 
A binary tree is a recursive data structure, meaning that a binary tree is made up of smaller binary trees. 
The root node of a binary tree is the topmost node and is the starting point for traversing the tree. 
The left and right children of a node in a binary tree are smaller sub-trees. 
*/

public class BinaryTree {
    // The root node of the binary tree
    Node root;

    // Constructor to create an empty binary tree
    public BinaryTree() {
        this.root = null;
    }

    // Insert a new node in the binary tree
    public void insert(int data) {
        // Create a new node with the given data
        Node newNode = new Node(data);
        // If the root node is null, set the root node to the new node
        if (root == null) {
            root = newNode;
            return;
        }

        // Set the current node to the root node
        Node current = root;
        // Set the parent node to null
        Node parent = null;
        // Keep looping until we find the correct position to insert the new node
        while (true) {
            // Set the parent node to the current node
            parent = current;
            // If the new data is less than the current data, go to the left child
            if (data < current.data) {
                current = current.left;
                // If the left child is null, insert the new node as the left child
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            }
            // If the new data is greater than or equal to the current data, go to the right child
            else {
                current = current.right;
                // If the right child is null, insert the new node as the right child
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }

    // Search for a node with a specific value in the binary tree
    public boolean search(int data) {
        // Set the current node to the root node
        Node current = root;
        // Keep looping until we find the data or reach a leaf node
        while (current != null) {
            // If the current data is equal to the search data, return true
            if (current.data == data) {
                return true;
            }
            // If the search data is less than the current data, go to the left child
            else if (data < current.data) {
                current = current.left;
            }
            // If the search data is greater than the current data, go to the right child
            else {
                current = current.right;
            }
        }
        // If the data is not found, return false
        return false;
    }
}

class Node {
    // The data stored in this node
    int data;
    // The left child of this node
    Node left;
    // The right child of this node
    Node right;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}