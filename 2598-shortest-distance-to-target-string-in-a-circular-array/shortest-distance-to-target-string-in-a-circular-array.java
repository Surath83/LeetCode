class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<words.length; i++){
            if (words[i].equals(target)) {
                int direct = Math.abs(startIndex - i);
                int circular = words.length - direct;
                min = Math.min(min, Math.min(direct, circular));
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}