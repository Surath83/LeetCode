class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m = flowerbed.length;
        int[] str = new int[m];
        for(int i=0 ; i<m; i++){
            str[i]=flowerbed[i];
        }
        for(int i = 0; i<m; i++){
            if(i-1 > -1 && flowerbed[i-1]==1){
                str[i]=1;
            }
            if(i+1 < m && flowerbed[i+1]==1){
                str[i]=1;
            }
        }
        for(int i=0; i<m; i++){
            if(str[i]==0 && n>0){
                flowerbed[i]=1;
                n--;
                if(i-1 > -1){
                    str[i-1] = 1;
                }
                if(i+1 < m){
                    str[i+1] = 1;
                }
            }
        }
        System.out.print(Arrays.toString(str));
        if(n != 0)
            return false;
        return true;
    }
}