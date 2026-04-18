class Solution {
    public int mirrorDistance(int n) {
        StringBuilder str = new StringBuilder(Integer.toString(n));
        return Math.abs(Integer.parseInt(str.reverse().toString())-n);
    }
}