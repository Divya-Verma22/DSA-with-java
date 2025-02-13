package binaryalgorithmsorts;

import java.util.Arrays;

public class cyclesort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cylicsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cylicsort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                //swap
                swap(arr, i, correct);

            } else {
                i++;
            }

        }
    }
        static void swap(int[] arr , int first, int second){
            int temp  = arr[first];
            arr[first]= arr[second];
            arr[second] = temp;
        }


    }


