class Solution {
    public static int help(int n, int[] dp){
        if(n<=1) return n;
        if(n==2) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = help(n-1, dp) + help(n-2, dp) + help(n-3, dp);
    }
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return help(n, dp);
    }
}
