import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }
        int idx = 0;
        int idx2 = 0;
        int[] answer = new int[photo.length];
        for(int j = 0; j < photo.length;j++){
        for(String i:photo[j]){
            if(map.containsKey(i)){
                answer[idx] += map.get(i);
            }
        }
            idx++;
        }
        return answer;
    }
}