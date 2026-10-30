package array;

import java.util.HashMap;

public class firstrepeatingelement {
    static int solve(int [] arr){

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num:arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for(int i : arr){
            if(freq.get(i) > 1){
               return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {10,5,2,3,4,5,4};
        System.out.println(solve(arr));
    }
}
