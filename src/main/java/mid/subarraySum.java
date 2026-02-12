package main.java.mid;
import java.rmi.MarshalledObject;
import java.util.*;
public class subarraySum {
    public static void main(String[] args) {
        //int[] nums = {1,1,1};
        //int k = 2;
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int k = sc.nextInt();
        String[] sp = line.split(",");
        int[] nums = new int[sp.length];
        for(int i=0;i<sp.length;i++){
            nums[i] = Integer.parseInt(sp[i]);
        }
        int ans = subarraySum(nums,k);
        System.out.println(ans);

    }

    public static int subarraySum(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        int sum = 0;
        for (int i=0;i<nums.length;i++){
            int v = map.getOrDefault(sum,0);
            map.put(sum,v+1);
            sum += nums[i];
            if(map.containsKey(sum-k)){
                ans += map.getOrDefault(sum-k,0);
            }
        }
        return ans;
    }
}
