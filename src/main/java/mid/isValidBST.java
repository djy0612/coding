package main.java.mid;

import main.java.easy.sortedArrayToBST;

public class isValidBST {
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
    long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root){
        if(root==null)return true;
        if(!isValidBST(root.left)){
            return false;
        }
        if(pre>root.val)
            return false;
        pre = root.val;
        if(!isValidBST(root.right))
            return false;
        return true;
    }
}
