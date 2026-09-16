import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        HashMap<Integer,String> map = new HashMap<>();
        String[] arr = my_string.split("");
        int idx = 0;
        for(String i:arr){
            map.put(idx,i);
            idx++;
        }
        for(int i = 0; i < 	indices.length; i++){
            map.remove(indices[i]);
        }
        int idx2 = 0;
        while(!map.isEmpty()){
            if(map.get(idx2) != null) answer += map.get(idx2);
            map.remove(idx2);
            idx2++;
        }
        return answer;
    }
}