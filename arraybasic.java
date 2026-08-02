/* public class arraybasic {
    static void main(){
        int [] arr={1,2,3,4,5};
        for(int val:arr){
            System.out.println(val);
        }
    }
} */
//array input taking
import java.util.Scanner;
public class arraybasic{
    static void main(){
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[5];
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println("provide values:"+i);
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("entered values are ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);

        }
    }
}