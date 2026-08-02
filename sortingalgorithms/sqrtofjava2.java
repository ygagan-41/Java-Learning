package sortingalgorithms;

public class sqrtofjava2 {
    static int getsqrt(int x){
        int start = 0;
        int end = x;
        double ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid == x/mid){
                return mid;
            }
            else if(mid > x/mid){
                //move to left
                end = mid -1;
            }
            else{
                //mid < x/mid
                ans = mid;
                start = mid + 1;
            }
        }
        double factor = 1;
        int totalprecision = 3;
        for(int round = 1 ; round <= totalprecision ; round++){
            factor = factor/10;
            for( int i = 1 ; i <= 10 ; i++){
                double newans = ans + factor;

                if(newans * newans <= x){
                    ans = newans;
                }
                else{
                    //newans * newans > x
                    break;
                }
                   System.out.println(newans);
            }
       
        }

        return -1;
    }

    public static void main(String[] args) {
        int x = 101;
        getsqrt(x);
    }
}

