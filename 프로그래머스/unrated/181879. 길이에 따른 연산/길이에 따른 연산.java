class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int len = num_list.length;
        
            //11이상 합
        if(len>=11){
            
            for(int i=0 ; i<len ; i++){
               answer += num_list[i];
            }
            
            return answer;
            
            //10이하 곱
        } else if (len<=10) {
            answer = 1;
        
            for(int i=0 ; i<len ; i++){
                answer *= num_list[i];
            }
            
            return answer;
            
        }    
        return answer;
    }
}