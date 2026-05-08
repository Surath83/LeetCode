class Solution {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            if(k==0){
                arr[i] = 0;
            }else if(k>0){
                int sum = 0;
                for(int j = 1; j <= k; j++) {
                    sum += code[(i + j) % len];
                }
                arr[i] = sum;
            }else{
                int sum = 0;
                for(int j = 1; j <= Math.abs(k); j++) {
                    int index = (i - j + len) % len;
                    sum += code[index];
                }
                arr[i] = sum;
            }
        }
        return arr;
    }
}