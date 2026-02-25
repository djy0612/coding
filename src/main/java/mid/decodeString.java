package main.java.mid;

import javafx.util.Pair;

import java.util.ArrayDeque;
import java.util.Deque;

public class decodeString {
    public String decodeString(String s){
        Deque<Pair<Integer,StringBuilder>> deque = new ArrayDeque<>();
        StringBuilder curstr = new StringBuilder();
        int curnum = 0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                curnum = (c-'0')+curnum*10;
            }else if(c=='['){
                deque.push(new Pair<>(curnum,curstr));
                curnum = 0;
                curstr = new StringBuilder();;
            }else if(c==']'){
                Pair<Integer, StringBuilder> pop = deque.pop();
                int k = pop.getKey();
                StringBuilder prestr = pop.getValue();
                while(k>0){
                    prestr.append(curstr);
                    k--;
                }
                curstr = prestr;
            }else{
                curstr.append(c);
            }
        }
        return curstr.toString();
    }
}
