package array;

public class ques3 {

    //search for an element in an array

    static int solve(int [] nums, int target){
        int size = nums.length;
        for(int i=0 ; i<size ; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int[] nums = {2,3,4,5,6,7,8};
        int target = 5;

        int result = solve(nums,target);

        System.out.println(result);
    }
}
