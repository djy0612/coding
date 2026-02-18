package main.java.easy;

public class diameterOfBinaryTree {
    class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(){}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }
    int maxlength = 0;
    public int diameterOfBinaryTree(TreeNode root){
        dfs(root);
        return maxlength;
    }
    public int dfs(TreeNode root){
        if(root==null)return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        maxlength = Math.max(maxlength,left+right);
        return Math.max(left,right)+1;
    }
}
