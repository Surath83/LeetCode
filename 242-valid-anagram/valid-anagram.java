class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null) return false;
        HashMap<Character, Integer> s1 = new HashMap<>();
        HashMap<Character, Integer> s2 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            Character a = s.charAt(i);
            s1.put(a, s1.getOrDefault(a,0)+1);
        }
        for(int j=0; j<t.length(); j++){
            Character b = t.charAt(j);
            s2.put(b, s2.getOrDefault(b,0)+1);
        }
        return s1.equals(s2);
    }
}