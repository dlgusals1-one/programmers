class Solution {
    public int[] solution(int[] arr) {
        int num = 0;
        for(int i = 0; i< arr.length; i++){
            num += arr[i];
        }
        int[] answer = new int[num];
        int a = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                answer[a] = arr[i];
                a++;
            }
        }
        return answer;
    }
}