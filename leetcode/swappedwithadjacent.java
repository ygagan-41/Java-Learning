package leetcode;

public class swappedwithadjacent {
    
    //find an element in a nearly sorted array elements can be swapped with adjacent ones.

    public int NearlyElementSortedArray(int[] arr, int k){

        int size = arr.length;
        int start = 0;
        int end = size - 1;

        while(start<=end){
            int mid = start + ( end - start )/2;

            if(mid-1>=0 && arr[mid-1]==k)
                return mid-1;

            if(arr[mid]==k)
                return mid;

            if(mid+1<size && arr[mid+1]==k)
                return mid+1;

            if(k > arr[mid]){
                //move to right
                start = mid + 1;
            }
            else{
                //move to left
                end = mid - 1;
            }
        }
        return -1;
    }
}
