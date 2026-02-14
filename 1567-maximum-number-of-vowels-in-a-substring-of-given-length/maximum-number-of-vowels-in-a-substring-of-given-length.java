class Solution {
    public boolean isVowel(char a){
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int n = s.length();
        if(n == 0 || k == 0) return 0;
        if(k > n) return 0;
        s = s.toLowerCase();
        Queue<Character> q = new ArrayDeque<>(k);
        int v = 0;
        for(int i=0; i<k; i++){
            q.add(s.charAt(i));
            if(isVowel(s.charAt(i))){
                v++;
            }
        }
        int max = v;
        for(int i=k; i<n; i++){
            if(isVowel(q.remove())){
                v--;
            }
            q.add(s.charAt(i));
            if(isVowel(s.charAt(i))){
                v++;
            }
            max = Math.max(v,max);
        }
        return max;
    }
}