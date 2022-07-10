package com.bridge.labzs;

import org.w3c.dom.Node;

public class linkedList <E> {
    node.Node.Node<E> head;
    Node<E> tail;
    public void add(E data) {
        Node<E> newNode = new node.Node.Node<E>(data);
        if (head == null) {
            head = (node.Node.Node<E>) newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void display() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
            //System.out.println(temp.data);
        }
    }
}



