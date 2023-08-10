class Solution {
    public int solution(String str1, String str2) {
 
        str1.toUpperCase();
        str2.toUpperCase();
        
        if(str2.contains(str1)){
            return 1;
        } else{
            return 0;
        }
        
    }
}