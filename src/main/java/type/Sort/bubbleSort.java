package main.java.type.Sort;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("排序前数组:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        bubbleSort(arr);

        System.out.println("\n排序后数组:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static int[] bubbleSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            boolean flag = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                    flag = true;
                }
            }
            if(!flag)
                break;
        }
        return arr;
    }
}
