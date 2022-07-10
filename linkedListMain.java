package com.bridge.labzs;

public class linkedListMain {
    public static void main(String args[]) {
            System.out.println("Welcome to linked list:");
            linkedListMain linkedList = new linkedListMain<E>();
            linkedList.add(70);
            linkedList.add(30);
            linkedList.add(56);
            System.out.println("After Adding the data : ");
            linkedList.display();
            linkedListMain linkedList1 = new linkedListMain<E>();
            linkedList1.append(56);
            linkedList1.append(30);
            linkedList1.append(70);
            System.out.println();
            System.out.println("After Appending the data : ");
            linkedList1.display();
        }

    private void append(int i) {

    }

    private void add(int i) {

    }
}