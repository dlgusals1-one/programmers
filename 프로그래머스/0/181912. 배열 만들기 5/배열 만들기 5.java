import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> num = new ArrayList<>();
        for(int i= 0; i < intStrs.length; i++){
        if(Integer.parseInt(intStrs[i].substring(s,s+l)) > k) num.add(Integer.parseInt(intStrs[i].substring(s,s+l)));
        }
        int[] answer = new int[num.size()];
        int j = 0;
        for(int i:num){
            answer[j] = i;
            j++;
        }
        return answer;
    }
}