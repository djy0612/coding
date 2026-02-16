package main.java.mid;

public class sortList {
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
    public static ListNode sortList(ListNode head){
        if(head==null||head.next==null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left,right);
    }
    public static ListNode merge(ListNode l1 , ListNode l2){
        ListNode prehead = new ListNode();
        ListNode head = prehead;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                head.next = l1;
                l1  = l1.next;
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
