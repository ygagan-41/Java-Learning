package leetcode;

public class houserobber {
    static int solve(int[]nums , int index){

        //base case
        if(index>= nums.length){
            return 0;
        }

        //1 case in which we are on index and have two choices include and exclude 

        int includeAns = nums[index] + solve(nums,index+2);
        int excludeAns = 0 + solve(nums,index+1);
        int finalAns = Math.max(includeAns,excludeAns);
        return finalAns;
    }
    public int rob(int[] nums) {
        int index = 0;
        int ans = solve(nums,index);
        return ans;
    }
}
