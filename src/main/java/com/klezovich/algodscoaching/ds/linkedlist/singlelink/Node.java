package com.klezovich.algodscoaching.ds.linkedlist.singlelink;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Node<T> {

    private T value;
    private Node<T> next;
}
