package com.fs.homework1;

public class MyLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static MyLinkedList add(MyLinkedList list, int data) {
        Node node = new Node(data);
        node.next = null;


        if (list.head == null) list.head = node;

        else {
            Node lastNode = list.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }

            lastNode.next = node;
        }

        return list;
    }

    public static void show(MyLinkedList list) {
        Node currNode = list.head;
        System.out.print("\nMyLinkedList: ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println("\n");
    }

    public static MyLinkedList deleteByKey(MyLinkedList list, int key) {
        // Store head node
        Node thisNode = list.head;
        Node prevNode = null;


        if (thisNode != null && thisNode.data == key) {
            list.head = thisNode.next;
            System.out.println(key + " was found and deleted");
            return list;
        }


        while (thisNode != null && thisNode.data != key) {
            prevNode = thisNode;
            thisNode = thisNode.next;
        }

        if (thisNode != null) {
            prevNode.next = thisNode.next;
            System.out.println(key + " was found and deleted");
        }

        if (thisNode == null) {
            System.out.println(key + " was not found");
        }
        return list;
    }

    public static MyLinkedList deleteByPosition(MyLinkedList list, int pos) {
        Node currNode = list.head;
        Node prev = null;

        if (pos == 0 && currNode != null) {
            list.head = currNode.next;
            System.out.println("Element at " + pos + " position deleted");

            return list;
        }


        int counter = 0;

        while (currNode != null) {

            if (counter == pos) {

                prev.next = currNode.next;

                System.out.println("Element at " + pos + " position deleted");
                break;
            } else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        if (currNode == null) {
            System.out.println("Element at " + pos + " position not found");
        }

        return list;
    }


    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        for (int i = 0; i <= 10; i++) {
            list = add(list, i);
        }

        show(list);
        deleteByKey(list, 2);
        show(list);
        deleteByKey(list, 5);
        show(list);
        deleteByKey(list, 10);
        show(list);
        deleteByKey(list, 20);

        deleteByPosition(list, 0);
        show(list);
        deleteByPosition(list, 7);
        show(list);

        list.add(list, 13);
        show(list);
        deleteByPosition(list, 7);
        show(list);
        deleteByPosition(list, 10);
        show(list);
    }
}
