package main.java.mid;

import com.sun.org.apache.bcel.internal.generic.FALOAD;

import java.util.ArrayList;
import java.util.List;

public class partition {
    List<List<String>> ans = new ArrayList<>();
    List<String> path = new ArrayList<>();

    public List<List<String>> partition(String s) {
        int n = s.length();
        boolean[][] flag = new boolean[n][n];
        for(int i=0;i<n;i++) flag[i][i] = true;
        for(int len=2;len<=n;len++){
            for(int i=0;i+len-1<n;i++){
                int j = i+len-1;
                if(s.charAt(i)==s.charAt(j)){
                    flag[i][j] = (len==2)||flag[i+1][j-1];
                }
            }
        }
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                if(huiwen(s.substring(i,j+1)))
//                    flag[i][j] = true;
//            }
//        }
        dfs(s,0,flag);
        return ans;

    }
    public void dfs(String s,int left,boolean[][] flag){
        if(left==s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int right=left;right<s.length();right++){
            if(flag[left][right]){
                path.add(s.substring(left,right+1));
                dfs(s,right+1,flag);
                path.remove(path.size()-1);
            }

        }
    }
    public boolean huiwen(String s){
        if(s.length()==1)
            return true;
        int left = 0,right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;right--;
        }
        return true;
    }
}
