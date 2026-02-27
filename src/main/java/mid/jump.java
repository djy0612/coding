package main.java.mid;

public class jump {
    public int jump(int[] nums){
        int num = 0;
        int maxlen = 0;
        int curlen = 0;
        for(int i=0;i<nums.length-1;i++){
            maxlen = Math.max(maxlen,i+nums[i]);
            if(i==curlen) {
                curlen = maxlen;
                num++;
                if(maxlen>=nums.length-1)
                    break;
            }
        }
        return num;
    }
}
