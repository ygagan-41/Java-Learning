package sortingalgorithms;

public class lowerbound {
    static int getlowerbound(int[] arr , int target){
        int size = arr.length;
        int s = 0;
        int e = size-1;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid]>=target){
                //ans store
                ans = mid;
                //move to left
                e = mid-1;
            }
            else{
                //right move
                s = mid +1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr = {10,20,30,30,30,40,50};
        int target = 35;
        int ans = getlowerbound(arr,target);
        System.out.println(ans);
    }
}
