package array;

public class ques6 {
    
    static int[] solve(int [] nums){

        int zerocount = 0;
        int onecount = 0;

        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] == 0){
                zerocount++;
            }
            else{
                onecount++;
            }
        }
        return new int[]{zerocount,onecount};
    }
    public static void main(String[] args) {
        
        int [] nums = {0,0,1,1,1,1,1};
        int [] result = solve(nums);
        System.out.println("count of zero is " + result[0]);
        System.out.println("count of one is "+ result[1]);
    }
}
