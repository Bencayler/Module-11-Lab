
package edu.sdccd.cisc191;

public class BinarySearchTree {
    /**
     * Recursively finds the needle in the Binary Search Tree (BST) haystack
     * @param root which node to start searching from
     * @param needle the data to search for
     * @return the first BSTNode containing the needle, null if doesn't exist
     */
    public BSTNode contains(BSTNode root, String needle) {
        // TODO: fill this out, you can choose any order of traversal
        if (root == null) {
            return null;
        }
        //Condition 1. we found the value
        if (root.getData() == needle) {
            return root;
        }
        if (root.getLeft() != null) {
            return contains(root.getLeft(), needle);
        }
        if (root.getRight() != null) {
            return contains(root.getRight(), needle);
        }
        return null;
    }

    /**
     * Recursively converts a String array to Binary Search Tree (BST)
     * @param array the array of Strings to import into the BST
     * @param start index in the array to begin importing
     * @param end index in the array to stop importing
     * @return the root node of the generated BST
     */
    public BSTNode fromArray(String[] array, int start, int end) {
        // TODO: fill this out, you can choose any order of traversal
        if (start > end) {
            return null;
        }

        // Get middle element to make root
        int mid = (start + end) / 2;
        BSTNode node = new BSTNode(array[mid]);

        // Construct left subtree
        node.left = fromArray(array, start, mid - 1);

        // Construct right subtree
        node.right = fromArray(array, mid + 1, end);

        return node;
    }
}