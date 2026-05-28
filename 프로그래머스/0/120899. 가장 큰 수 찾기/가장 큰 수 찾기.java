class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int a = 0;
        int b = 0;
            for (int l = 0; l < array.length; l++){
                if(array[l] >= a){
                    a = array[l];
                    b = l;
                }
            }
        answer[0] = a;
            answer[1] = b;
        return answer;
    }
}