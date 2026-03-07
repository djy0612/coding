package main.java.type.Sort;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("排序前数组:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        selectionSort(arr);

        System.out.println("\n排序后数组:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static int[] selectionSort(int[] arr){
        int n = arr.length;

        // 外层循环控制排序轮数（共 n-1 轮）
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // 假设当前元素是最小值

            // 内层循环查找未排序部分的最小值
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // 找到更小的值，更新最小值索引
                }
            }

            // 如果最小值索引不是当前索引，就交换
            if (minIndex != i) {
                // 交换 arr[i] 和 arr[minIndex]
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }
}
