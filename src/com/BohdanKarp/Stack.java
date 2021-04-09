package com.BohdanKarp;

public class Stack<T> extends SinglyLinkedList<T>{

    public void push(T element){
        size++;
        addNode(element);
    }
    public T pop() {
        if(isEmpty()){
            return null;
        }
        else {
            T element =top.getValue();
            top= top.getPrev();
            size--;
            return element;
        }
    }
    public T top(){
        if(isEmpty()){
            return null;
        }
        else {
            return top.getValue();
        }
    }
    public int size(){
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
