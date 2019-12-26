package com.learning.java.algorithm;

public class BinarySearchTree1 {

    static class Node {
        int data;
        Node left;
        Node right;
    }

    static class BST {
        public Node createNewNode(int k) {
            Node a = new Node();
            a.data = k;
            a.left = null;
            a.right = null;
            return a;
        }

        public Node insert(Node node, int val) {
            if (node == null) {
                return createNewNode(val);
            }
            if (val <= node.data) {
                node.left = insert(node.left, val);
            } else {
                node.right = insert(node.right, val);
            }
            return node;
        }

        public static void main(String[] args) {
            BST treeObject = new BST();
            Node root = null;
            root = treeObject.insert(root, 8);
            root = treeObject.insert(root, 5);
            root = treeObject.insert(root, 10);
        }
    }
}
