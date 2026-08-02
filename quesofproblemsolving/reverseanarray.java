public class reverseanarray {
    static void getReverseArray(int[]arr){
        int size = arr.length;
        int i = 0;
        int j = size-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i=i+1;
            j=j-1;
        }
        for(int k : arr){
            System.out.print(k+" ");
        }
    }

    public static void main(){
        int[] arr = {1,2,3,4,5};
        for(int i:arr){
            System.out.println(i+" ");
        }
         getReverseArray(arr);
    }
}
