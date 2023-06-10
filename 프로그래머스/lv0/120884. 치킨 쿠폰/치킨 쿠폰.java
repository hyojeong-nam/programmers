class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int newC = chicken;
        int remain = 0;
        
        while (newC+remain >= 10){
            int temp1 = (newC + remain) / 10;
            int temp2 = (newC + remain) % 10;
            
            newC = temp1;
            remain = temp2;
            answer += newC;
            
        }
        
        return answer;
    }
}