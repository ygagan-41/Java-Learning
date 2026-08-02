//square of number 

package sortingalgorithms;
public class sqrtofx{
    static int getsqrt(int x){
        int start = 0;
        int end = x;
        int ans = -1;
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
        return ans;
    }

    public static void main(String[] args) {
        int x = 101;
        int result = getsqrt(x);
        System.out.println("square root of x : " + result);
    }
}
