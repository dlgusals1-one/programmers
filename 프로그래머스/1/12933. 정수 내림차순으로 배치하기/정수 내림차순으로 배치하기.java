import java.util.Arrays;

class Solution {
    public long solution(long n) {
        // 1. 숫자를 문자열로 변환한 뒤, 각 문자를 배열로 쪼갭니다.
        String[] strArr = Long.toString(n).split("");
        
        // 2. 오름차순으로 정렬합니다. (예: "118372" -> ["1", "1", "2", "3", "7", "8"])
        Arrays.sort(strArr);
        
        // 3. 내림차순으로 만들기 위해 뒤집어 붙일 StringBuilder를 준비합니다.
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length - 1; i >= 0; i--) {
            sb.append(strArr[i]);
        }
        
        // 4. 완성된 문자열을 다시 long 타입으로 변환하여 반환합니다.
        return Long.parseLong(sb.toString());
    }
}