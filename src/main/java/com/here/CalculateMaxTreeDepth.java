package com.here;


import com.here.Objects.Node;

public class CalculateMaxTreeDepth extends Node {


    public static void main(String[] args) {
        int[] nodes = new int[]{3, 5, 8, 2, 9, 1};
        for (int i = 0; i < nodes.length; i++) {
            CalculateMaxTreeDepth.add(nodes[i]);
            int maxDepth = CalculateMaxTreeDepth.maxDepth(Node.add(nodes[i]));
            if (i == nodes.length - 1) {
                System.out.println("Max depth of Binary Tree is " + maxDepth);
            }
        }
    }
}
