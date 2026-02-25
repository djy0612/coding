package main.java.mid;

public class findMin {
    public int findMin(int[] nums){
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= nums[left]) {//左有序
                ans = Math.min(ans,nums[left]);
                left = mid+1;
            } else {
                ans = Math.min(ans,nums[mid]);
                right = mid-1;
            }
        }
        return ans;
    }
}
