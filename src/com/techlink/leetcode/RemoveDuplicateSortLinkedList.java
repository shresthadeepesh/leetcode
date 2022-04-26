package com.techlink.leetcode;

public class RemoveDuplicateSortLinkedList {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode result = head;

        while(result != null && result.next != null) {
            if(result.val == result.next.val) {
                result.next = result.next.next;
            } else {
                result = result.next;
            }
        }

        return head;

    }


    public static void main(String[] args) {
        RemoveDuplicateSortLinkedList removeDuplicateSortLinkedList = new RemoveDuplicateSortLinkedList();
        ListNode result = removeDuplicateSortLinkedList.deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3))))));

        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
