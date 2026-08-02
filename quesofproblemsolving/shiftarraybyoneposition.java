public class shiftarraybyoneposition {
    static void getShiftElementbyoneposition(int[] arr){
        int size = arr.length;
        int temp = arr[size-1];
        for(int i = size-1 ; i > 0 ; i--){
            arr[i]=arr[i-1];
        }
       arr[0]=temp;
    }
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        getShiftElementbyoneposition(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
