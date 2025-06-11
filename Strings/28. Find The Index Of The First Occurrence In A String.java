class Solution {
    public int strStr(String haystack, String needle) {
        int found = haystack.indexOf(needle);
        if(found != -1){
            return found;
        }
        return -1;
    }
}
