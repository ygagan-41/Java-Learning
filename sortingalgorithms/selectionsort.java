package sortingalgorithms;

public class selectionsort{
    static void Selectionsort(int [] arr){
        int size = arr.length;
        for(int i=0 ; i<size-1 ; i++){
            int minindex = i;
            for(int j =i+1 ; j<size ; j++){
                if(arr[j]<arr[minindex]){
                    minindex = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
    }
    public static void main(String[] args) {
        int [] arr = { 1,2,3,8,7,5,4};
        Selectionsort(arr);
        for(int value : arr){
            System.out.print(value + " ");
        }
    }
}
     