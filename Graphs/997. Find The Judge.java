class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] count = new int[n+1];
        int e = trust.length;
        for(int i=0; i<e; i++){
            int s = trust[i][0];
            int d = trust[i][1];
            count[s]--;
            count[d]++;
        }
        for(int i=0; i<n+1; i++){
            if(count[i]==n-1) return i;
        }
        return -1;
    }
}
