class coinchange {
    static int solve(int[] coins , int amount){

        //base case
        if(amount == 0){
            return 0;
        }
        if(amount<0){
            return Integer.MAX_VALUE;
        }
        int mini = Integer.MAX_VALUE;

        for(int coin : coins){
              if(coin < amount){
               return -1;
              }
            int recursionsans = solve(coins,amount-coin);

            if(recursionsans == Integer.MAX_VALUE){
                continue;
            }
            else{
                int totalcoinsused = recursionsans +1;
                mini = Math.min(mini,totalcoinsused);
            }
        }
        return mini;
    }
    public int coinChange(int[] coins, int amount) {
        int ans = solve(coins, amount);
        return ans;
    }
}
