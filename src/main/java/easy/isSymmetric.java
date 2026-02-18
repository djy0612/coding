package main.java.easy;

public class isSymmetric {
    class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(){}
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root){
        if(root==null)return true;
        return isMirror(root.left,root.right);
    }
    public boolean isMirror(TreeNode left,TreeNode right){
        if(left==null&&right==null)
            return true;
        else if(left==null||right==null)
            return false;
        else{
            return left.val == right.val && isMirror(left.left, right.right) && isMirror(right.left, left.right);        }
    }
}
