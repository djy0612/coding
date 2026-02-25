package main.java.mid;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums){
        dfs(nums,0);
        return ans;
    }

    public void dfs(int[] nums,int start){
        if (start == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        dfs(nums, start + 1);
        path.add(nums[start]);
        dfs(nums, start + 1);
        path.remove(path.size() - 1);
    }
}
