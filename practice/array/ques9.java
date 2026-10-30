package array;
//reverse an array
public class ques9 {
    static int[] solve(int[] nums){
        int i = 0;
        int j = nums.length-1;
        while(i <= j){
            
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] result = solve(nums);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
