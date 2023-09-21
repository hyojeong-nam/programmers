import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[count++] = arr[i];
            }
        }
        
        if (count == 0) {
            return new int[]{-1};
        }

        int[] result = Arrays.copyOf(answer, count);
        Arrays.sort(result);

        return result;
    }
}
