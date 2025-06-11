##Approach 1
class Solution {
    public String reverseWords(String s) {
        String[] str = new String[]{s};
        String dell = " ";
        String[] ans = s.split(dell);
        int start = 0;
        int end = ans.length-1;
        while(start<end){
            String temp = ans[start];
            ans[start] = ans[end];
            ans[end] = temp;
            start++;
            end--;
        }
        String result = String.join(dell, ans);
        String out = result.replaceAll("\\s+"," ").trim();
        return out;
    }
}

## Approach 2
  class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String out = "";
        for (int i = str.length - 1; i > 0; i--) {
            out += str[i] + " ";
        }
        return out + str[0];
    }
}
