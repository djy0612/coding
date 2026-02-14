package main.java.easy;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.xml.internal.ws.api.pipe.NextAction;

import java.util.*;

public class getIntersectionNode {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(9);
        headA.next.next = new ListNode(1);
        headA.next.next.next =new ListNode(2);
        headA.next.next.next.next = new ListNode(4);

        ListNode headB = new ListNode(3);
        headB.next = headA.next.next.next;
        headB.next.next = new ListNode(4);
        System.out.println(getIntersectionNode(headA,headB).val);
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while (nodeA != nodeB) {
            nodeA = nodeA != null ? nodeA.next : headB;
            nodeB = nodeB != null ? nodeB.next : headA;
        }
        return nodeA;
    }
}
