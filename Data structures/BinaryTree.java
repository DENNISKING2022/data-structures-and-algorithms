/*A binary tree is a tree data structure in which each node has at most two children, which are referred to as the left child and the right child. 
A binary tree is a recursive data structure, meaning that a binary tree is made up of smaller binary trees. 
The root node of a binary tree is the topmost node and is the starting point for traversing the tree. 
The left and right children of a node in a binary tree are smaller sub-trees. 
*/

class BinaryTree {
  // root of the tree
  private Node root;

  // constructor to create an empty tree
  public BinaryTree() {
    root = null;
  }

  // insert a new node in the tree
  public void insert(int data) {
    root = insert(root, data);
  }

  // recursive function to insert a new node in the tree
  private Node insert(Node node, int data) {
    // if the tree is empty, create a new node
    if (node == null) {
      node = new Node(data);
    } else {
      // if the right child is empty, insert the new node here
      if (node.getRight() == null) {
        node.right = insert(node.right, data);
      } else {
        // if the right child is not empty, insert the new node in the left child
        node.left = insert(node.left, data);
      }
    }
    return node;
  }

  // traverse the tree in inorder
  public void inorder() {
    inorder(root);
  }

  // recursive function to traverse the tree in inorder
  private void inorder(Node r) {
    if (r != null) {
      inorder(r.getLeft());
      System.out.print(r.getData() + " ");
      inorder(r.getRight());
    }
  }
}
