class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(pattern.length()!=str.length) return false;
        HashMap<Character, String> map = new HashMap<Character, String>();
        for(int i=0; i<str.length; i++){
            if(map.containsKey(pattern.charAt(i))){
                if(map.get(pattern.charAt(i)).equals(str[i])){
                    continue;
                }else{
                    return false;
                }
            }else{
                if(!map.containsValue(str[i])){
                    map.put(pattern.charAt(i), str[i]);
                }else{
                        return false;
                }
            }
        }
        return true;
    }
}
