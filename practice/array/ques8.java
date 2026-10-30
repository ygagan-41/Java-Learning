package array;
//two sum
public class ques8 {
    static int[] gettwosum(int [] arr, int target){

        for(int i=0; i<=arr.length ; i++){
            for(int j=i+1; j<=arr.length-1 ; j++){
                if(arr[i] + arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        
        int [] arr = {2,7,11,15};
        int target = 18;

        int [] ans = gettwosum(arr, target);

        for(int val : ans){
            System.out.println(val);
        }
    }
}
