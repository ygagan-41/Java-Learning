package array;
//shift array elements by one position
//10 20 30 40 50
//50 10 20 30 40
public class ques11 {
    static int[] solve(int [] nums){
        int size = nums.length;
        int temp = nums[size - 1];
        for(int i = size-1 ; i>0 ; i--){
            nums[i] = nums[i-1];
        }
        nums[0] = temp;

        return nums;
    }
    public static void main(String[] args) {
        int [] nums = {10,20,30,40,50,60,70};
        int [] result = solve(nums);
        for(int i:result){
            System.out.print(i + " ");
        }
    } 
}
