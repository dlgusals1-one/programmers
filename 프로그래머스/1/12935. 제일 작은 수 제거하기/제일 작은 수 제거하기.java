class Solution {
    public int[] solution(int[] arr) {
        // 배열 길이가 1이면 -1을 담아 바로 반환
        if (arr.length <= 1) {
            return new int[]{-1};
        }

        // 1. 최소값 찾기
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // 2. 최소값을 제외한 새 배열 생성
        int[] answer = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            }
            answer[index++] = arr[i];
        }

        return answer;
    }
}