class Solution {
    public int solution(int num, int k) {
        
        String sNum=Integer.toString(num);
        String sK=Integer.toString(k);
        int answer = 0;
        
        if(sNum.indexOf(sK)== -1){
            answer= -1;
            
        } else {
            answer=sNum.indexOf(sK)+1;
        }
    
        return answer;
    }
}