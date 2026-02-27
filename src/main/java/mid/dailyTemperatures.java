package main.java.mid;

import java.util.ArrayDeque;
import java.util.Deque;

public class dailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures){
        int[] ans = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int x = stack.pop();
                ans[x] = i - x;
            }
            stack.push(i);
        }
        return ans;
    }
}
