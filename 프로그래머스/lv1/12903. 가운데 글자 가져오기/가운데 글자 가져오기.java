class Solution {
    public String solution(String s) {
        
        int length = s.length();
        if (length % 2 == 0) {
        // 짝수 길이인 경우
        return s.substring(length / 2 - 1, length / 2 + 1);
        } else {
            // 홀수 길이인 경우
            return String.valueOf(s.charAt(length / 2));
        }
    
    }
}