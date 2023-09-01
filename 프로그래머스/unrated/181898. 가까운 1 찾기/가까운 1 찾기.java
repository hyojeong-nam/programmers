import java.util.*;

class Solution {
    public int solution(int[] arr, int idx) {
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;  // 1이 발견된 경우 해당 인덱스 반환
            }
        }
        
        return -1; // 1이 발견되지 않은 경우 -1 반환
    }
}
