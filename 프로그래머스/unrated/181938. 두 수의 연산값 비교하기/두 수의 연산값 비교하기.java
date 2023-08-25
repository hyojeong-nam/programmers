class Solution {
    public int solution(int a, int b) {
        
        //a+b
        int numAB=Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        
        //2*a*b
        int numResult=2*a*b;
        
        if(numAB >= numResult){
            return numAB;
        } else {
            return numResult;
        }
        
    }
}