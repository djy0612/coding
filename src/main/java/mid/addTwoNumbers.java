package main.java.mid;

import main.java.easy.mergeTwoLists;

import java.util.Scanner;

public class addTwoNumbers {
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
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] sp1 = s1.split(" ");
        ListNode l1 = new ListNode(Integer.parseInt(sp1[0]));
        ListNode tmp = l1;
        for(int i=1;i<sp1.length;i++){
            tmp.next = new ListNode(Integer.parseInt(sp1[i]));
            tmp = tmp.next;
        }
        String s2 = sc.nextLine();
        String[] sp2 = s2.split(" ");
        ListNode l2 = new ListNode(Integer.parseInt(sp2[0]));
        tmp = l2;
        for(int i=1;i<sp2.length;i++){
            tmp.next = new ListNode(Integer.parseInt(sp2[i]));
            tmp = tmp.next;
        }
        ListNode node = addTwoNumbers(l1,l2);
        while(node!=null){
            System.out.println(node.val);
            node = node.next;
        }



    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode prehead = new ListNode();
        ListNode node = prehead;
        int num = 0;
        while(l1!=null||l2!=null||num!=0){
            int v1 = l1!=null?l1.val:0;
            int v2 = l2!=null?l2.val:0;
            int sum = v1+v2+num;
            num = sum/10;
            sum = sum%10;
            node.next = new ListNode(sum);
            l1 = l1!=null?l1.next:null;
            l2 = l2!=null?l2.next:null;
            node = node.next;

        }
        return prehead.next;
    }
}
