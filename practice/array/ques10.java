package array;

//swap alternate in arrays
//1,2,3,4,5,6
//2,1,4,3,6,5

public class ques10{
    static int[] solve(int [] arr){

        for(int i=0 ; i<arr.length ; i=i+2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        return arr;
    }
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};

        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        int [] ans = solve(arr);

        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}