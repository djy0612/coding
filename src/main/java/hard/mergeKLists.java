package main.java.hard;

public class mergeKLists {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }
    public static ListNode mergeKLists(ListNode[] lists){
        int n = lists.length;
        if(n==0) return null;
        return merge(lists,0,n-1);
    }

    public static ListNode merge(ListNode[] lists,int left,int right){
        if(left==right)return lists[left];
        int mid = (left+right)/2;
        return mergeTwoList(
                merge(lists,left,mid),
                merge(lists,mid+1,right)
        );
    }

    public static ListNode mergeTwoList(ListNode l1,ListNode l2){
        ListNode prehead = new ListNode();
        ListNode head = prehead;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                head.next = l1;
                l1 = l1.next;
            }else{
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        head.next = l1!=null?l1:l2;
        return prehead.next;
    }
}
