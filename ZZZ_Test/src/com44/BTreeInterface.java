package com44;

public interface BTreeInterface
{

    boolean insert(int data);

    boolean delete(int data);

    Node find(int data);

    Node findMax();

    Node findMin();

    void infixOrder(Node node);//中序遍历
}
