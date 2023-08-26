import java.util.*;

class Solution {
    public List solution(int[] arr, int[] delete_list) {
        
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        //answer에 arr 값 담기
        for(int i : arr){
            answer.add(i);
        }
        
        //answer의 원소 중 delete list에 포함되는 원소가 있다면 answer의 원소 삭제
        for(int j : delete_list){
            if(answer.contains(j)){
                answer.remove(Integer.valueOf(j));
            }
        }
        
        
        return answer;
    }
}
