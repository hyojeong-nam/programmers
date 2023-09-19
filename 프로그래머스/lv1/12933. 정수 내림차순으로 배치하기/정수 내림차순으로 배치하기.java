import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] strArr = Long.toString(n).split("");
        int[] arr = new int[strArr.length];
        
        //String배열을 int배열로 만들어서 값 넣기
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(strArr[i]);
        }
        
        //내림차순
         for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        //int 배열을 String 문자열로 변환
        String str = Arrays.toString(arr).replaceAll("[^0-9]", "");
        
        //String 문자열을 long 타입으로 변환
        answer = Long.parseLong(str);
        
        return answer;
    }
}