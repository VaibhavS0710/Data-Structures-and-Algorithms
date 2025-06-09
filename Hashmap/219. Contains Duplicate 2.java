class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<n; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }else{
                if(Math.abs(i-map.get(nums[i]))<=k){
                    return true;
                }else{
                    map.put(nums[i], i);
                }
            }
        } 
        return false;    
    }
}
