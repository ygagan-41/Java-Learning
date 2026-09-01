package leetcode;

public class subsequenceswithsumk {

    static boolean solve(int[] arr , int k , int index , int sum){
        //base case
        if(index >= arr.length){
            //subsequence is ready
            if(sum==k){
                return true;
            }
            else{
                return false;
            }
        }
        //1 case hum karege baaki recursion
        int currValue = arr[index];
        boolean excludeAns = solve(arr, k, index+1, sum);
        boolean includeAns = solve(arr, k, index+1, sum+currValue);

        //agar ek true bhi aayega to true return
        boolean finalAns = excludeAns || includeAns;
        return finalAns;
    }
    public boolean checksubsequences(int[] arr , int k){
        int index = 0;
        int sum = 0 ;
        boolean ans = solve(arr, k , index , sum);
        return ans;
    }
}
