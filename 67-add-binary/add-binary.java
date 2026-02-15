import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger aa = new BigInteger(a,2);
        BigInteger bb = new BigInteger(b,2);
        return aa.add(bb).toString(2);
    }
}