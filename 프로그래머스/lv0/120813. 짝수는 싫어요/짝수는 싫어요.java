class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        int b = 0;
        for(int a = 1; a <= n; a++){
            if(a % 2 != 0){
                answer[b] = a;
                b++;
            }
        }
        return answer;
    }
}