package leetcode;

import java.util.ArrayList;
import java.util.List;
class subset1 {
    static void solve(int[]nums , int index , List<Integer> output,List<List<Integer>> ans){
        //base case
        //subsequnece ready hai
        if(index >= nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        //1 case hum baaki recursion
        //include and exclude pattern 
        int CurrValue = nums[index];

        //include
        output.add(CurrValue);
        solve(nums, index+1, output, ans);

        //backtracking
        //output vesa hi kardo jese vo pehle tha yaani empty or null
        output.remove(output.size()-1);

        //exclude
        solve(nums, index+1, output, ans);
    }
    public List<List<Integer>> Subsets(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums,index,output,ans);
        return ans;
    }
}
