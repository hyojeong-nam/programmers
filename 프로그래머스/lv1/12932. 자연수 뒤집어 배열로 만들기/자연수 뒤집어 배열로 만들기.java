class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        String arr[] = str.split("");
        
        int intArr[] = new int[arr.length];
        int revArr[] = new int[intArr.length];
        
        for(int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            revArr[j] = intArr[i];
        }
        
        return revArr;
    }
}
