package array;
public class ques1{

    //finding the average of elements in array
    static int getavg(int [] nums){
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum = sum + nums[i];
        }
        int avg = sum/nums.length;
        return avg;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int result = getavg(nums);
        System.out.println(result);
    }
}