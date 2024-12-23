class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] maxleft = new int[n];
        int[] maxright = new int[n];
        int sum = 0;

        int left = height[0];
        int right = 0;

        maxleft[0] = left;
        maxright[n - 1] = right;
        for (int i = 1; i < n; i++) {
            maxleft[i] = left;
            left = Math.max(left, height[i]);
        }
        for (int j = n - 1; j >= 0; j--) {
            maxright[j] = right;
            right = Math.max(right, height[j]);
        }
        for (int k = 0; k < n; k++) {
            if ((Math.min(maxleft[k], maxright[k]) - height[k]) >= 0) {
                sum = sum + Math.min(maxleft[k], maxright[k]) - height[k];
            }
        }
        return sum;
    }
}
