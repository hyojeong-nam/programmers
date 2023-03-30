class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int y=12000;
        int w=2000;
        
        answer=(n*y)+(k*w)-(n/10*w);
        
        return answer;
    }
}