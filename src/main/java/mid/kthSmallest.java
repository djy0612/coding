package main.java.mid;

import java.security.Key;
import java.util.ArrayDeque;
import java.util.Deque;

public class kthSmallest {
    class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(){}
        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }
    //递归
    int count = 0;
    public int kthSmallest(TreeNode root, int k){
        if(root==null)return -1;
        int left = kthSmallest(root.left,k);
        if(left!=-1)
            return left;
        count++;
        if(k==count)
            return root.val;
        return kthSmallest(root.right,k);
    }
    // 迭代
    public int kthSmallest_1(TreeNode root, int k){
        int ans = 0;
        Deque<TreeNode> deque = new ArrayDeque<>();
        while(root!=null||!deque.isEmpty()){
            while(root!=null)
            {
                deque.push(root);
                root = root.left;
            }
            root = deque.pop();
            k--;
            if(k==0)ans = root.val;
            root = root.right;
        }
        return ans;
    }
}
