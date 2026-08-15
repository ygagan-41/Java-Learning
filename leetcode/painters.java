package leetcode;

class painters {

    static boolean isValidSolution(int boards[] , int k ,int mid){
        int paintercount = 1;
        int painterlength = 0;
        int maxlength = mid;

        for(int i=0; i<boards.length; i++){
            if(painterlength+boards[i]<=maxlength){
                painterlength = painterlength + boards[i];
            }
            else{
                paintercount++;
                painterlength=0;

                if(paintercount > k || boards[i] > maxlength){
                    return false;
                }
                else{
                    painterlength = painterlength + boards[i];
                }
            }
        }
        return true;
    }
    
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

            if(isValidSolution(boards,k,mid)){
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
