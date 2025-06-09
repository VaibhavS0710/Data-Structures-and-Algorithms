class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int count[] = new int[nums.length];
        count[0] = nums[0];
    
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=count[j]){
                j++;
                count[j] = nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = count[i];
        }
        return j+1;
    }
}

