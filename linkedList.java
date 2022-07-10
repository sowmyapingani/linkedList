package com.bridge.labzs;

import org.w3c.dom.Node;

public class linkedList <E> {
    Node head;
    Node tail;
    public void add(E data) {
        Node<E> newNode = new Node<E>(data) {
            @Override
            public String getNodeName() {
                return null;
            }
        };
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void append(E data) {
        Node<E> newNode = new Node<E>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public E pop() {
        E data = head.data;
        head = head.next;
        return data;
    }

    public E popLast() {
        // Node<E> newNode = null;

        E data = tail.data;
        Node<E> newTail = null;
        tail.next = newTail;
        newTail = tail;
        return data;
    }

    public void deleteAfter(E searchData) {
        // Node<E> newNode = new Node<>(searchData);
        Node<E> searchedData = search(searchData).next;
        if (searchedData != null) {
            //  newNode.next =searchedData;
            //   searchedData = searched.next;
            //  searchedData.next = newNode;
        }
    }
    public void poplast() {

        Node<E> poppedNode = new Node<>(tail.data);
        //Node<E> tall = tail.data;
        Node<E> temp = head;
        Node<E> prev = null;
        while (temp.data != null) {
            if (temp.data == tail.data) {

                prev.next = null;
                break;
            }
            //temp = temp.next;
            prev = temp;
            temp = temp.next;
        }
        /*temp.next = null;
        tail = temp;
        System.out.println("The node deleted is" + poppedNode.data);
        poppedNode.next = null;
        poppedNode.data = null;*/

    }
    public void searchanddelete(E searchData) {
        Node<E> searchedNode = new Node<>(searchData);
        public void display() {
            Node<E> temp = head;
            Node<E> prev = null;
            while (temp != null) {
                if (temp.data == searchedNode.data) {

                    prev.next = temp.next;
                }
                prev = temp;
                System.out.print(temp.data + "->");
                temp = temp.next;
                //System.out.println(temp.data);
            }
        }
    /* public void insertAfter(E searchData, E insertData){
        Node<E> newNode = new Node<>(insertData);
        Node<E> searchedData = search(searchData);
        if(searchedData!=null){
            newNode.next = searchedData.next;
            searchedData.next = newNode;
        }
    }*/
        Node<E> search(E searchData) {
            Node<E> temp = head;
            Node<E> searchedData = null;
            while (temp != null) {
                if (temp.data == searchData) {
                    searchedData = temp;
                    // return true;
                    break;
                }
                temp = temp.next;
            }
            return searchedData;
        }
        boolean search1(E searchData) {
            Node<E> temp = head;
            Node<E> searchedData = null;
            while (temp != null) {
                if (temp.data == searchData) {
                    searchedData = temp;
                    return true;
                    // break;
                }
                temp = temp.next;
            }
            return false;
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

}
