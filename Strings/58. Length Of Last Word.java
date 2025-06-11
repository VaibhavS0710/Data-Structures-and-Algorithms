## Approach 1
class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = new String[]{s};
        String del = " ";
        String[] ans = s.split(del);
        
        String str = ans[ans.length-1];
        
        int a = str.length();       
        
        return a;
    }
}

## Aproach 2 [Optimal Approach]
class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)!=' '){
                count++;
            }else{
                if(count>0) return count;
            }
        }
        return count;
    }
}
