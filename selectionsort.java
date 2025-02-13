package binaryalgorithmsorts;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
        //o(n^2)time complexity

    }
    public static void selection(int[] arr){
      for (int i = 0; i < arr.length - 1; i++) {
        int smallest = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[smallest] > arr[j]) {
                smallest = j;
            }
        }
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;

    }
}
}
