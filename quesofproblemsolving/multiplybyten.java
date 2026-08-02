public class multiplybyten {
    static int [] multipleoften( int [] arr){
        int n = arr.length;
        int newarr[] = new int[n];
        for(int i = 0; i < n ; i++){
            int element = arr[i];
            int new_element = element * 10;
            newarr[i] = new_element;
        }
        return newarr;
    }
    static void main(){
        int [] arr = {9,6,4,1};
        int [] ans  = multipleoften(arr);
        for(int i : ans){
            System.out.println("new array is : " + i);
        }
    }
}
