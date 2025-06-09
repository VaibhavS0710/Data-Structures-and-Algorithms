class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        HashMap<Character, Integer> ms = new HashMap<Character, Integer>();
        for(char c: s.toCharArray()){
            ms.put(c, ms.getOrDefault(c,0)+1);
        }

        HashMap<Character, Integer> mt = new HashMap<Character, Integer>();
        for(char c: t.toCharArray()){
            mt.put(c, mt.getOrDefault(c,0)+1);
        }

        for(int i=0; i<s.length(); i++){
            if(!ms.containsKey(t.charAt(i))){
                return false;
            }else{
                if(mt.get(t.charAt(i))>ms.get(t.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }
}
