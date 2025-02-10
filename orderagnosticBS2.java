package binaryalgorithm;

public class orderagnosticBS2 {
    public static void main(String[] args) {
       // int[] arr = {12, 32, 45, 67, 89};
        int[] arr = {2333,232,32,3,0};
        int target=0;
      //  int target = 67;
        int ans = orderagnonisticsbs(arr, target);
        System.out.println(ans);

    }

    static int orderagnonisticsbs(int[] arr, int target) {
        int s = 0;
        int end = arr.length - 1;
        //while whather the array is in ascending or descendingg ordr
        boolean isasc = arr[s] < arr[end];
//        if (arr[s] < arr[end]) {
//            isasc = true;
//        } else {
//            isasc = false;
//        }


        while (s <= end) {
            int mid = s + (end - s) / 2;


            if (arr[mid] == target) {
                return mid;
            }

            if (isasc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    s = mid + 1;
                }

            }

        }
        return -1;
    }






    }

