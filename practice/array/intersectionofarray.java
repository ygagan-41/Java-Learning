package array;

import java.util.HashSet;
import java.util.Set;

public class intersectionofarray {

    static int[] solve(int[]arr1 , int[]arr2){

        //to solve this question hashset is the optimal approach
        Set<Integer>set1 = new HashSet<>();
        Set<Integer>result = new HashSet<>();

        //array arr1 me jaake set1 hashset me daaldo and
        for(int num : arr1){
            set1.add(num);
        }

        //arr2 ki values ko set1 ke values se check karlo
        for(int num : arr2){
            if(set1.contains(num)){
                result.add(num);
            }
        }
        
        //now convert result hashset into array

        int [] ans = new int[result.size()];

        int i=0;

        for(int num : result){
            ans[i++] = num;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,8,1};
        int [] arr2 = {2,5,6,7,8};

        int [] result = solve(arr1, arr2);

        for(int val : result){
            System.out.println(val);
        }

    }
}
