package com.techlink.leetcode;

public class MergeTwoSortedLists {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if(list1 == null) return list2;
            if(list2 == null) return list1;

            ListNode merged = new ListNode(-1);
            ListNode result = merged;

            while(list1 != null && list2 != null) {
                if(list1.val < list2.val) {
                    result.next = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    result.next = new ListNode(list2.val);
                    list2 = list2.next;
                }

                result = result.next;
            }

            if(list1 != null) result.next = new ListNode(list1.val, list1.next);
            if(list2 != null) result.next = new ListNode(list2.val, list2.next);

            return merged.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists mtsl = new MergeTwoSortedLists();

        ListNode l1 = mtsl.mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))), new ListNode(1, new ListNode(3, new ListNode(4))));
        System.out.println(l1);
    }


}
