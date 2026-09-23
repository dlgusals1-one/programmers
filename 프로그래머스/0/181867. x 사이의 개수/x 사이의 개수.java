import java.util.*;
class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x");
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(i,arr[i].length());
        }
        if(myString.charAt(myString.length()-1) == 'x'){
            map.put(arr.length,0);
        }
        int[] answer = new int[map.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = map.get(i);
        }
        return answer;
    }
}