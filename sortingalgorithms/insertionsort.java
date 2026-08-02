package sortingalgorithms;

public class insertionsort {
    static void Insertionsort(int[] arr){
        int size = arr.length;
        for(int i=0; i<size ; i++){
            
            int prev=i-1;
            int currvalue = arr[i];

            while(prev>=0 && currvalue < arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = currvalue;
        }

    }
    public static void main(String[] args) {
        int [] arr = { 1,2,3,8,7,5,4};
        Insertionsort(arr);
        for(int value : arr){
            System.out.print(value + " ");
        }
    }
}
