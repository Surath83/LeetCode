class Solution {
    public int hammingWeight(int n) {
        String a = Integer.toBinaryString(n);
        int sum = 0;
        for(int i=0; i<a.length(); i++){
            sum += a.charAt(i) -'0';
        }
        return sum;
    }
}