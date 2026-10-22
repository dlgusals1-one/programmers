// import java.util.*;
// class Solution {
//     public int solution(int[] array) {
//         int answer = -1;
//         int max = 0; 
//         Arrays.sort(array);
//         HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
//         for(int i = 0; i < array[array.length-1]; i++){
//             list.put(i,1);
//         }
//         for(int i = 0; i < array[array.length-1]; i++){
//             list.put(array[i],list.get(array[i])+1); 
//         }
//         for(int i = 0; i < array[array.length-1]; i++){
//             if(max < list.get(i)) {
//                 max = list.get(i);
//             }
//         }
//         int count = 0;
//         for(int i = 0; i < array[array.length-1]; i++){
//             if(max == list.get(i)) {
//                count++;
//             }
//         }
//         if(count != 1) answer = max;
//         else answer = -1;
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public int solution(int[] array) {
        // 1. 각 숫자의 빈도수 세기
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0; // 가장 높은 빈도수
        int answer = -1;  // 최빈값 숫자

        // 2. 최빈값 찾기 및 중복 여부 체크
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                answer = num; // 새로운 최빈값 업데이트
            } else if (count == maxCount) {
                answer = -1;  // 최빈값이 여러 개면 -1
            }
        }

        return answer;
    }
}