import java.util.HashMap;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 0;

        for (int in : ingredient) {
            map.put(idx, in);
            if (idx >= 3) {
                if (map.get(idx - 3) == 1 &&
                    map.get(idx - 2) == 2 &&
                    map.get(idx - 1) == 3 &&
                    map.get(idx) == 1) {

                    answer++;
                    map.remove(idx);
                    map.remove(idx - 1);
                    map.remove(idx - 2);
                    map.remove(idx - 3);
                    idx -= 4;
                }
            }
            idx++;
        }

        return answer;
    }
}