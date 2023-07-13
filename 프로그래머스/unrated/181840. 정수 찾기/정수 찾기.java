import java.util.stream.*;

class Solution {
    public int solution(int[] num_list, int n) {
        
        if (IntStream.of(num_list).anyMatch(x -> x == n)) {
            return 1;      
        } else {
            return 0;      
        }        
        
    }       
}