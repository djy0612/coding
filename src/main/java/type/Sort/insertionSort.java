package main.java.type.Sort;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11};

        System.out.println("排序前数组:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        insertionSort(arr);

        System.out.println("\n排序后数组:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // 从第二个元素开始（第一个元素默认已排序）
        for (int i = 1; i < n; i++) {
            int key = arr[i];      // 要插入的元素
            int j = i - 1;

            // 将比 key 大的元素向后移动一位，直到找到插入位置
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // 插入 key 到正确位置
            arr[j + 1] = key;
        }
    }
}
