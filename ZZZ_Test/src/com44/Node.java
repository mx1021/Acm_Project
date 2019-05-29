package com44;

public class Node
{
    int data;
    boolean hasDeleded;
    Node leftChild;
    Node rightChild;

    Node() {
    }

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node left, Node right) {
        this.data = data;
        this.leftChild = left;
        this.rightChild = right;
    }
}
