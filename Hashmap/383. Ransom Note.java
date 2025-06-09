class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> m = new HashMap<>();
        for(char c: magazine.toCharArray()){
            m.put(c, m.getOrDefault(c,0)+1);
        }
        HashMap<Character, Integer> n = new HashMap<>();
        for(char c: ransomNote.toCharArray()){
            n.put(c, n.getOrDefault(c,0)+1);
        }
        for(int i=0; i<ransomNote.length(); i++){
            if(!m.containsKey(ransomNote.charAt(i))){
                return false;
            }
            if(n.get(ransomNote.charAt(i))>m.get(ransomNote.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
