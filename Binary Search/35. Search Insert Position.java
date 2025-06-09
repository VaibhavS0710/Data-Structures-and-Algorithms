class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int mid = s + (e-s)/2;
        if(nums[mid]==target){
            return mid;
        }
        while(s<e){
            if(target<nums[mid]){
                if(nums[s]==target){
                    return s;
                }                
            }
            s++;            
            if(target>nums[mid]){
                int start = mid+1;
                if(nums[start]==target){
                    return start;
                }
                start++;
            }            
        }
        Arrays.sort(nums);
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<target){
                count++;
            }
        }
        return count;
    }
}
