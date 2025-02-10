package binaryalgorithm;

public class bA1 {
    public static void main(String[] args) {
//        total no comprision in worst case are logN
//        k=log2n
         int[] arr ={-18,-12,-4,0,2,3,4,15,19,22,45,78};
         int target = 15;
         int ans = binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr ,int target){
        int start = 0;
                int end = arr.length-1;
                while(start<=end){
                   // int mid = (start +end)/2;
//                    start plus end might exceed the range of integer in case of large value
                   int mid = start + (end - start)/2;
                   if(target<arr[mid]){
                       end = mid -1;

                   }
                   else if(target>arr[mid]){
                       start = mid +1;
                   }
                   else {
                       //fount my answer
                       return mid;
                   }
                }
//                if nothing found mean the element  does not exist found mean not exist at all in this array
           return -1;
    }
}
