package com.bridge.labzs;

import org.w3c.dom.Node;

public class linkedList <E>{

   Node<T> head;
    Node<T> tail;
    public void add(E data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void append(E data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void insertBetween(E data) {
        Node<T> newNode = new Node<T>(data);
        head.next = newNode;
        newNode.next = tail;
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
}



