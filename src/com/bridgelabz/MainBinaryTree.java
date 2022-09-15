package com.bridgelabz;

public class MainBinaryTree {
    public static void main(String[] args) {

        System.out.println("welcome to Binary Search Tree program");
        BinaryTree bst = new BinaryTree();
        INode root = null;

        root = bst.insert(root, 56);
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);
        bst.print(root);
    }
}
