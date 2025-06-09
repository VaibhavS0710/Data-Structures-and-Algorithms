class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        if(nums.length==0) return 0;
        int[] temp = new int[nums.length];

        Arrays.sort(nums);
        int j=0;
        for(int i=1; i<nums.length; i++){
            if(Math.abs(nums[i] - nums[i-1])==1){
                count++;
            }else if(nums[i]==nums[i-1]){
                temp[j]=count;
                j++;
                continue;
            }else{
                temp[j] = count;
                j++;
                count = 0;
            }
            if(i==nums.length-1){
                temp[j]=count;
            }
        }
        Arrays.sort(temp);
        return temp[temp.length-1]+1;
    }
}
