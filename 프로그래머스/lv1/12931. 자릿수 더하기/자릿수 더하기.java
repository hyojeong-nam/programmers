import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String numberS = String.valueOf(n);

        String[] arr = numberS.split("(?<=.)");

        for(int i = 0; i < arr.length; i++) {
            int num= Integer.parseInt(arr[i]);
            answer += num;
        }

        return answer;
    }
}