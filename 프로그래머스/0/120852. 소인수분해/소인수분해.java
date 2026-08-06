import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new LinkedHashSet<>();
        
        // 2부터 시작하여 n을 나눌 수 있는 가장 작은 소수로 계속 나눕니다.
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                set.add(i); // 소인수 추가 (Set이라 중복은 자동으로 제거됨)
                n /= i;
            }
        }
        
        // Set을 int 배열로 변환하여 반환
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}