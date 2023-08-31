class Solution {
    public int[] solution(String myString) {
        
        String[] strArr = new String[myString.length()];
        
        //1. 문자열 나누기
        strArr = myString.split("x",-1);
        
        int[] answer = new int[strArr.length];
        
        //2. 각 배열의 개수마다 숫자로 바꾸기
        for(int i=0 ; i<strArr.length ; i++){
            answer[i]=strArr[i].length();
        }
        
        return answer;
    }
}