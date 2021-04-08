package com.BohdanKarp;

public class SinglyLinkedList <T>{
    Node<T> top;
    protected static int size=0;

    public void addNode(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.setPrev(top);
        top = newNode;
    }
}

