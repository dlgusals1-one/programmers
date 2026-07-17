import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int num = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1]) num++;
        }
        int idx = 0;
        int[] answer = new int[arr.length-num];
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] != arr[i+1]) {
                answer[idx] = arr[i];
                idx++;
        }
        }
        answer[answer.length-1] = arr[arr.length-1];
        return answer;
    }
}