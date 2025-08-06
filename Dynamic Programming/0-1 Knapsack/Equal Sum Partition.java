class Solution {
    static boolean h(int[] arr, int s){
        int n = arr.length;
        boolean [][] t = new boolean[n+1][s+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<s+1; j++){
                if(i==0) t[i][j] = false;
                if(j==0) t[i][j] = true;
            }
        }
        for(int i=1; i<n+1; i++){
            for(int j=1; j<s+1; j++){
                if(arr[i-1]<=j){
                    t[i][j]=  t[i-1][j] || t[i-1][j-arr[i-1]];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][s];
    }
    static boolean equalPartition(int arr[]) {
        // code here
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }
        if(sum%2 != 0){
            return false;
        }else{
            return h(arr, sum/2);
        }
    }
}
