package leetcode;

public class jumpgame {
     static boolean solve(int[] nums , int index){
        //base case
        //we reached destination
        if( index == nums.length -1){
            return true;
        }
        //destination se bahar nikal gye
        if(index >= nums.length){
            return false;
        }
        //stuck at zero or any position
        if(nums[index] == 0){
            return false;
        }

        //ab ek case hum solve kareg baaki recursion

        int jumpValue = nums[index];
        boolean OverallAns = false;
        for(int jump = 1 ; jump <= jumpValue ; jump++){
            boolean recAns = solve(nums , index+jump);
            OverallAns =  OverallAns || recAns;
        }
        return OverallAns;
    }
    public boolean canJump(int[] nums) {
        int index = 0;
        boolean ans = solve(nums , index);
        return ans;
    }
}
