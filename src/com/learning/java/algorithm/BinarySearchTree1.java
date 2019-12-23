package com.learning.java.algorithm;

public class BinarySearchTree1 {

    static class Node {
        int data;
        BinarySearchTree1.Node left;
        BinarySearchTree1.Node right;
    }

    static class BST {
        public BinarySearchTree1.Node createNewNode(int k) {
            BinarySearchTree1.Node a = new BinarySearchTree1.Node();
            a.data = k;
            a.left = null;
            a.right = null;
            return a;
        }

        public BinarySearchTree1.Node insert(BinarySearchTree1.Node node, int val) {
            if (node == null) {
                return createNewNode(val);
            }
            if (val < node.data) {
                node.left = insert(node.left, val);
            } else if (val > node.data) {
                node.right = insert(node.right, val);
            }
            return node;
        }

        public static void main(String[] args) {
            BinarySearchTree1.BST treeObject = new BinarySearchTree1.BST();
            BinarySearchTree1.Node root = null;
            root = treeObject.insert(root, 8);
            root = treeObject.insert(root, 5);
            root = treeObject.insert(root, 10);
        }
    }
}
