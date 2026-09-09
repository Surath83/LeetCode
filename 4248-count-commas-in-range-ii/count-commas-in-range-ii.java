class Solution {
    public long countCommas(long n) {
        long totalCommas = 0;
        long factor = 1000;
        while (n >= factor) {
            totalCommas += (n - factor + 1);
            factor *= 1000;
        }
        return totalCommas;
    }
}