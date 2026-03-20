class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        for (int i : digits) {
            list.add(i);
        }
        int i = list.size() - 1;
        while (i >= 0) {
            if (list.get(i) < 9) {
                list.set(i, list.get(i) + 1);
                break;
            } else {
                list.set(i, 0);
                i--;
            }
        }
        if (i < 0) {
            list.add(0, 1);
        }
        int[] result = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            result[j] = list.get(j);
        }
        return result;
    }
}