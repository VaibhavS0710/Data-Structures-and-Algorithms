class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        int n = nums.length;
        double sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        double maxSum = sum;
        for(int i=k; i<n; i++){
            maxSum += nums[i] - nums[i-k];
            sum = Math.max(sum, maxSum);
        }
        avg = sum/k;
        return avg;
    }
}
