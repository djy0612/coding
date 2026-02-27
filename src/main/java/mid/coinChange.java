package main.java.mid;

import java.lang.reflect.Array;
import java.util.Arrays;

public class coinChange {
    public int coinChange(int[] coins, int amount){
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for(int i=1;i<=amount;i++){
            for(int x:coins){
                if(i-x>=0)
                    dp[i] = Math.min(dp[i],dp[i-x]+1);
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}
