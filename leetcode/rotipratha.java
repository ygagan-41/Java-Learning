package leetcode;

public class rotipratha {
    
    //roti-paratha problem
    static boolean isValidAns(int totalparathas , int cooks[] , int totalcooks , int timelimit){
        
        int parathascount = 0;
        //ab ek ek karke har loop pe jayege

        for(int i = 0; i<cooks.length ; i++){
            int currentcookrank = cooks[i];
            int timetaken = 0;
            int j =1;
            //current cook ki rank hai r 
            //1*r , 2*r , 3*r , 4*r
            //cook karna start karo
            while(timetaken <= timelimit){

                if(timetaken + j*currentcookrank <=timelimit){
                        //iska matlab hai paratha ban sakta hain
                        timetaken = timetaken + j*currentcookrank;
                        parathascount++;
                        j++;
                }
                else{
                    //iska matlab hai paratha time limit ke andar nhi ban sakta hai
                    break;
                }
            }
            //jab ye loop khtam hota hai , toh ye ith cook jitne paratha bana skta tha , unko total pratha count me add kar chuka hota hai
        }
            if(parathascount>=totalparathas){
                return true;
            }
            else{
                return false;
            }
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
