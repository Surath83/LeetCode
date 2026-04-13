class Solution {
    public int addDigits(int num) {
        if(num == 0 || num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 6 || num == 7 || num == 8 || num == 9){
            return num;
        }
        int[] arr = String.valueOf(num)
                     .chars()
                     .map(Character::getNumericValue)
                     .toArray();
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return addDigits(sum);
    }
}