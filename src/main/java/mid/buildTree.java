package main.java.mid;

import java.util.HashMap;

public class buildTree {
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
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder){
        int prelen = preorder.length;
        int inlen = inorder.length;

        for(int i=0;i<inlen;i++){
            map.put(inorder[i],i);
        }
        return build(preorder,inorder,0,prelen-1,0,inlen-1);

    }
    public TreeNode build(int[] preorder, int[] inorder,int preorder_left,int preorder_right,int inorder_left,int inorder_right){
        if(preorder_left>preorder_right||inorder_left>inorder_right) return null;
        TreeNode mid = new TreeNode(preorder[preorder_left]);
        int mid_idx = map.get(preorder[preorder_left]);
        int left_size =mid_idx-inorder_left;
        int right_size = inorder_right - mid_idx;

        mid.left = build(preorder,inorder,preorder_left+1,preorder_left+left_size,inorder_left,mid_idx-1);
        mid.right = build(preorder,inorder,preorder_left+1+left_size,preorder_right,mid_idx+1,inorder_right);
        return mid;
    }
}
