package sortingalgorithms;

public class noofoccurence {

      static int getlowerbound(int[] arr, int target){
    int s = 0;
    int e = arr.length - 1;
    int ans = arr.length;

    while(s <= e){
        int mid = s + (e - s) / 2;

        if(arr[mid] >= target){
            ans = mid;
            e = mid - 1;
        }else{
            s = mid + 1;
        }
    }
    return ans;
}

static int getupperbound(int[] arr, int target){
    int s = 0;
    int e = arr.length - 1;
    int ans = arr.length;

    while(s <= e){
        int mid = s + (e - s) / 2;

        if(arr[mid] > target){
            ans = mid;
            e = mid - 1;
        }else{
            s = mid + 1;
        }
    }
    return ans;
}

static int countfreq(int[] arr, int target){
    int lower = getlowerbound(arr, target);
    int upper = getupperbound(arr, target);
    return upper - lower;
}

public static void main(String[] args) {
        int[] arr = {1,2,5,5,5,5,6,9};
        int target = 5;
        int ans = countfreq(arr,target);
        System.out.println(ans);
    }
}
