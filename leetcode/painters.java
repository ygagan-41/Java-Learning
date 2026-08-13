package leetcode;

public class painters {
    
    public int mintime(int[] boards,int k){
        int sum= 0;
        for(int i=0; i<boards.length; i++){
            sum=sum+boards[i];
        }
        int ans = -1;
        int s =0;
        int e = sum;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(isValidSolution(mid,k,boards)){
                ans = mid;
                e = mid-1;
            }
            else{
                //not valid
                s = mid+1;
            }
        }
        return ans;
    }
}
