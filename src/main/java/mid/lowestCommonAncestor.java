package main.java.mid;

public class lowestCommonAncestor {
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
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        return dfs(root,p,q);
    }

    public TreeNode dfs(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return null;
        if(root==q||root==p) return root;
        TreeNode left = dfs(root.left,p,q);
        TreeNode right = dfs(root.right,p,q);
        if(left!=null&&right!=null) return root;
        return left==null?right:left;
    }


}
