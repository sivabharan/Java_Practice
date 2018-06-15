package Algorithms;

class BST_Node{
    int data;
    BST_Node left;

    BST_Node right;
     BST_Node(int d) {
            data = d;
            left = right = null;
     }
}

public class BinarySearchTree {
    static BST_Node head;

    /* Given a binary search tree and a number,
     inserts a new node with the given number in
     the correct place in the tree. Returns the new
     root pointer which the caller should then use
     (the standard trick to avoid using reference
     parameters). */
    BST_Node insert(BST_Node node,int data) {

        if(node == null) {
            return (new BST_Node(data));
        } else {

            /* 2. Otherwise, recur down the tree */
            if (data <= node.data) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }

            /* return the (unchanged) node pointer */
            return node;
        }
    }

    /* Given a non-empty binary search tree,
     return the minimum data value found in that
     tree. Note that the entire tree does not need
     to be searched. */
    int minvalue(BST_Node node) {
        BST_Node current = node;

        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return (current.data);
    }

    int maxvalue(BST_Node node) {
        BST_Node current = node;
        while(current.right != null){
            current = current.right;
        }
        return (current.data);
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        BST_Node root = null;
        root = tree.insert(root, 4);
        tree.insert(root, 2);
        tree.insert(root, 1);
        tree.insert(root, 3);
        tree.insert(root, 6);
        tree.insert(root, 5);

        System.out.println("The minimum value of BST is " + tree.minvalue(root));
        System.out.println("The maximum value of BST is " + tree.maxvalue(root));
    }
}
