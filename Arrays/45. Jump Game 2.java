class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currEnd = 0;
        int currFar = 0;

        while(currFar<nums.length-1){
            int far = 0;
            for(int i=currEnd; i<=currFar; i++){
                far = Math.max(far, i+nums[i]);
            }
            currEnd = currFar + 1;
            currFar = far;
            jumps++;
        }
        return jumps;
    }
}
