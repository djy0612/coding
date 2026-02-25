package main.java.hard;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import com.sun.rowset.internal.Row;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.BlockingDeque;

public class solveNQueens {

    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n){
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        boolean[] column = new boolean[n];
        // 主对角线与反对角线
        boolean[] a = new boolean[2*n-1];
        boolean[] b = new boolean[2*n-1];
        dfs(n,board,column,a,b, 0);
        return ans;
    }
    public void dfs(int n,char[][] board,
                    boolean[] column,boolean[] a,boolean[] b,int row){
        if(row==n)
        {   List<String> rows = new ArrayList<>();
            for(int i=0;i<n;i++){
                String s = new String(board[i]);
                rows.add(s);
            }
            ans.add(rows);
            return;
        }
        for(int col=0;col<n;col++){
            int aa = row-col+n-1;
            int bb = row+col;
            if(a[aa]||b[bb]||column[col]) continue;
            a[aa] = b[bb] = column[col] = true;
            board[row][col] = 'Q';
            dfs(n,board,column,a,b,row+1);
            board[row][col] = '.';
            a[aa] = b[bb] = column[col] = false;
        }
    }
}
