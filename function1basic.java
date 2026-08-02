public class function1basic{
    static int printtable(int arr[]){
        int max=arr[0];
        int num= arr.length;
        for(int i=0;i<num;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static void main(){
        int arr[]={2,3,9,5,6};
        int result = printtable(arr);
        System.out.println(result);
    }
}