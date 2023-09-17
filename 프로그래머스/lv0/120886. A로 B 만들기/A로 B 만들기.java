import java.util.*;
class Solution {
    public int solution(String before, String after) {
        
        char[] charArr1 = before.toCharArray();
        char[] charArr2 = after.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        String str1 = new String(charArr1);
        String str2 = new String(charArr2);
        
        if(str1.equals(str2)){
            return 1;
        } else {
            return 0;
        }
        
 
    }
}
