package binaryalgorithm;

public class CEILINGBINARYALGO{
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 19;
        int ans = ceiling(arr,target);
        System.out.println(ans);
        //ceiling smalles no. greater >= target
        //target is 9 then14 is answer
        
    }
    static int ceiling(int[]  arr,int target){
        //if target greater than the last element of the arry then
        if (target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else {
                start =mid +1;
            }

        }
        return start;


    }
}
