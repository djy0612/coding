package main.java.mid;

import javafx.scene.shape.VLineTo;

import java.util.ArrayList;

public class Trie {
    class node{
        node[] val = new node[26];
        boolean end;
        node(){
            for(int i=0;i<26;i++){
                val[i] = null;
            }
            end = false;
        };

    }
    node root ;
    public Trie() {
        root = new node();
    }

    public void insert(String word) {
        node head = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(head.val[idx]==null){
                head.val[idx] = new node();
            }
            head = head.val[idx];
        }
        head.end = true;
    }

    public boolean search(String word) {
        node head = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(head.val[idx]!=null){
                head = head.val[idx];
            }else return false;
        }
        return head.end;
    }

    public boolean startsWith(String prefix) {
        node head = root;
        for(int i=0;i<prefix.length();i++){
            int idx = prefix.charAt(i)-'a';
            if(head.val[idx]!=null){
                head = head.val[idx];
            }else return false;
        }
        return true;
    }
}
