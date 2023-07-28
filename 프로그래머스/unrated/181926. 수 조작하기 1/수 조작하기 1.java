class Solution {
    public int solution(int n, String control) {

        //string의 length에는 괄호 필수
        for(int i = 0 ; i<control.length() ; i++){
            switch(control.charAt(i)){
                case 'w' : n += 1; break;
                case 's' : n += -1; break;
                case 'd' : n += 10; break;
                case 'a' : n += -10; break;
            }
        }
        return n;
    }
}