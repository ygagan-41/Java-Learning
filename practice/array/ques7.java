package array;
//find first unsorted element in array
public class ques7 {
    static int solve(int[] arr){

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] >= arr[i+1]){
                return arr[i+1];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,9,15,14,13,12,11};
        System.out.println("the first unsorted element is :" + solve(arr));
    }
}
