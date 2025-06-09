class Solution {
    static int searchIndex(int[] nums, int target, int index){
        if(index==nums.length) return -1;
        if(nums[index]==target){
            return index;
        }else{
            return searchIndex(nums, target, index+1);
        }
    }
    public int search(int[] nums, int target) {
        return searchIndex(nums, target, 0);
    }
}
