package leetcode;

public class subsetsumproblem {
    static boolean solve(int target , int[] nums , int index){

        //base case
        if(target == 0){
            return true;
        }
        if(target < 0){
            return false;
        }
        if(index >= nums.length){
            return false;
        }

        //1 case hum solve karege baaki recursion
        
        boolean includeAns = solve(target - nums[index],nums, index+1);
        boolean excludeAns = solve(target , nums , index+1);
        return includeAns || excludeAns;
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if((sum & 1) == 1){
            return false;
        }
        int index =0;
        int target = sum /2;
        boolean ans = solve(target, nums , index);
        return ans;
    }
}
