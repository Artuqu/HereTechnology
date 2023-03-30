package com.here.Objects;

public class Node {


    static Node root;
    private int value;
    private Node left;
    private Node right;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public static Node createNode(int value, Node currentNode) {
        if (currentNode == null) {
            return new Node(value);
        }
        if (value < currentNode.value) {
            currentNode.left = createNode(value, currentNode.left);
        } else if (value > currentNode.value) {
            currentNode.right = createNode(value, currentNode.right);
        } else {
            return currentNode;
        }
        return currentNode;
    }


    public static Node add(int value) {
        root = createNode(value, root);
        return root;
    }


    public static int maxDepth(Node node) {
        if (node == null)
            return -1;
        else {

            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);

            if (leftDepth > rightDepth) {
                return (leftDepth + 1);
            } else {
                return (rightDepth + 1);
            }
        }
    }
}
