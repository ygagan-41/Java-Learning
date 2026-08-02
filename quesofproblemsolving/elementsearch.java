public class elementsearch {
    static int getelement(int [] arr){
        int target = 5;
        int n = arr.length;
        for(int i = 0;i<n; i++){
            if(arr[i] == target){
                return i;
            }
        }
         return 0;
    }
    static void main(){
        int arr[] = {1,3,2,5,7};
        System.out.println(getelement(arr));
    }
}


