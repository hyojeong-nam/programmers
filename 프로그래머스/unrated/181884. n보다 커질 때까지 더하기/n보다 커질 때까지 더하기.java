class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;

        // 1. 원소를 하나씩 더한다
        // 2. 근데 합(sum)이 n보다 커지면 그동안 더했던 sum을 리턴한다

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (n < sum) {
                return sum;
            }
        }
        
        return sum;
    }
}
