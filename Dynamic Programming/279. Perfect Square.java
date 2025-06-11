class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        return sq(n, dp);
    }
    public static int sq(int n, int[] dp){
        int count = 1;
        while(count*count<=n){
            int sq = count*count;
            for(int i=sq; i<=n; i++){
                dp[i]=Math.min(dp[i-sq]+1,dp[i]);
            }
            count++;
        }
        return dp[n];
    }
}
