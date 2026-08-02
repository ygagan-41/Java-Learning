public class firstunsortedelement {

    static int getfirstunsorted(int[]arr){
        int size = arr.length;
        for(int i = 0 ; i<size; i++){
            if(arr[i+1]<=arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,9,5,15};
        int result = getfirstunsorted(arr);
        System.out.println(result);
    }
}
