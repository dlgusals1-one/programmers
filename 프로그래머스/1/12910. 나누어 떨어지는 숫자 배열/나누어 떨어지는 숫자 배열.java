import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int idx = 1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%divisor ==0) idx++;
        }
        if(idx != 1) idx -= 1;
        int[] answer = new int[idx];
        answer[0] = -1;
        Arrays.sort(arr);
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%divisor==0){
                answer[num] = arr[i];
                num++;
            }
        }
        return answer;
    }
}