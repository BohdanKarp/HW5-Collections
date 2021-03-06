package com.BohdanKarp;

public class DoublyLinkedList<T> {
    protected Node<T> first;
    protected Node<T> last;
    public static int size = 0;

    protected void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        if (size == 0) {
            newNode.setNext(first);
            first = newNode;
            last = newNode;
        } else {
            first.setPrev(newNode);
            newNode.setNext(first);
            first = newNode;
        }
        size++;
    }

    protected void addLast(T element) {
        Node<T> newNode = new Node<>(element);
        if (size == 0) {
            newNode.setPrev(last);
            last = newNode;
            first = newNode;
        } else {
            last.setNext(newNode);
            newNode.setPrev(last);
            last = newNode;
        }
        size++;
    }

    protected void add(int index, T element) {
        Node<T> newNode = new Node<>(element);
        if (index < size) {
            Node<T> nodeI = first;
            for (int i = 1; i < index; i++) {
                nodeI = nodeI.getNext();
            }
            newNode.prev = nodeI;
            newNode.next = nodeI.next;
            nodeI.next = newNode;
        } else {
            addLast(element);
        }
        size++;
    }

    protected int size() {
        return size;
    }

    protected boolean isEmpty() {
        return size == 0;
    }

    protected T removeFirst() {
        if (size != 0) {
            Node<T> newNode = first;
            first = first.next;
            size--;
            return newNode.getValue();
        } else return null;
    }

    protected T removeLast() {
        if (size != 0) {
            Node<T> newNode = last;
            last = last.next;
            size--;
            return last.getValue();
        } else return null;
    }
}
