public class maxelement {
    static int getmax(int [] arr){
        int max = 0;
        int size = arr.length;
        for(int i = 0 ; i < size ; i++){
            if( max < arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    static void main(){
        int arr [] = {4,51,3,8,7};
        System.out.println(getmax(arr));
    }
}
