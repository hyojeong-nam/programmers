class Solution {
    public String solution(String myString) {
        String answer = "";
        char l = 'l';
        char[] cArr = myString.toCharArray();
        
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] < l) {
                cArr[i] = l;
            }
        }
        
        answer = new String(cArr);
        return answer;
        
    }
}