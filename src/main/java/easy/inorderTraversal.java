package main.java.easy;

import java.lang.annotation.Retention;
import java.time.temporal.Temporal;
import java.util.*;

public class inorderTraversal {
    public class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(){}
        TreeNode(int val){
            this.val = val;
            left = null;
            right = null;
        }
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }
    // 递归
    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        inorder(list,root);
        return list;
    }

    public static void inorder(List<Integer> list, TreeNode node){
        if(node==null)return;
        inorder(list,node.left);
        list.add(node.val);
        inorder(list,node.right);
    }

    // 迭代
    public static List<Integer> inorderTraversal_1(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            TreeNode cur = stack.pop();
            list.add(cur.val);
            root = cur.right;
        }
        return list;

    }
}
