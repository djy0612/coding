package main.java.mid;
import java.util.*;
public class findAnagrams {
    public static void main(String[] args) {
        String s = new String("cbaebabacd");
        String p = new String("abc");
        List<Integer> ans = findAnagrams(s,p);
        System.out.println(ans);
    }

    public static List<Integer> findAnagrams(String s, String p){
        List<Integer> ans = new ArrayList<>();
        int[] cnt = new int[26];
        for(int i=0;i<p.length();i++){
            cnt[p.charAt(i)-'a']++;
        }
        int left=0;
        for(int right =0;right<s.length();right++){
            cnt[s.charAt(right)-'a']--;
            while(cnt[s.charAt(right)-'a']<0){
                cnt[s.charAt(left)-'a']++;
                left++;
            }
            if(right-left+1==p.length()){
                ans.add(left);
            }
        }
        return ans;

    }
}
