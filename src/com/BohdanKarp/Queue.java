package com.BohdanKarp;

public class Queue<T> extends DoublyLinkedList {
    public void enqueue(T element) {
        addLast(element);
    }

    public T dequeue() {
        return (T) removeFirst();
    }

    public int size() {
        return super.size();
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }
}
