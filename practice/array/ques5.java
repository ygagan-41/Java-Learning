package array;

//return sum of positive and negative numbers

public class ques5 {

    static int [] getposandnegsum(int[]nums){
        int size = nums.length;
        int possum = 0;
        int negsum = 0;

        for(int i=0 ; i<size ; i++){

            if(nums[i] >= 0){
                possum = possum + nums[i];
            }
            else{
                negsum = negsum + nums[i];
            }
        }
        return new int[] {possum,negsum};
    }
    public static void main(String[] args) {
        
        int [] nums = {2,-3,-1,4,6,-9,-10,-20};
        int [] result = getposandnegsum(nums);
        for(int val : result){
            System.out.println(val);
        }
    }
}
