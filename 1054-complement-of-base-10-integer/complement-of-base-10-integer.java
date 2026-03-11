class Solution {
    public int bitwiseComplement(int n) {
        String a = Integer.toBinaryString(n);
        StringBuilder q = new StringBuilder();
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == '1'){
                q.append(0);
            }else{
                q.append(1);
            }
        }
        return Integer.parseInt(q.toString(),2);
    }
}