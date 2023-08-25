import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        int size;
        int index=0;
        
        if(names.length%5==0){
            size = (names.length/5);
        }else {
            size = (names.length/5)+1;
        }
        
        String[] answer = new String[size];
        
        
        
        for(int i=0 ; i<names.length ; i++){
            if(i%5==0){
                answer[index]=names[i];
                index++;
            }
        }
        
        
        return answer;
    }
}