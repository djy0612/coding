package main.java.hard;

public class trap {
    public static void main(String[] args){
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int ans = trap(height);
        System.out.println(ans);
    }

    public static int trap(int[] height){
        int ans = 0;
        int n = height.length;
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];
        leftmax[0] = height[0];
        rightmax[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
        for(int i=0;i<n;i++){
            ans += Math.min(leftmax[i],rightmax[i])-height[i];
        }
        return ans;

    }
}
