public class findposnnegsum {
    static int[] getposandnegsum(int[] arr){
        int n = arr.length;
        int pos_sum = 0;
        int neg_sum = 0;
        for(int i=0 ; i<n ; i++){
            if(arr[i]>0){
                pos_sum = pos_sum + arr[i];  //12
            }
            else{
                neg_sum = neg_sum + arr[i];  //-9
            }
        }
        int[] ans = {pos_sum , neg_sum};
        return ans;
    }
    static void main(){
        int[]arr = {1,-3,5,-5,6,-1};
        int[] result = getposandnegsum(arr);
        System.out.println(result[0]);  
        System.out.println(result[1]);
    }
}
//count no. of zeores and ones 
//find unsorted elements