class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int a = 0;
        int b = 0;
        while(a<g.length && b<s.length){
            if(g[a] <= s[b]){
                a++;
            }
            b++;
        }
        return a;
    }
}