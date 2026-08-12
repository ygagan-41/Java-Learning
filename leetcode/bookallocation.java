package leetcode;

class bookallocation{
    static boolean isValidAnswer(int arr[] , int k ,int maxpages){

        int student_count = 1;
        int pages = 0;

        for(int i=0 ; i<arr.length ; i++){

            if(pages + arr[i] <= maxpages){
                pages = pages + arr[i];
            }
            else{
                student_count++;

                if(student_count > k || arr[i]>pages){
                    return false;
                }
                else{
                    pages = 0;
                    pages = pages + arr[i];
                }
            }
        }
        return true;
    }
    public int findpages(int[] arr,int k){
        if(arr.length >= k){
            return -1;
        }

        int n = arr.length;
        int start = 1;
        int sum = 0;
        for(int i = 0 ; i<n ; i++){
            sum = sum + arr[i];
        }
        int end = sum;

        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(isValidAnswer(arr, k, mid)){
                ans = mid;
                end = mid -1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}
