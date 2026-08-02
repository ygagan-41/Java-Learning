package sortingalgorithms;

public class peakmountainarray {
    static int peakindexmountainarray(int[] arr){
        int size = arr.length;
        int s = 0;
        int e = size-1;
        int ans = -1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid]< arr[mid+1]){
                //main ascending order wale part me hu 
                //iska matlab main left part me hu
                //or mmujhe pta h anasweer right me h 
                //toh fatafat right part me move karo
                s=mid+1;
            }
            else{
                //arr[mid] >= arr[mid+1]
                //iska matlab main right part me hu
                //iska matlab main ek potential solution par khada hu
                ans = mid;
                //now i have to find the final solution
                //mujhe pata h right part decending order wala h
                //toh bada number agar exist krta h , toh pakka left  me hi milega 
                //left me move karo
                e=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,35,25};
        int ans = peakindexmountainarray(arr);
        System.out.println(ans);
    }
}
