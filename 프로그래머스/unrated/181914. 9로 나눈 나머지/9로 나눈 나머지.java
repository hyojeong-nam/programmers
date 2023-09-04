import java.math.BigInteger;

class Solution {
    public int solution(String number) {
        BigInteger bigInteger = new BigInteger(number);
        BigInteger nine = new BigInteger("9");
        BigInteger result = bigInteger.mod(nine);
        return result.intValue();
    }
}
