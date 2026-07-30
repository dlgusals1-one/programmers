class Solution {
    public int[] solution(int[] arr) {
        int targetLength = 1;
        while (targetLength < arr.length) {
            targetLength *= 2;
        }
        int[] answer = new int[targetLength];
        for (int j = 0; j < arr.length; j++) {
            answer[j] = arr[j];
        }
        return answer;
    }
}