import java.util.Arrays;
class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        //String 숫자를 int 배열로 만들기
        int[] newArr = new int[num_str.length()];
        for (int i = 0 ; i < num_str.length() ; i++){
            newArr[i] = num_str.charAt(i) - '0';
        }
        
        //합 더하기
        for (int i = 0 ; i<newArr.length ; i++){
            answer+=newArr[i];
        }

        return answer;
    }
}