package leetcode;

import java.util.Arrays;

public class aggresivecows {

    static boolean isValidAns(int[] stalls , int k , int minDistance){

        int cowcount = 1;
        //first cow is placed at zero index 
        int lastposition = 0;

        for(int i =1 ; i<stalls.length; i++){

            //current cow ko current position par tabhi place kar paege jab current and prev cows ke beech ka distance 
            //>=mindistance ho

            if(stalls[i] - stalls[lastposition] >= minDistance){

                //can place safely
                cowcount++;
                //new cow place ho chuki hai iska matlab last position ko update karna padega 
                lastposition = i;

                if(cowcount == k){
                    //iska matlab saari cow placed ho chuki hai

                    return true;
                }
            }
        }
        return false;
    }

    public int aggresivescows(int[] stalls,int k){

        Arrays.sort(stalls);
        int n = stalls.length;
        int s = 0;
        int e = stalls[n-1] - stalls[0];
        int ans = -1;

        while(s<=e){

            int mid = e + (s-e)/2;
    
            if(isValidAns(stalls,k,mid)){
                //possible solution milgya h to ans store hoga and move to right hoga 
                ans = mid;
                s = mid+1;
            }
            else{
                //agar mid ke saath there is no possible solution arrangement to place cows toh move to left
                e = mid -1;
            }
        }
        return ans;
    }
}
