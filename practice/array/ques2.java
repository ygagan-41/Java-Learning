package array;
//multiply each element of array by 10

public class ques2 {

    static int[] solve(int [] nums){

        int size = nums.length;
        for(int i=0; i<size ; i++){
            nums[i] = nums[i] * 10;
        }
        return nums;
    }
    public static void main(String[] args) {
        
        int [] nums = {1,2,3,4,5,4,3,3};
        int [] result = solve(nums);

        for(int val : result){
            System.out.println(val);
        }
    }
}
