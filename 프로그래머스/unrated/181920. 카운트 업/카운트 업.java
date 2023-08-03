class Solution {
    public int[] solution(int start, int end) {
        
        //answer는 [8]이 됨
        int[] answer = new int[end-start+1];
        
        //int i는 0부터 시작, 8까지 1 증가함
        //i에 start를 넣고 start 1 증가시킴
        for(int i = 0 ; i<answer.length ; i++){
            answer[i] += start;
            start++;
        }
        
        return answer;
    }
}