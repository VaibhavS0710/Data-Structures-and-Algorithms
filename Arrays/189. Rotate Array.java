class Solution {
    public static void reverse(int[] nums, int i, int j){
        int l = i;
        int r = j;

        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;

            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k<0){
            k = k + nums.length;
        }
        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }
}
