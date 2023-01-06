/*This search algorithm involves exploring as far as possible along each branch before backtracking. 
 *It is often used to search trees and graphs.
 */

// Here is an example of the algorithm implemented for a tree structure:

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class DepthFirstSearch {
    public static boolean search(Node root, int target) {
        if (root == null) {
            return false;
        }
        if (root.data == target) {
            return true;
        }
        return search(root.left, target) || search(root.right, target);
    }
}
