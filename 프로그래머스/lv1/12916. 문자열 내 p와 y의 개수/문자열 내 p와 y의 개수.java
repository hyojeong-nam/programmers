class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String[] arr = s.toUpperCase().split("");
        int pNum = 0;
        int yNum = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("Y")){
                yNum++;
            } else if(arr[i].equals("P")){
                pNum++;
            }
        }
               
        if(yNum==pNum){
            return answer;
        } else if(yNum!=pNum){
            return false;
        } 
               
        return answer;
    }
}