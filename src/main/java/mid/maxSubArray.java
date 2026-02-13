package main.java.mid;

import java.util.Scanner;

public class maxSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String len = sc.nextLine();
        String[] sp = len.split(",");
        int[] nums = new int[sp.length];
        for(int i=0;i<sp.length;i++){
            nums[i] = Integer.parseInt(sp[i]);
        }
        int ans = maxSubArray(nums);
        System.out.println(ans);

    }
    public static int maxSubArray(int[] nums){
        int ans = Integer.MIN_VALUE;
        int min = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            ans = Math.max(ans, sum - min);
            min = Math.min(min, sum);
        }
        return ans;
    }
}
