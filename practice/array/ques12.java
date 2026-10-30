package array;
//print extreme elements in an alternate manner
//1 2 3 4 5
//1 5 2 4 3
public class ques12 {
    static void alternate(int [] arr){
        int size = arr.length;
        int i = 0;
        int j = size - 1;

        while(i <= j){
            if(i == j){
                System.out.println(arr[i]);
                return;
            }
            else{
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
    }
    
    static void main(){
        int arr[] = {1,2,3,4,5,6};
        alternate(arr);
    }
}
