class Solution {
    public String convert(String s, int numRows) {
        String[] ans = new String[numRows];
        for(int i = 0; i<numRows; i++){
            ans[i] = "";
        }
        int i = 0;
        while(i<s.length()){
            for(int j = 0; j<numRows && i<s.length(); j++){
                ans[j] += s.charAt(i++);
            }
            for(int j = numRows-2; j>0 && i<s.length(); j--){
                ans[j] += s.charAt(i++);
            }
        }
        String result = "";
        for(String str : ans){
            result += str;
        }
        return result;
    }
}
