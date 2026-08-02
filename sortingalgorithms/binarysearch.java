package sortingalgorithms;

public class binarysearch {
    static int BinarySearch(int [] arr,int target){
        int size = arr.length;
        int start = 0;
        int end = size-1;
        int mid = start + (end-start)/2;

        //jab tak loop me end zero se bada ho
        while(start<=end){
            //agar target mid element ke barabar ho to mid return hojaye
            if(arr[mid]==target){
                return mid;
            }
            //agar mid element target se chota ho toh right side jaao or start decide karo
            else if(arr[mid]<target){
                start=mid+1;
            }
            //agar mid element bada ho target se toh left side me jaao or end decide karo
            else{
                end=mid-1;
            }
            //or mid ko update karo
            mid = start + (end-start)/2;
        }
        //agr target not found h toh return kardo -1
        return -1;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8};
        int target = 7;
        int result = BinarySearch(arr, target);
        System.out.println("target is at index " +result);
    }
}
