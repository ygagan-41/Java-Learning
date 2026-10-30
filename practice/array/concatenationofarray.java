package array;

public class concatenationofarray {

    static int[] solve(int[] nums) {
        
        int n  = nums.length;
        int [] arr = new int[n*2];

        for(int i=0 ; i<arr.length; i++){
            arr[i] = nums[i % n];
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,1};
        int [] result = solve(nums);
        for(int i : result){
            System.out.println(i);
        }
    }
}

