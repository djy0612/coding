package main.java.mid;
import java.util.*;
public class lengthOfLongestSubstring {
    public static void main(String[] args){
        //String s = new String("abcabcbb");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
    //双指针+set
    /*public static int lengthOfLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int left=0,right=0;
        int ans = 0;
        for(;right<s.length();right++){
            Character c = s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }*/
    public static int lengthOfLongestSubstring(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = 0;
        int left=0;
        for(int right=0;right<s.length();right++){
            Character c = s.charAt(right);
            if(map.containsKey(c)){
                left = Math.max(left,map.get(c)+1);
            }
            map.put(c,right);
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}
