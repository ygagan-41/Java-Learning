package leetcode;

public class rotipratha {
    
    //roti-paratha problem
    static boolean isValidAns(int totalparathas , int cooks[] , int totalcooks , int timelimit){
        
        int 
    }

    public int mintimetocookparathas(int p , int[]cook , int n ){
        //p is no of parathas
        // n is no of cooks

        int maxranks = -1;
        for(int i=0; i<cook.length ; i++){
            if(cook[i]>maxranks){
                maxranks=cook[i];
            }
        }
        int s = 0;
        //R*(n*(n+1)/2) where r is max rank and n is no of parathas
        int e = maxranks * (p * (p+1)/2);
        int ans = -1;
        
        while (s<=e) {

            int mid = s + (e-s)/2;
            
            if(isValidAns(p,cook,n,mid)){
                //ans store
                ans = mid;
                //move to left
                e = mid -1;
            }
            else{
                //move to right
                s = mid+1;
            }
        }
        return ans;
    }
}
