package leetcode;

public class coinschange2 {
    static int solve(int amount, int[] coins, int index){
        //base case
        if(amount == 0){
            return 1;
        }
        if(amount < 0){
            return 0;
        }
        if(index >= coins.length){
            return 0;
        }

        //1 case hum baaki recursion
        int includeans = solve(amount-coins[index],coins,index);
        int excludeans = solve(amount,coins,index+1);
        int finalans = includeans + excludeans;
        return finalans;
    }
    public int change(int amount, int[] coins) {
        int index = 0;
        int ans = solve(amount,coins,index);
        return ans;
    }
}
