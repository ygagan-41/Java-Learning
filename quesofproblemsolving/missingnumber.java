import java.util.ArrayList;
import java.util.List;

public class missingnumber {
    static List<Integer> disappearnumber(int[] arr){
        
        List<Integer> ans = new ArrayList<>();

        //marking
        int n = arr.length;
        for(int i=0;i<n;i++){
            int value = Math.abs(arr[i]);
            int position = value - 1;
            

        //mark kardo ye position 
        if(arr[position]>0){
            arr[position] = -arr[position];
        }
        }

        //travel array whnever you encounter an postive value 
        // , print the number at the same time 

        for(int i=0; i<n;i++){
            if(arr[i]>0){
                int values = i+1;
                ans.add(values);
            }
        }
        return ans;

    }
    public static void main(){
        int[]arr = {1,4,4,5,2,2};
        List<Integer> result = disappearnumber(arr);
       
            System.out.println(result);
        
    }
}
