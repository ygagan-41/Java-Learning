package sortingalgorithms;

public class bubblesort {
    static void Bubblesort(int []arr){
        int size = arr.length;
        for(int i=0; i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={3,2,6,5};
        Bubblesort(arr);
        for(int value:arr){
              System.out.print(" "+value);
        }
    }
}
