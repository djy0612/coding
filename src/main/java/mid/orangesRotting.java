package main.java.mid;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.zip.CheckedOutputStream;

public class orangesRotting {
    public static void main(String[] args) {

    }
    public int orangesRotting(int[][] grid) {
        int minute = 0;
        int fresh = 0;
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> list = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                } else if (grid[i][j] == 2) {
                    list.offer(new int[] { i, j });
                }
            }
        }
        if (fresh == 0)
            return 0;
        if (list.size() == 0)
            return -1;
        int[][] dirs = { { 0, -1 }, { 0, 1 }, { -1, 0 }, { 1, 0 } };
        while (!list.isEmpty() && fresh > 0) {
            int num = list.size();
            for (int i = 0; i < num; i++) {
                int[] tmp = list.poll();
                int x = tmp[0];
                int y = tmp[1];
                for (int[] dir : dirs) {
                    int nx = x + dir[0];
                    int ny = y + dir[1];
                    if (nx < m && ny < n && nx >= 0 && ny >= 0 && grid[nx][ny] == 1) {
                        fresh--;
                        grid[nx][ny] = 2;
                        list.offer(new int[] { nx, ny });
                    }
                }
            }
            minute++;
        }
        if (fresh > 0)
            return -1;
        return minute;
    }
}
