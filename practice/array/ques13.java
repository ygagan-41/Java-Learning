package array;

import java.util.HashMap;
import java.util.Map;

//find an elements which have highest and lowest frequency

public class ques13 {
    static int[] solve(int [] arr){

        Map<Integer,Integer> table = new HashMap<>();

        for(int num:arr){
            table.put(num, table.getOrDefault(num,0) + 1);
        }

        //max freq ke liye 
        int maxfreq = Integer.MIN_VALUE;
        int maxfreqkey = -1;

        for(int key : table.keySet()){
            int currentkey = key;
            int currentkeykifrequency = table.get(key);

            if(currentkeykifrequency > maxfreq){
                maxfreq = currentkeykifrequency;
                maxfreqkey = currentkey;
            }
        }

        //low freq ke liye
        int lowfreq = Integer.MAX_VALUE;
        int lowfreqkey = -1;

        for(int key : table.keySet()){
            int currentkey = key;
            int currentkeykifrequency = table.get(key);

            if(currentkeykifrequency < lowfreq){
                lowfreq = currentkeykifrequency;
                lowfreqkey = currentkey;
            }
        }

        return new int[]{maxfreqkey,lowfreqkey};
    }
    public static void main(String[] args) {
        
        int [] arr = {2,2,2,2,4,3,4,3,4,4,1,4,1,4,1};
        int [] result = solve(arr);
        for(int i : result){
            System.out.println(i);
        }
    }
}
