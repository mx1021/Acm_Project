package com44;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class BTree implements BTreeInterface
{
    private Node root;

    @Override
    public Node find(int key) {
        Node current = root;
        while (current != null) {
            if (current.data > key) {
                current = current.leftChild;
            }
            else if (current.data < key) {
                current = current.rightChild;
            }
            else {
                return current;
            }
        }
        return null;
    }

    @Override
    public boolean delete(int data) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Node findMax() {
        Node current = root;
        Node maxNode = current;
        while (current != null) {
            maxNode = current;
            current = current.rightChild;
        }
        return maxNode;
    }

    @Override
    public Node findMin() {
        Node current = root;
        Node minNode = current;
        while (current != null) {
            minNode = current;
            current = current.leftChild;
        }
        return minNode;
    }

    @Override
    public boolean insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node current = root;
        Node parentNode = null;
        while (current != null) {
            parentNode = current;
            if (current.data > data) {
                current = current.leftChild;
                if (current == null) {
                    parentNode.leftChild = newNode;
                    return true;
                }
            }
            else {
                current = current.rightChild;
                if (current == null) {
                    parentNode.rightChild = newNode;
                    return true;
                }
            }
        }

        return false;
    }

    public void middleOrder(Node node, List<Integer> lst) {
        if (node != null) {
            middleOrder(node.leftChild, lst);
            lst.add(node.data);
            middleOrder(node.rightChild, lst);
        }
    }

    //中序遍历采用非递归的方式
    public void inOrderNonRecursive(Node root) {
        Stack<Node> stack = new Stack<Node>();
        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.leftChild;
            }
            if (stack.isEmpty())
                break;
            root = stack.pop();
            System.out.println(root.data);
            root = root.rightChild;
        }
    }

    @Override
    public void infixOrder(Node node) {
        if (node != null) {
            infixOrder(node.leftChild);
            System.out.println(node.data);
            infixOrder(node.rightChild);
        }
    }

    @Test
    public void mxTest19时32分() {

        Node node1 = new Node(1, null, null);
        Node node3 = new Node(3, null, null);
        Node node2 = new Node(2, node1, null);
        Node node4 = new Node(4, node3, null);
        Node node5 = new Node(5, node2, node4);

        this.infixOrder(node5);

        List<Integer> lst = new ArrayList<>();
        middleOrder(node5, lst);
        System.out.println(lst);
        //tree.inOrderNonRecursive(tree.root);

    }

}
