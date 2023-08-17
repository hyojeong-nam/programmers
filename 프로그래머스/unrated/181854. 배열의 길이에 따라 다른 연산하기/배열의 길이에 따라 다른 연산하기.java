class Solution {
    public int[] solution(int[] arr, int n) {
        int len=arr.length;
        int i=0;
        
        //arr길이=홀수 , 짝수 인덱스 위치에 n을 더한 배열
        if(len%2!=0){
            for(i=0;i<len;i++){
                if(i%2==0){
                    arr[i]+=n;
                }
                
            }
            return arr;
        //arr길이=짝수 홀수 인덱스 위치에 n를 더한 배열
        } else if(len%2==0){
            for(i=0;i<len;i++){
                if(i%2!=0){
                    arr[i]+=n;
                }
            }
            return arr;
        }
        
        return arr;
    }
}