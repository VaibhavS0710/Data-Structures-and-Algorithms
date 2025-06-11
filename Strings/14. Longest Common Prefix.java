class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int num = 0;
        while(num < s1.length() && num < s2.length()){
            if(s1.charAt(num)==s2.charAt(num)){
                num++;
            }else{
                break;
            }
        }
        return s1.substring(0, num);
    }
}
