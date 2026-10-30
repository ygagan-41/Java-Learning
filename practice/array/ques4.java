package array;

//find max element in array

public class ques4 {
    static int getmax(int [] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++){

            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[] nums = {2,3,4,5,6,7,8,89,89,98};
        int result = getmax(nums);
        System.out.println(result);
    }
}
