package array;

import java.util.HashMap;
import java.util.Map;

public class modeofarray{
    static int modeofanarray(int[] arr){

        Map<Integer,Integer> freq = new HashMap<>();

        for(int num:arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxfreq = -1;
        int maxfreqkey = -1;

        for(int key: freq.keySet()){

            int currentkey = key;
            int currentkeykifrequency = freq.get(key);

            if(currentkeykifrequency > maxfreq){
                maxfreq = currentkeykifrequency;
                maxfreqkey = currentkey;
            }
        }
        return maxfreqkey;
    }
    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9,9,9,2,5};
        int ans = modeofanarray(arr);
        System.out.println(ans);
    }
}