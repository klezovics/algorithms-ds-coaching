package com.klezovich.algodscoaching.ds.linkedlist.singlelink;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class MyLinkedList<T> implements Iterable<T> {

    private Node<T> head;

    @Getter
    private int size;

    public MyLinkedList() {
    }

    public void add(T element) {

        //If head is empty - add it
        if(head == null) {
            head = new Node<T>(element,null);
            size++;
            return;
        }

        //find the last node
        var node = head;
        while (node.getNext() != null) {
            node = node.getNext();
        }

        //Add a new one after it
        var newNode = new Node<T>(element,null);
        node.setNext(newNode);
        size++;
    }

    public int find(T element) {

        var node = head;
        var pos=0;
        while (node != null) {
            if(Objects.equals(element, node.getValue())) {
                return pos;
            }

            node=node.getNext();
            pos++;
        }

        return -1;
    }

    public void delete(T element) {
        int elemPos = find(element);
        if(elemPos == -1) {
            return;
        }

        var curPos=0;
        var curNode=head;
        if(elemPos == 0) {
            head=head.getNext();
            size--;
            return;
        }

        //Once the condition fails and curPos = elemPos-1
        //Then the node will contain the pointer to a node before
        //the one which needs to be inserted
        while (curPos != elemPos-1 ) {
            curPos++;
            curNode=curNode.getNext();
        }

        var nodeToDelete = curNode.getNext();
        var nodeAfterOneToDelete = nodeToDelete.getNext();

        curNode.setNext(nodeAfterOneToDelete);
        size--;
    }


    @Override
    public Iterator<T> iterator() {
        var list = new ArrayList<T>();
        var node = head;
        while (node != null) {
            list.add(node.getValue());
            node = node.getNext();
        }

        return list.iterator();
    }
}
