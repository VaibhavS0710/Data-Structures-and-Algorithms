class Solution {
    public int climbStairs(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return help(n, map);
    } 
    public static int help(int n, HashMap<Integer, Integer> map){

        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n==0){
            return 1;
        }
        if(n<0) return 0;

        int left = help(n-1, map);
        int right = help(n-2, map);
        map.put(n, left+right);
        return left+right; 
    }
}
