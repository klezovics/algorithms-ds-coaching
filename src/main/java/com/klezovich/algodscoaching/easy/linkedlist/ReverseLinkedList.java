package com.klezovich.algodscoaching.easy.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/560/
class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        var vals = new ArrayList<Integer>();
        var node = head;

        while (node != null) {
            vals.add(node.val);
            node=node.next;
        }

        Collections.reverse(vals);

        return makeLinkedListFromValues(vals);
    }

    private ListNode makeLinkedListFromValues(List<Integer> vals) {
        if(vals.size() == 0) {
            return null;
        }

        if(vals.size() == 1) {
            var head = new ListNode();
            head.val=vals.get(0);
        }

        var head= new ListNode();
        head.val=vals.get(0);

        var prevNode = head;
        for(int pos=0; pos<vals.size()-1; pos++) {
            var nextNode = new ListNode();
            nextNode.val=vals.get(pos+1);

            prevNode.next=nextNode;
            prevNode=nextNode;
        }

        return head;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}