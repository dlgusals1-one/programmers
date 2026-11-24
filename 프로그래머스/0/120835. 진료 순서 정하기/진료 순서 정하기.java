import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Arrays.fill(answer,1);
        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < answer.length; j++){
                if(emergency[i] < emergency[j]) answer[i]++;
            }
        }
        return answer;
    }
}