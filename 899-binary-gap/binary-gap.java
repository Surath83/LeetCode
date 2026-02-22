class Solution {
    public int binaryGap(int n) {
        String a = Integer.toBinaryString(n);
        int max = 0;
        int z = 0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == '1'){
                z = 0;
                for(int j=i+1; j<a.length(); j++){
                    if(z == 0){
                        if(a.charAt(j) == '1'){
                        max = Math.max(max,(j-i));
                        z++;
                        }
                    }
                }
            }
        }
        return max;

    }
}