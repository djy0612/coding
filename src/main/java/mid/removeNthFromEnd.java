package main.java.mid;

import java.util.List;

public class removeNthFromEnd {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    public static void main(String[] args) {

    }

    public static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummy  =new ListNode();
        dummy.next =head;
        ListNode pre = dummy;
        ListNode next = dummy;
        for(int i=0;i<n;i++){
            next = next.next;
        }
        while(next!=null&&next.next!=null){
            pre = pre.next;
            next = next.next;
        }
        pre.next = pre.next.next;
        return dummy.next;
    }

}
