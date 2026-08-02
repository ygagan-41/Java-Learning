package sortingalgorithms;

public class pivotindex {
    static int getpivotindex(int[] arr){
        int size = arr.length;
        int start =  0;
        int end = size - 1;
        int ans = -1;
        if( arr[start] < arr[end]){
            //no effective rotation
            return -1;
        }
        //binary search wala logic 
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]<=arr[size-1]){
                //iska matlab hain l2 wali line par h hum
                //lekin ans toh l1 wali line par h
                //toh move to l1 or left
                end = mid-1;
            }
            else{
                //mid mera l1 wali line pe h already 
                //ans store
                ans = mid;
               // move to right
               start = mid+1;
            }
        }
        return ans;
    }
    
    //find pivot index in sorted rotated array
    public static void main(String[] args) {
        int[] arr = {50,60,70,10,20,30,40};
        int ans = getpivotindex(arr);
        System.out.println(ans);
    }
}
