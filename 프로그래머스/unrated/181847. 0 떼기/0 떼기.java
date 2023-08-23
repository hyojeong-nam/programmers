class Solution {
    public String solution(String n_str) {
        String answer = "";
        String strArr[] = new String[n_str.length()];
        
        //string을 string[]로 변경
        strArr=n_str.split("");
        
        for(int i=0 ; i<strArr.length ; i++){
            //strArr가 0이 아니면
            if(!strArr[i].equals("0")){
                //j부터 끝까지 answer에 문자열을 추가
                for(int j=i ; j<strArr.length ; j++){
                answer+=strArr[j];
                } 
                //한 바퀴 돌고 끝나야 하므로 break
                break;
            }     
        }
        
        return answer;
    }
}