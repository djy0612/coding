package main.java.mid;

public class canJump {
    public boolean canJump(int[] nums){
        int maxlen = 0;
        for(int i=0;i<nums.length&&maxlen>=i;i++){
            maxlen = Math.max(maxlen,i+nums[i]);
            if(maxlen>=nums.length-1)
                return true;

        }
        return false;
    }
}
