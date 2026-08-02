public class kadane {
    static int maxsubArray(int[] arr){
        int sum = 0;
        int maxsum = Integer.MIN_VALUE; //-infinty
        for(int i=0 ; i<arr.length ; i++){
            sum = sum + arr[i];
            maxsum = Math.max(maxsum, sum);
            //sum bada hone chahiye
            if(sum<0){
                sum=0;
            }
        }
        return maxsum;
    }
    public static void main(){
        int arr [] = {5,4,-1,7,8};
        int result = maxsubArray(arr);
        System.out.println(result);
    }
}
