import java.math.BigInteger;
class Solution{
    public int numSteps(String s){
        BigInteger n = new BigInteger(s, 2);
        int ans = 0;
        while(!n.equals(BigInteger.ONE)){
            if(n.mod(BigInteger.TWO).equals(BigInteger.ZERO)){
                n = n.divide(BigInteger.TWO);
            } 
            else{
                n = n.add(BigInteger.ONE);
            }
            ans++;
        }
        return ans;
    }
}