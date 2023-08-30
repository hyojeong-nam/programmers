import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        
        String newStr = my_string.replaceAll("[^0-9]", "");
        int[] answer = new int[newStr.length()];
        
        for (int i = 0; i < newStr.length(); i++) {
        answer[i] = newStr.charAt(i) - '0';
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}