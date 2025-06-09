class Solution {
    public int removeDuplicates(int[] nums) {
        int num = nums[0];
       int j = 0;
       int count = 0;
       for(int i = 0; i<nums.length; i++){
        if(nums[i] == num && count<2){
            count++;
            nums[j] = nums[i];
            j++;           
        }else if(nums[i]!=num){
            num = nums[i];
            count = 1;
            nums[j] = nums[i];
            j++;
        }
        
       }
       return j;
    }
}
